package testFiles;

public class fibonnaci {
	public static void main(String[] args) {
		int n =10;
		int[] fib= new int[n];
		fib[0] =0;
		fib[1] =1;
		for(int i =2;i<n;i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		for(int j =0;j<fib.length;j++) {
			System.out.print("\n"+fib[j]);
		}
	}

}
