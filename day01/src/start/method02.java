package start;

public class method02 {

	public static void main(String[] args) {
		int[]numList = {10, 20, 30, 40};
		//test
		int max = getMax(numList);
		System.out.println(max);
	}
		// 2.정수형 배열에 저장된 숫자 중 가장 큰 숫자 출력
		public static int getMax(int[]numList) {
			int max = numList[0];
			for (int i = 1; i < numList.length; i++) {
				if (numList[i]>max) {
					max = numList[i];
				}	
			}
					return max;
			}

}