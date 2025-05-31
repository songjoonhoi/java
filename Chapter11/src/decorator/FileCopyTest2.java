package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest2 {

	public static void main(String[] args) {
		// 보조 스트림 - Buffered 스트림
		// 버버(buffer)는 임시 기억 장소를 의미
		// 보조 스트림은 기반 스트림을 생성자의 매개변수로 사용해야 함
		// 이유는 보조 스트림이 독립적으로 입출력을 수행할 수 없음
		String originFile = "C:\\Users\\Administrator\\Desktop\\korea_javaworks-main\\Chapter11\\dog.jpg";
		String copyFile = "C:\\Users\\Administrator\\Desktop\\korea_javaworks-main\\Chapter11\\dog3.jpg";
		long start, end;
		
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)
				){
			
			start = System.currentTimeMillis();
			// 읽고 쓰기
			int data;
			while((data = bis.read()) != -1 ) {
				bos.write(data);
			}
			end = System.currentTimeMillis();
			System.out.printf("복사 시간: %dms", (end - start));
			 
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
