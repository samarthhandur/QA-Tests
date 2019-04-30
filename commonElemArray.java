package testFiles;

public class commonElemArray {
	public static void main(String[] args) {
		int[] ar1 = {32,76,2,9,87};
		int[] ar2 = {45, 32,65, 9,98};
		
		if(ar1.length == ar2.length) {
			for(int i =0;i<ar1.length;i++) {
				for(int j = 0;j<ar2.length;j++) {
					if(ar1[i] == ar2[j]) {
						System.out.print("\n"+ar1[i]);
					}
				}
			}
		}
	}

}
