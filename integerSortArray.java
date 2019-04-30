package testFiles;

public class integerSortArray {

	public static void main(String[] args) {
		int[] ar = {32,89,11,7,82,1,76};
		int k =0;
		
		for(int i =0;i<ar.length;i++) {
			for(int j =i;j<ar.length;j++) {
				if(ar[i] > ar[j]) {
					k = ar[i];
					ar[i] = ar[j];
					ar[j] = k;
				}
			}
			
		}
		for(int l =0;l<ar.length;l++) {
			System.out.print("\n"+ar[l]);
		}
	}
}
