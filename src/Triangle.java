/** @Inherit Triangle from Figure */
public class Triangle extends Figure {
	/** @Initialization of variable */
	double Dim1 = 3;
	double Dim2 = 5;
	double Dim3 = 4;

	/** @Method declare */
	public void findArea() {
		/** @Logic */
		double Area = (Dim1 * Dim3) / 2;
		/** @Output */
		System.out.println("Area of Triangle =" + Area);
	}

	/** @Method declare */
	public void findPerimeter() {
		/** @Logic */
		double Per = Dim1 + Dim2 + Dim3;
		/** @Output */
		System.out.println("Perimeter of Triangle =" + Per);
	}

	/** @Main method */
	public static void main(String[] args) {
		/** @Object creation */
		Triangle obj = new Triangle();
		/** @Calling method */
		obj.findArea();
		obj.findPerimeter();
	}
}
