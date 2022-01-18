package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DublicateString {
	
	public static void main(String[] args) {
		String []ar={"abc","cbx","abc","zxr","mnk","zxr","cbx","lkj","ops","abc"};
		
//		String[]ar=str.split(" ");
		int count=0, count2=0, count3=0;
		for(int i=0; i<ar.length; i++)
		{
			for(int j=1; j<ar.length; j++)
			{
				if(ar[i].equals(ar[j]))
				{
					System.out.println(ar[j]);
					count++;
				}
			}
		}
		
		System.out.println("Total dublicate strings are : "+count+"\n***********");
		
		List<String> ls=Arrays.asList(ar);
		Set st=new HashSet();
		List lt=new ArrayList();
		
		for(String s:ls)
		{
			if(st.add(s)==true)
			{
				System.out.println(s);
				count2++;
			}
			else
			{
				lt.add(s);
				count3++;
			}
		}
		System.out.println("Actual duplicates : "+count3);
		System.out.println("Dplicate Values : \n"+lt);
	}

}
