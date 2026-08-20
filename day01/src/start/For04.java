package start;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int fac = 1;
		
		for (int i = 1; i<=num ; i++) {
			fac *= i;
		}
		
		System.out.println(num + "! =" + fac);
	
		

	}

}
