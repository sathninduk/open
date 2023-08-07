public class ex1 {
	public static void main (String args[]) {
		int miles, yards;
		double kilometers;
		
		miles = 26;
		yards = 385;
		
		kilometers = (miles + (yards / 1760.0)) * 1.609;
		
		System.out.println(kilometers);
	}
}