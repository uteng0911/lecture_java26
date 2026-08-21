package start;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a = 2; a<=9; a++) {
		System.out.println("[구구단 " + a + "단]");
		
		for (int i = 1; i<=9 ; i++) {
			System.out.println(a + " x " +  i  + " = " + (a * i));
		}
		System.out.println();
			}
	}
}
