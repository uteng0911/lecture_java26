package start;

public class method03 {

	public static void main(String[] args) {
		int[]numList = {10, 20, 30, 40};
		int count = getCount(numList,25);
		System.out.println(count);
	}
		// 3.배열에 저장된 숫자 중 입력된 숫자보다 큰 수가 몇 개 있는지 구하기
		public static int getCount(int[]numList, int num) {
			int count = 0;
			for (int i = 0; i < numList.length; i++) {
				if (numList[i]>num) {
					count++;
}
			}
			return count;
}
}