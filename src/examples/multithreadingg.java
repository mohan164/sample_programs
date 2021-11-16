package examples;

class MyThread extends Thread {
	public void run()
    {
		
        System.out.println("Current thread " +Thread.currentThread().getName());
        System.out.println("run() method called");
    }
}

public class multithreadingg {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}