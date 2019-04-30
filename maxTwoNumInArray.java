package testFiles;

public class maxTwoNumInArray {
	public static void main(String[] args) {
		int[] ar = {45,21,87,12,9,89};
		int first = 0;
		int sec =0;
		for(int i : ar) {
			if(first<i) {
				sec = first;
				first=i;
			}else if(sec<i) {
				sec =i;
			}
		}
		System.out.print(first);
		System.out.print("\n"+sec);
		
	}

}
