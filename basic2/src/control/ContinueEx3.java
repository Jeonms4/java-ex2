package control;

public class ContinueEx3 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			
			if(i % 2 == 0) {
				System.out.printf("%d는 짝수다\n", i);
				continue;
			}
		}
	}

}
