package pack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionP2 
{

	public static void main(String[] args) 
	{
		
		
		//by index 
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
//		System.out.println(a);// print all value
//		// for specific value
//		System.out.println(a.get(4));
//		System.out.println(a.get(3));
		
		
//		//replace 30 o 35
//		a.set(2, 35);
//		System.out.println(a);
//		System.out.println(a.get(2));
		
		//remove
//		a.remove(4);
//		System.out.println(a);
		
		//for loop
//		for(int i=0;i<=4;i++)
//		{
//			System.out.println(a.get(i));
//		}
//		
//		//size
//    System.out.println(a.size());
		
		
    //list interface to implemts class
		//up casting concept
		//list to ArratList
		List l1=new ArrayList();
		l1.add(20);
		l1.add(20);
		l1.add(20.5);
		
		l1.add("vaibhav");
		System.out.println(l1);
		
		//specific string
		List <String>l2=new ArrayList<String>();
		l2.add("vaibhav");
		System.out.println(l2);
		
		
		//set
		//HashSet
		HashSet h=new HashSet();
		h.add(10);
		h.add("vaibhav");
		System.out.println(h);
		
		
		//specific
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(100);
		h1.add(2000);
		System.out.println(h1);
		
		
		//Set interface
		//hash class
		//up casting
		
		Set s=new HashSet();
		s.add(125);
		s.add("vBM");
		System.out.println(s);
		
		
		
		
		
		

		
		
	}
}
