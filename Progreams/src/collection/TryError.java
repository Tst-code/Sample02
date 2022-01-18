package collection;

import java.util.Arrays;
import java.util.HashSet;

//import com.sun.tools.javac.util.List;

public class TryError {
	
	public static void main(String[] args) {
		
		String str= "Welcome test test";
		
		String [] ar=str.split(" ");
		java.util.List<String> ls=Arrays.asList(ar);
		
//		HashSet sh=new HashSet();
		HashSet sh2=new HashSet(ls);
		int count1=0, count2=0;
		for(Object o: sh2)
		{
			System.out.println(o);
//			if(sh.add(o)==false)
//			{
//			count1++;
//			}
//			else if(sh2.add(o))
//			{
//			 count2++;
//			}
		}
//		int c=ar.length;
//		System.out.print("Duplicates: "+count1+"\n"+"Singles ");
//		System.out.print(count1-(ar.length)+"\n"+c);
	}

}
