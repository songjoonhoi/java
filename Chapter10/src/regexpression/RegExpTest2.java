package regexpression;

public class RegExpTest2 {

	public static void main(String[] args) {
		//문자열 처리 함수(String 클래스) - replaceAll(정규표현식, 대체기호)
		
		//비밀번호 보안 처리
		//영문자[a-zA-Z]나 숫자[0-9]가 아니면 '*'로 마스킹
		//'^'기호가 []안에서 사용되면 부정(아니다)을 의미
		String password = "P@ssw0rd!";
		String masked = password.replaceAll("[^a-zA-Z0-9]", "*");
		System.out.println(masked);  //P*ssw0rd*
		
		//게시글 금칙어 처리
		String text = "안녕@하세요! #스팸";
		
		//한글과 공백만 허용 - [ㄱ-힣] [\s]
		String filterd = text.replaceAll("[^ㄱ-힣\s]", "*");
		System.out.println(filterd); //안녕*하세요* *스팸
	}

}








