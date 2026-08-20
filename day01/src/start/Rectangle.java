package start;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("직사각형의 가로 길이 : ");
// 가로길이 입력하기
double a = sc.nextDouble();

System.out.println("직사각형의 세로 길이 : ");
// 세로길이 입력하기
double b = sc.nextDouble();

// 결과 출력
double area = a * b;

System.out.println("");
System.out.println("직사각형의 넓이 = " + area);



	}
}