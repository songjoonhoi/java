package types;

public class NumberType {

	public static void main(String[] args) {
		// 숫자 자료형
		System.out.println("***** 정수 자료형 *****");
		
		//byte(1byte) - 8bit(256개) : -128 ~ 127
		byte bData1 = 127;
		//byte bData2 = 128; //범위 초과로 오류 발생
		
		System.out.println(bData1);
		//System.out.println(bData2);
		
		//int(4byte) - 16bit(43억) : -21억 ~ 21억
		int iNum1 = 220000000;
		//int iNum2 = 2200000000;  //범위 초과로 오류 발생
		
		System.out.println(iNum1);
		
		//long(8byte) - 64bit
		long lNum = 2200000000L;  //'L' or 'l'을 붙임
		System.out.println(lNum);
		
		System.out.println("***** 실수 자료형 *****");
		//float(4byte) - 소수 6자리까지 출력
		float fNum = 1.23456789F; //'F' or 'f'를 붙임
		System.out.println(fNum);
		
		//double(8byte) - 소수 16자리까지 출력
		double dNum = 1.23456789012345678;
		System.out.println(dNum);
		
	}

}
