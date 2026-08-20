package start;

import java.util.Scanner;

public class Rectangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
//상수 PI 길이 입력
final double PI = 3.14;
System.out.println("원의 반지름을 입력하세요(cm) : ");
//반지름 길이 입력
double a = sc.nextDouble();

//원의 넓이
double area = a * a * PI;
System.out.println("원의 넓이 : " + area);

	}

}
