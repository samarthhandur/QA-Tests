package testFiles;

public class stringPalindrome {
	public static void main(String[] args) {
		String str = "samarth";
		String pal = "";
		
			for(int j =str.toCharArray().length-1;j>=0;j--) {
				pal = pal+str.toCharArray()[j];
			
		}
			System.out.print("first: "+pal);
			
			if(str == pal) {
				System.out.print("\nfirst: PALINDROME");
			}else {
				System.out.print("\nfirst: NON PALINDROME");
			}
	}

}
