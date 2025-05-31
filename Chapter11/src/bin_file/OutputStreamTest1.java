package bin_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest1 {

	public static void main(String[] args) {
		// 바이트 기반 파일 쓰기
		try {
		OutputStream os = new FileOutputStream("C:/file/file1.bin");
		byte a = 10;
		byte b = 20;
		
		os.write(a);
		os.write(b);
		
		// 배열로 쓰기
		byte[] array = {65, 66, 67};
		os.write(array);
		
		os.flush(); // 버퍼 비우기(바로 쓰기)
		os.close();
		System.out.println("쓰기 완료!");
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
		
	
	}

}
