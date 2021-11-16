package examples;

public class overloadingg {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return (a - b) + c;
	}

	public int add(int a, int b, int c, int d) {
		return (a - b) + (c / d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingg gg = new overloadingg();
		System.out.println(gg.add(8, 4));
		System.out.println(gg.add(9, 2, 4));
		System.out.println(gg.add(78, 10, 20, 40));

	}

}
