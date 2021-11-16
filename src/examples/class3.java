package examples;

 interface interfacee {
	void sum();
	public int add(int a,int b);

}
class class3 implements interfacee{
static int t;
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("inside sum");
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		t=a+b;
		return (t);
	}
	public static void main(String[] args) {
		class3 ie=new class3();
		ie.add(8, 9);
		ie.sum();
		System.out.println(t);
		
	}
	
}
