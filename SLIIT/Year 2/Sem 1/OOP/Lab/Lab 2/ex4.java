import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4 {
	public static void main(String args[]) throws IOException {
		// BufferedReader object 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//variable declaration
		Double length, width, height, volume;
		
		// input
		System.out.print("Input length: "); // prompt
		String str1 = reader.readLine();
		length = Double.valueOf(str1).doubleValue();
		
		System.out.print("Input width: "); // prompt
		String str2 = reader.readLine();
		width = Double.valueOf(str2).doubleValue();
		
		System.out.print("Input height: "); // prompt
		String str3 = reader.readLine();
		height = Double.valueOf(str3).doubleValue();
		
		// calculation
		volume = length * width * height;
		
		// output
		System.out.println("Volume: " + volume);
	}
}