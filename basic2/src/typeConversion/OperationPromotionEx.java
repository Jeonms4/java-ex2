package typeConversion;

public class OperationPromotionEx {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println("결과 : " + result1);  // 문자열 + 정수일 경우 정수가 문자열로 자동 형변환
		
		System.out.println();
		
		byte v1 = 10;
		byte v2 = 20;
		
		int result2 = v1 + v2;
		System.out.println("결과 : " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		
		// int result = v3 + v4 + v5; // 타입이 다르므로 값의 허용 범위가 작은 타입이 큰 타입(long)으로 자동 형 변환이 일어남.
		long result3 = v3 + v4 + v5;
		
		char v6 = 'A';
		char v7 = 1;
		
		int result4 = v6 + v7;  // v6이 int로 자동 형변환후 연산
		System.out.println(result4);
		
		System.out.println((char) result4);
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println(result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println(result6);
		
		int v10 = 1;
		int v11 = 2;
		
		System.out.println(v10 / v11);
		
		double result7 = (double)v10 / v11;
		System.out.println(result7);
	}
}
