import java.util.Scanner;

public class FindStringPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String str = in.nextLine();
		findPalindrome(str);
	}
	
	
	
	
	static boolean isPalindrome(String str){
		int count[] = new int[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
			
		}
		int odd =0 ;
		for(int i=0; i<count.length ; i++) {
			if(count[i]%2 == 1)
				odd++;	
		}
		if(odd>1)
			return false;
		else
			return true;
	}
	
	

	private static void findPalindrome(String str) {
		char ch[] = str.toCharArray();
		
		for(int i=0 ; i<ch.length ; i++) {
			String rs2 = "";
			int j = i;
			while(i<ch.length && ch[i]!= ' ') {
				i++;
			}
   
			int k= i-1;
			while(k>=j)
			{
				rs2 = rs2+ch[k];
			
				k--;
				
			}
			if(i<ch.length)
				rs2 = rs2+ch[i];
			boolean rs=isPalindrome(rs2);
			if(rs)
			{   
				
				System.out.println(rs2);
			}
		}
		
		
	}
	
}
