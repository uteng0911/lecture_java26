package start;

import java.util.Scanner;

public class Star03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int num = sc.nextInt();
		
		System.out.println("[Star03]");
		for (int i=num; i>0; i--) {
		
			// 공백 값 출력하기
			for (int k = 0; k<num-i; k++) {
		System.out.print(" ");
			}
		for (int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
		}
	
