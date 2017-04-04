/** @Inherit circle from Figure */
public class Circle extends Figure {
	/** @Initialization of variable */
	double Dim1 = 4;
	double pi = 3.14;

	/** @Method declare */
	public void findArea() {
		/** @Logic */
		double Area = pi * Dim1 * Dim1;
		/** @Output */
		System.out.println("Area of circle =" + Area);
	}

	/** @Method declare */
	public void findPerimeter() {
		/** @Logic */
		double Dim2 = 2 * pi * Dim1;
		/** @Output */
		System.out.println("Perimeter of circle =" + Dim2);
	}

	/** @Main method */
	public static void main(String[] args) {
		/** @Object creation */
		Circle obj = new Circle();
		/** Calling method */
		obj.findArea();
		obj.findPerimeter();
	}
}