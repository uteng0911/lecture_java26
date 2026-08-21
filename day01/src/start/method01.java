package start;

public class method01 {
	
	public static void main (String[]args) {
		
		int[]numList = {10, 20, 30, 40};
// test
		int sum = getSum(numList);
		System.out.println(sum);
	}
	
// 1.정수형 배열에 저장된 모든 값 더하여 반환
	public static int getSum(int[]numList) {
		int sum = 0;
		for (int i = 0; i < numList.length; i++) {
		sum += numList[i];
	}
		return sum;
		
	}
}



