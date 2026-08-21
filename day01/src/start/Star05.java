package start;

import java.util.Scanner;

public class Star05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int num = sc.nextInt();
		
		System.out.println("[Star05]");
		
		for (int i =1; i<=num; i++) {
			//공백
			for (int k = 1; k<=num-i; k++) {
				System.out.print(" ");
			}
				for (int j= 1; j<=2 * i - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}


