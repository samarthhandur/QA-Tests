package testFiles;

public class armstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int k =0;
		int p =0;
		int j =0;
		while(n>0) {
			k = n%10;
			n = n/10;
			j = j+(k*k*k);
		}
		System.out.print("first: "+j);
	}
}
