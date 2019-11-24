package Important.Strings;

import java.util.Scanner;

public class StringOccurance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character :");
		String str = in.next();
		//char ch = in.nextLine().charAt(0);
		//int time = in.nextInt();
		countCharOccarance(str);
		//revrseOccarance(ch ,time);
	}

	private static void revrseOccarance(char str, int time) {
		int ch = str;
		for (int i = 0; i <time; i++) {
			System.out.print((char)ch);
		}
		
		
	}

	private static void countCharOccarance(String str) {
		int count[]  = new int[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}
		
		
		for (int i = 0; i < count.length; i++) {
			if (count[i]!= 0) {
				
			System.out.println((char)i+" -> " + count[i]);
			}
			
			
		}
		int max = -1;
		char result =  ' ';
		for (int i = 0; i < str.length(); i++) {
			
			if(max<count[str.charAt(i)]){
				max = count[str.charAt(i)];
				result = str.charAt(i);
				
			}
		}
		System.out.println(result  + " --->" +max);
		
	}

		
		
	
}
