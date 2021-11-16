package examples;

public class encapsulationn {
	private int a;
	private int b;

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "encapsulationn [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulationn en=new encapsulationn();
		en.setA(10);
		en.setB(20);
	System.out.println(en);

	}

	

}
