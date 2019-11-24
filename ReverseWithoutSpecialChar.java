package Important.Strings;

import java.util.Scanner;

public class ReverseWithoutSpecialChar {
	public static void main(String[] args) {
	Scanner in  = new Scanner(System.in);
	System.out.println("Enter the String with Special Character");
	String str = in.next();
	reverse(str);
		
	}

	private static void reverse(String str) {
		char ch[] = str.toCharArray();
		int l =0 , r =str.length()-1;
		while (l<r) {
			if (!Character.isAlphabetic(ch[l])) {
				l++;
			}
			else if (!Character.isAlphabetic(ch[r])) {
				r--;
			}
			else 
			{
				char temp = ch[l];
				ch[l] = ch[r];
				ch[r] = temp;
				l++;
				r--;
			}
		}
		String st = new String(ch);
		System.out.println(st);
	}
		
}
