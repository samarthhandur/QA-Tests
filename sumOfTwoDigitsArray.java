package testFiles;

public class sumOfTwoDigitsArray {
	public static void main(String[] args) {
		int[] ar = {43,6,1,98};
		for(int i=0;i<=ar.length;i++) {
			if(ar[i] + ar[i+1] == 7) {
				System.out.print("First is :: "+ar[i]+"\n Sec is :: "+ar[i+1]);
			}
		}
	}

}
