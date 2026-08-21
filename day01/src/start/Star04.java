package start;

import java.util.Scanner;

public class Star04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int num = sc.nextInt();
		
		System.out.println("[Star04]");
		for (int i = 1; i<=num; i++) {
			//공백 값 출력하기
			for (int k = 0; k <num-i; k++) {
				System.out.print(" ");
				for (int j = num; j<i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
			

	}

}
