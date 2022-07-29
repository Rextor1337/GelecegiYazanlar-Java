import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\user\\Desktop\\lorem.txt");
		
		if (file.exists()) {
			FileReader fileReader = null;
			try {
				fileReader = new FileReader(file);
				int c = 0;
				long now =  System.currentTimeMillis();
				
				//cok yavas
				/*while ((c = fileReader.read()) != -1) {
					System.out.print((char)c);
					
				}*/
				
				//cok performansli
				
				char[] buffer = new char[1024];
				int length = 0 ;
				StringBuilder builder = new StringBuilder();
				while ((length = fileReader.read(buffer))!=-1) {
					builder.append(Arrays.copyOfRange(buffer, 0, length));
				}
				
				System.out.println(builder.toString());
				
			
				System.out.println(System.currentTimeMillis() - now);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if (fileReader != null) {
					
					try {
						fileReader.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}else {
			System.out.println("Dosya bulunamadi");
		}
		
	}
}
