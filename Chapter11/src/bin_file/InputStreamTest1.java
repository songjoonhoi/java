package bin_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 {

	public static void main(String[] args) {
		
		// 바이트 기반 파일 읽기
		try {
		InputStream is = new FileInputStream("C:/file/file1.bin"); 
		int date;
//		while(true) {
//			date = is.read();
//			if(date == 1) break;
//			System.out.println(date);
//		}
		
		while((date = is.read()) != -1) {
			System.out.println(date); // 코드값 출력
			System.out.println((char)date); // 문자열 출력
		}
			is.close();
		}  // 다중 예외인 경우 부모 클래스의 상속
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		} 
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
