import java.util.Arrays;
import java.util.Random;

public class main {

	public static void main(String args[]) {
		task1(); 
		task2(); 
		task3();
		task4();
	}


	public static void task1() {
		System.out.println("| task1 |");
		int[] arr = {0,1,0,1,1,1};
		System.out.println(Arrays.toString(arr)); 
		for ( int i = 0; i < arr.length; i++) 
		{ 
			if(arr[i] == 1) { 
				arr[i] = 0;
			}else{ 
				arr[i] = 1;
			} 
		} 
		System.out.println(Arrays.toString(arr)); 
	}


	public static void task2() {
		System.out.println("| task2 |");
		int[] arr = new int [100]; 
		for(int i = 0; i < 100; i++) { 
			int range = 10; 
			int number = (int)(Math.random() * range); 
			arr[i] = number; 
		}

		System.out.println(Arrays.toString(arr)); 
	}


	public static void task3() {
		System.out.println("| task3 |");
		int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 6) {
				arr[i] = arr[i] * 2;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

	public static void task4() {
		System.out.println("| task4 |");
		int[][] arr = new int[3][3];
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				int range = 10; 
				int number = (int)(Math.random() * range); 
				if (j==i) {
					arr[i][j] = 1;
				}else{arr[i][j] = number;
				}
			}
		}
		 for (int i = 0; i < 3; i++) { 
	            for (int j = 0; j < 3; j++) {  
	                System.out.print(arr[i][j]);
	            }
	            System.out.println();
	        }
	}
	public static void task5(int len,int initialValue) {
		int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
		
	}

}
