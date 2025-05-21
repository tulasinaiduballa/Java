package Day_8;
import java.io.*;
public class File_Creation {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\ADMIN\\Desktop\\hello.txt");
		if(f1.createNewFile()) {
			System.out.println("File is Created Successfully");
		}else {
			System.out.println("File Is Not Created");
		}
	}

}
