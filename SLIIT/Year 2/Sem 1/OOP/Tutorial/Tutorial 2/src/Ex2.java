import ex2.Point3D;
import java.util.Scanner;

public class Ex2 { // class & file names should be PointApp
	public static void main(String args[]) {
		
		// variable declaration
		double x1, y1, z1;
		double x2, y2, z2;
		
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		// input
		//point 1
		System.out.print("Input X coordination of point 1: ");
		x1 = sc.nextDouble();
		
		System.out.print("Input Y coordination of point 1: ");
		y1 = sc.nextDouble();
		
		System.out.print("Input Z coordination of point 1: ");
		z1 = sc.nextDouble();
		
		// point 2
		System.out.println("\nPoint 2");
		
		System.out.print("Input X coordination of point 2: ");
		x2 = sc.nextDouble();
		
		System.out.print("Input Y coordination of point 2: ");
		y2 = sc.nextDouble();
		
		System.out.print("Input Z coordination of point 2: ");
		z2 = sc.nextDouble();
		
		
		// object creation
		Point3D p1 = new Point3D(x1, y1, z1);
		Point3D p2 = new Point3D(x2, y2, z2);
		
		// output
		System.out.println("\nPoint 1 distance: " + p1.distance());
		System.out.println("Point 2 distance: " + p2.distance());
		
	}
}
