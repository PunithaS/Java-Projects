package com.bss.polymorphism;

public class IPhone extends Phone {
	int n;
	String make;
	
public static void main(String[] args) {
	//int a;
	IPhone i= new IPhone();
	//i.dial(873628);
	//i.receive();
	//i.dial();
	i.dial(12345);
	
	IPhone i2= new IPhone(987);
	System.out.println(i2.n+" "+i2.make);

	Phone i3= new IPhone(632);
	System.out.println("below is for i3"+i3);
	
	
}

protected  IPhone(int number)
{
	n=number;
}

public IPhone(){};
public void dial(int n)
{
	System.out.println("Dialing "+n+" "+this.n);
	System.out.println("Do you want the speakers on?");
}

public void dial(int n, int ext)
{
	super.dial(n);
	System.out.println("connectint to "+ext);
	dial(n);// same as dial(n);
	
}
}
