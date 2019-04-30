package testFiles;

public class primeNumber {
	public static void main(String[] args) {
		int n =32;
		for(int i=2;i<(n/2);i++) {
			if(n%i == 0) {
				System.out.print(false);
				break;
			}else {
				System.out.print(true);
				break;
			}
		}
	}

}
