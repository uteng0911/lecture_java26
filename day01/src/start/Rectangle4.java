package start;

import java.util.Scanner;

public class Rectangle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 금액 입력
		System.out.println("금액 : ");
		int money = sc.nextInt();
		// 500원짜리 동전 입력
		int coin500 = money / 500;
		// 나머지 금액
		int result = money % 500;
		
		// 100원짜리 동전 입력
		int coin100 = result / 100;
		
		
		
		
		
		
		
		
		
		
		System.out.println("동전의 수");
		System.out.println("500원짜리 = " + coin500 + "개");
		System.out.println("100원짜리 = " + coin100 + "개");
		
	}

}
