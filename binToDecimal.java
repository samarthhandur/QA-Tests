package testFiles;

public class binToDecimal {
	public static void main(String[] args) {
		int bin = 1001101100;
		int dec = 0;
		int p =0;
		while(bin!=0) {
			dec = (int) (dec+((bin%10)*Math.pow(2, p)));
			bin=bin/10;
			p++;
		}
		System.out.print(dec);
		
	}

}
