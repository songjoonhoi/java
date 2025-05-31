package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 변수값 교환, 대입 연산자('=')
		int x = 0;
		int y = 1;
		
		System.out.println("***** 교환 전 *****");
		System.out.println("x = " + x + ", y = " + y);
		
		//연산(교환)
		int temp;  //교환용 변수
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("***** 교환 후 *****");
		System.out.println("x = " + x + ", y = " + y);
		System.out.println(); //한 줄 간격
		
		//산술 연산
		System.out.println("***** 산술 연산 *****");
		int n1 = 4;
		int n2 = 5;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println((double)n1 / n2);
		System.out.println(n1 % n2); //나머지
		
		System.out.println("***** 증감 연산 *****");
		// ++(1증가), --(1감소)
		int a = 99;
		
		System.out.println(a++);  //a = a + 1(후치 증가)
		System.out.println(a);
		
		System.out.println(++a);  //a = a + 1(전치 증가)
		System.out.println(a);
		
		System.out.println(a--); //a = a - 1(후치 감소)
		System.out.println(a);
		
		System.out.println(--a); //a = a - 1(전치 감소)
		System.out.println(a);
		

	}

}







