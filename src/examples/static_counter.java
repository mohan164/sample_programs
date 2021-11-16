package examples;

public class static_counter {
	static int count = 0;

	public static_counter() {
		
		
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_counter s1 = new static_counter();

		static_counter s2 = new static_counter();
		

	}

}
