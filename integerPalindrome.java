package testFiles;

public class integerPalindrome {
	public static void main(String[] args) {
		int n = 234432;
		int k =0;
		while(n!=0) {
			k = k*10+n%10;
			n=n/10;
		}
		
		System.out.print("first: "+k);
		
		
		if(n == k) {
			System.out.print("first: PALINDROME");
		}else {
			System.out.print("first: non");
		}
	}

}
