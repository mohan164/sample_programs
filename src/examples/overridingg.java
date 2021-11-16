package examples;
 class class1{
	public void method1() {
		int a=10;
		System.out.println(a);
	}
}
 
public class overridingg extends class1 {
	public void method1() {
		int a=1;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 g=new overridingg();
		g.method1();

	}

}
