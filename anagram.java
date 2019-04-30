package testFiles;

public class anagram {
	public static void main(String[] args) {
		String str1= "armu";
		String str2="mary";
		boolean flg =false;
		if(str1.length() == str2.length()) {
			for(int i =0;i<str1.length();i++) {
				for(int j =0;j<str2.length();j++) {
					if(str1.charAt(i) == str2.charAt(j)) {
						flg = true;
						break;
					}else {
						flg = false;
						break;
					}
				}
			}
			System.out.print(flg);
		}
		
	}

}
