package start;

public class method04 {

	public static void main(String[] args) {
		int[]numList = {10, 20, 30, 40};
		swapArray(numList);
		System.out.println();
		for(int i = 0; i < numList.length; i++) {
			System.out.println(numList[i]);
		}
	}
		// 4. 배열에 저장된 숫자를 역순으로 저장
		public static int[] swapArray(int[]numList) {
			int a;
			for (int i = 0; i < numList.length/2; i++) {
				a = numList[i];
				numList[i] = numList [numList.length-1-i];
				numList [numList.length-1-i] = a;
			}
				return numList;

	}

}
