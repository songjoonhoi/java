package choice;

public class IfElseEx3 {

	public static void main(String[] args) {
		// 숫자 비교(일치)
		int num1 = 100;
		int num2 = 100;
		
		if(num1 == num2) {
			System.out.println("두 수가 일치합니다.");
		}else { //else if(num1 != num2)
			System.out.println("두 수가 일치하지 않습니다.");
		}
		
		// 문자 비교(일치)
		String str1 = "사과";  //문자형 변수 str1에 "apple"이 기억
		String str2 = "바나나";
		
		//equals() - 함수 사용
		if(str1.equals(str2)) {
			System.out.println("두 단어가 일치합니다.");
		}else {
			System.out.println("두 단어가 일치하지 않습니다.");
		}
	}
}








