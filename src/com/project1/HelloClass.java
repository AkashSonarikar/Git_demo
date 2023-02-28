package com.project1;

public class HelloClass {

	int a1;
	int d1;
	int c1;
public	HelloClass() {
}
public HelloClass(int d,int e,int j) {
	a1=d;
	d1=e;
	c1=j;
}
public void display() {
	System.out.println(a1+" "+d1+" "+c1);
}
	public void addition (){
		// TODO Auto-generated method stub
int c=a1+d1+c1;
System.out.println(c);
	}
public static void main(String[] args) {	
HelloClass hello=new HelloClass(5,7,2);
hello.addition();
hello.display();
}
}