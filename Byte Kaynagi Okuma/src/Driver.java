import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\user\\Desktop\\Mob_boss.png");
		System.out.println(file.exists());
		if (file.exists()) {
			FileInputStream fileInputStream = null;
			try {
				fileInputStream = new FileInputStream(file);
				byte[] buffer = new byte[1024];
				int length = 0;
				while ((length = fileInputStream.read(buffer)) != -1) {
					System.out.println(Arrays.toString(buffer ));
					
				}
				fileInputStream.read(buffer);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
