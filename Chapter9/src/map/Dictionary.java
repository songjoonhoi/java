package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		// 컴퓨터 용어 사전 만들기
		Map<String, String> dic = new HashMap<>();
		
		//단어와 정의 저장
		dic.put("이진수", "컴퓨터가 사용하는 0과 1로 이루어진 수");
		dic.put("비트", "정보 기술에서 테이터의 가장 작은 단위로 0과 1의 값을 가진다.");
		dic.put("버그", "프로그램이 적절하게 동작하는데 실패하거나 오류가 발생하는 코드.");
		dic.put("알고리즘", "어떤 문제를 해결하기 위해 정해진 절차.");
		
		//입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================");
		System.out.println("프로그램을 종료하려면 q 또는 Q를 입력하세요");
		System.out.println("===================================");
		
		while(true) {
			System.out.print("검색할 단어를 입력하세요: ");
			String word = sc.nextLine();  //입력 대기상태
			
			if(word.toLowerCase().equals("q")) { //toLowerCase()-영어 철자를 소문자로 바꿈
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//정의된 단어 가져오기
			String definition = dic.get(word);
			
			if(definition != null) {
				System.out.println(definition);
			}else {
				System.out.println(word + "는 없는 단어입니다.");
			}
		}
	}

}









