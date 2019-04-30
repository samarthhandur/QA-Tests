package testFiles;

public class decToBinary {
	public static void main(String[] args) {
		int n = 345;
		int bin =0;
		int[] ar = new int[40];
		
		while(n>0) {
			ar[bin++] = n%2;
			n=n/10;
		}
		
		for(int i =ar.length-1;i>=0;i--) {
			System.out.print(ar[i]);
		}
	}

}
