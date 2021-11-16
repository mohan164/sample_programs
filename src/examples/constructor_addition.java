package examples;

import java.util.Scanner;

public class constructor_addition {
	  static int s;

	public constructor_addition(int a, int b) {
		s = a + b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_addition co = new constructor_addition(10, 20);
		System.out.println(s);

	}

}
