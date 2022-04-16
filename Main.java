import java.util.Scanner;
import java.util.Random;

public class Main {

	public static char[][] map;
	public static final int SIZE = 3;
	public static final int DOTS_TO_WIN = 3;
	public static final char DOT_EMPTY = '•';
	public static final char DOT_X = 'X';
	public static final char DOT_O = 'O';
	public static Scanner sc = new Scanner(System.in);
	public static Random rand = new Random();

	public static void main(String[] args) {
		createmap();
		printmap();
		while (true) {
			humanTurn();
			printmap();
			if (checkWin(DOT_X)) {
				System.out.println("Победил человек");
				break;
			}
			if (isMapFull()) {
				System.out.println("Ничья");
				break;
			}
			aiTurn();
			printmap();
			if (checkWin(DOT_O)) {
				System.out.println("Победил Искуственный Интеллект");
				break;
			}
			if (isMapFull()) {
				System.out.println("Ничья");
				break;
			}
		}
		System.out.println("Игра закончена");
	}
	

	public static boolean checkWin(char symb) {
			boolean cols, rows;
			for (int col=0; col<3; col++) {
				cols = true;
				rows = true;
				for (int row=0; row<3; row++) {
					cols &= (map[col][row] == symb);
					rows &= (map[row][col] == symb);
				}
				if (cols || rows) return true; 
			}
				
			return false; 
		}
	

	public static void aiTurn() {
		int x, y;
		do {
			x = rand.nextInt(SIZE);
			y = rand.nextInt(SIZE);
		} while (!isCellValid(x, y));
		System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
		map[x][y] = DOT_O;
	}

	public static void humanTurn() {
		int x, y;
		do {
			System.out.println("Введите координаты в формате X Y");
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
		} while (!isCellValid(x, y));
		map[x][y] = DOT_X;
	}

	public static boolean isCellValid(int x, int y) {
		if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
		if (map[x][y] == DOT_EMPTY) return true;
		return false;
	}


	public static  void createmap(){
		map = new char[SIZE][SIZE];
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				map[i][j] = DOT_EMPTY;
			}
		}

	}

	public static  void  printmap(){
		for (int i = 0; i <= SIZE; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < SIZE; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < SIZE; j++) {
				System.out.print(map[i][j]  + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean isMapFull() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (map[i][j] == DOT_EMPTY) return false;
			}
		}
		return true;
	}



}




