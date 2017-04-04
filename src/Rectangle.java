/** @Inherit Rectangle from Figure */
public class Rectangle extends Figure {
	/** @Initialization of variable */
	double Dim1 = 4;
	double Dim2 = 3.14;

	/** @Method declare */
	public void findArea() {
		/** @Logic */
		double Area = Dim1 * Dim1;
		/** @Output */
		System.out.println("Area of Rectangle =" + Area);
	}

	/** Method declare */
	public void findPerimeter() {
		/** Logic */
		double Per = 2 * (Dim1 + Dim2);
		/** @Output */
		System.out.println("Perimeter of Rectangle =" + Per);
	}

	/** @Main method */
	public static void main(String[] args) {
		/** @Object creation */
		Rectangle obj = new Rectangle();
		/** @Calling method */
		obj.findArea();
		obj.findPerimeter();
	}
}