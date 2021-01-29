import java.util.Arrays;

public class Ispallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="addassss";
	 boolean n=Ispallindrome(s);
	 
	 if(n)
	 {
		 System.out.println("String is pallindrome");
	 }
	 else
	 {
		 System.out.println("String is not pallindrome");
	 }
	}

	private static boolean Ispallindrome(String s) {
		// TODO Auto-generated method stub
		
		int l;
		l=s.length();
		
		//Convert string in to character array 
		char[] arr=new char[l];
		
		for(int j=0;j<l/2;j++)
		{
		
			if (s.charAt(j) != s.charAt(l - 1 -j)) {
				return false;
			}
			
		}
		return true;
		
		
	}

	
}
