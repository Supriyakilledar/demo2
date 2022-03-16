package pack1;

import java.util.Scanner;

public class gtnumber {

	public static void main(String[] args) {
	int n1;
	int n2;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number n1");
	n1=s.nextInt();
	System.out.println("enter a number n2");
	n2=s.nextInt();
	String result=n1>n2?"n1 is greater number":"n2 is greater number";
	System.out.println(result);
	

	}

}
