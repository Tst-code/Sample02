package star;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListString {
	public static void main(String[] args) {
		
		String str[]={"Persistant","PERSIsTANT", "", "    ", "mayur", "MAYUR", "Anand"};
		
		List<String> lt=Arrays.asList(str);
		Set<String> st=new HashSet();
		
		for(String o:lt)
		{
			String tr=o.trim().toLowerCase();
//			String ht=o.replac
//			String ht=tr.toLowerCase();
			st.add(tr);
		}
		
		System.out.println(st);
	}

}
