package string;

import java.util.Scanner;

public class SentencrPresent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ENter the sentence :");
		String str1 = in.nextLine();
		
		boolean rs = isPresent(str1," durga");
		System.out.println("Yes is prensent in the string ");
	}

	static boolean isPresent(String str1, String str2) {
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		for(int i=0 ; i<ch1.length; i++) {
			int j=0 , k=i;
			while(j<ch1.length&&k<ch1.length&&ch1[i] == ch2[j]) {
				j++;
				k++;
			}
			if(j==ch2.length)
				return true;
		}
		
		return false;
	}
}
