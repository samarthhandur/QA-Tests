package testFiles;

public class swapNum {

	public static void main(String[] args) {
		int x =23;
		int y = 43;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.print(x);
		System.out.print("\n"+y);
	}
}
