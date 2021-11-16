package examples;
abstract class details{
	public abstract  void details1();
	public abstract void details2();
	public  void behaviour() {
		System.out.println("hello");
	}
}

public class abstractionn extends details {
public void details1()
{
	System.out.println("printing details1..");
}
public void details2()
{
	System.out.println("printing details2..");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details d=new abstractionn();
		d.details1();
		d.details2();
		d.behaviour();

	}

}
