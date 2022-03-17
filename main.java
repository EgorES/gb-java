import java.util.Scanner;


public class main {
	public static void main(String args[]) {
	compare();
	number();
	numeric();
	stroka();
	}
	 public static void compare(){
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Введите первое число");
		 int a = scanner.nextInt();
		 System.out.println("Введите второе число");
		 int b = scanner.nextInt();
		 int value = a+b;
		 if (value>10 && value<20) {
			 
			 System.out.println("True");
			 
		 }else {
			 
			 System.out. println("False");
			 
		 }
	 }
	 
	public static void number(){

		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Введите число");
		 int a = scanner.nextInt();
		 if (a>=0) {
			 
			 System.out.println("Число положительное");
			 
		 }else if(a<0){
			 
			 System.out.println("Число отрицательное");
		 }
		 
	}
	
	public static void numeric() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Введите число");
		 int a = scanner.nextInt();
		 if (a>0) {
			 
			 System.out.println("True");
			 
		 }else if(a<0){
			 
			 System.out.println("False");
			 
		 }
		
	}
	
	 public static void stroka() {
		 int str=1;
		 int n=1 ;
		 for (int i = 1; i <= n; i++) {
	            System.out.println("[" + i + "]" + " " + str);
	        }
	 }
		
}
