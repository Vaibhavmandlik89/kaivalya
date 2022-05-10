package pack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSetDiff 
{
	public static void main(String[] args) 
	{
		
		//list= allow the dupicate value 2=accet many null value 3 it follow index
		//ArrayList
		List <Integer>l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(100);
		l.add(200);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.get(3));
		
		//set its not allow ther duplicate 2 its accept only one null value
		//hashSet
		Set<Integer> s=new HashSet<Integer>();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(100);
	    s.add(200);
	    s.add(null);
	    s.add(null);
	    System.out.println(s);

		
		
		
		
;	}

}
