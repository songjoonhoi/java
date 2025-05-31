package bin_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		// 이미지를 읽어서 쓰기(복사)
		String originFile = "C:\\Users\\Administrator\\Desktop\\korea_javaworks-main\\Chapter11\\dog.jpg";
		String copyFile = "C:\\Users\\Administrator\\Desktop\\korea_javaworks-main\\Chapter11\\dog2.jpg";
		long start, end;
		
		
		try(InputStream is = new FileInputStream(originFile);
				OutputStream os = new FileOutputStream(copyFile)){
			start = System.currentTimeMillis();
			
			while(true) {
				int num = is.read(); // is로 읽기
				if(num == -1) break;
				os.write(num); // os로 쓰기
			}
			end = System.currentTimeMillis();
			System.out.println("복사 시간: "+ (end -start) + "ms");
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
