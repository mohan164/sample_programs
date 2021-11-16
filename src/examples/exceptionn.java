package examples;

public class exceptionn {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		validate(19);
		try {
			int a = 50 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);

		}

	}

}
