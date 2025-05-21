package Day_8;
import java.io.*;
public class File_Writing {

	public static void main(String[] args) throws IOException{
		FileWriter f1 = new FileWriter ("C:\\Users\\ADMIN\\Desktop\\hello.txt");
		f1.write("Hi how do you do");
		f1.close();
		System.out.println("Success");
	}

}
