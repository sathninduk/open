package ex2;

public class Point3D {

	// attributes
	private double x, y, z;
	
	// constructors
	public Point3D() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Point3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// methods
	public double distance() {
		return Math.sqrt((x * x) + (y * y) + (z * z));
	}
}
