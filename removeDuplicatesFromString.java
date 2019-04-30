package testFiles;

public class removeDuplicatesFromString {
	public static void main(String[] args) {
		String str = "rtyuuytrrtyuuyt";
		char[] ch = str.toCharArray();
		String res = "";
		for(int i=0;i<ch.length;i++) {
			if(!res.contains(String.valueOf(ch[i]))) {
				res = res+String.valueOf(ch[i]);
			}
		}
		System.out.print(res);
	}

}
