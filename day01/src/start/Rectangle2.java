package start;

import java.util.Scanner;

public class Rectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 조건 연산자 (문자열)
		String answer = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(answer);
		
		
	}

}
