package NewProject;

public class screenhot {

	int a;
	int b;

	public static void main(String[] args) {
		
		screenhot.swapNumber(100, 250);

	}

	static void swapNumber(int a, int b) {

		System.out.println("before swapping: a=" + a + ", b =" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping: a=" + a + ", b =" + b);

	}

}
