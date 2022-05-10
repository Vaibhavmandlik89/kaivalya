package pack1;

import java.util.ArrayList;

public class CollectionProgram 
{

	public static void main(String[] args) 
	{
		
		
		int a =50;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
		//max veriable 10,20,30,60,58,95
		int d[]= {10,20,30,60,58,95};
		
		//collection arraylist
		ArrayList p=new ArrayList();	
		p.add(20);
		p.add(1.5);
		p.add('v');
		p.add("vaibhav");
		System.out.println(p);
		
		//for specific data
		ArrayList <Integer> q= new ArrayList<Integer>();
		q.add(10);
		//q.add(10.5);
	//	q.add("vaibhav");
		System.out.println(q);
		
		ArrayList <String> r= new ArrayList<String>();
		r.add("vaibhav");
	//	r.add(10);
		System.out.println(r);
		
}
}
