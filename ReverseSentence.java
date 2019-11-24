package string;
import java.util.*;
public class ReverseSentence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ENter the sentence :");
		String str = in.nextLine();
		char ch[] = str.toCharArray();
		String rs = "";
		for(int i=0 ; i<ch.length ; i++) {
			int j = i;
			while(i<ch.length && ch[i]!= ' ') {
				i++;
			}
			//come back to 
			int k= i-1;
			while(k>=j)
			{
				rs = rs+ch[k];
			
				k--;
			}
			if(i<ch.length)
				rs = rs+ch[i];
			
		}
		System.out.println(rs);
		
	}
	

}
