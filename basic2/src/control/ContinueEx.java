package control;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i % 2 == 0) {
				System.out.printf("%d는 짝수다\n", i);
			} else {
				System.out.printf("%d는 홀수다\n", i);
			}
		}
	}

}
