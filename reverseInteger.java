package testFiles;

public class reverseInteger {

	public static void main(String[] arr) {
		int n = 8732;
		int rev =0;
		while(n!=0) {
			rev = (rev*10)+n%10;
			n=n/10;
		}
		System.out.println(rev);
		
	}
}
