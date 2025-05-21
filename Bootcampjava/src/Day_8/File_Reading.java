package Day_8;
import java.io.*;
import java.util.Scanner;
public class File_Reading {

	public static void main(String[] args) {
		try {
			File obj = new File("C:\\Users\\ADMIN\\Desktop\\hello.txt");
			Scanner R = new Scanner(obj);
			while (R.hasNextLine()) {
				String data = R.nextLine();
				System.out.println(data);
			}
			R.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error has occured");
		}
		
	}

}
