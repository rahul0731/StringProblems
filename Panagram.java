//Atlest one alphabate in the sentence 
package string;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ENter the sentence :");
		String str = in.nextLine();
		boolean rs = isPanaGram(str);
		if(rs)
		System.out.println(str + "Is PanaGram");
		else 
		System.out.println(str + "Is not panagram");
		
	}
	
	
	
	static boolean isPanaGram(String st) {
		if(st.length()<26) 
			return false;
		int count[] = new int[26];
		for(int i=0 ; i<st.length() ; i++) {
			char ch = st.charAt(i);
			if(ch>='A' && ch <= 'Z')
				count[ch-65]++;
				else if(ch>= 'a'&& ch<= 'z')
					count[ch-97]++;
		}
			for(int i=0 ; i<count.length ; i++) {
					if(count[i] == 0) 
						
					return false;
		}
			return true;
		
	}

}
