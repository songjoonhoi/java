package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		System.out.println("*** 비교 연산 ***");
		// "==" : 같다, "!=" 같지 않다
		int n1 = 10, n2 = 20;
		
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		System.out.println("*** 논리 연산 ***");
		//"&&" - 두 조건이 모두 참
		System.out.println((n1 <= n2) && (n1 == n2));
		//"||" - 두 조건중 하나만 참이어도 참
		System.out.println((n1 <= n2) || (n1 == n2));
		//"!" - 논리 부정(조건이 참이면 거짓, 거짓이면 참)
		System.out.println(!(n1 == n2));
		
		System.out.println("*** 복합 대입 연산 ***");
		int num3 = 10;
		
		System.out.println(num3 += 2); //num3 = num3 + 2
		System.out.println(num3 -= 2); //num3 = num3 - 2
		System.out.println(num3 *= 2); //num3 = num3 * 2
		System.out.println(num3 /= 2); //num3 = num3 / 2
		System.out.println(num3 %= 2); //num3 = num3 % 2
		
		System.out.println("*** 조건 연산 ***");
		//부모 나이 비교 - 아빠 나이가 엄마 나이보다 크면 결과
		int fatherAge = 55;
		int motherAge = 57;
		
		//1. 결과값 - 'T', 'F'
		char result1;
		
		//2. 결과값 - true / false
		boolean result2;
		
		//3. 결과값 - "아빠가 연상", "엄마가 연상"
		String result3;
		
		result1 = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(result1);
		
		result2 = (fatherAge > motherAge) ? true : false;
		System.out.println(result2);
		
		result3 = (fatherAge > motherAge) ? "아빠가 연상" : "엄마가 연상";
		System.out.println(result3);
		
		
		
	}

}







