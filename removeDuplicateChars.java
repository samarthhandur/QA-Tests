package testFiles;

public class removeDuplicateChars {
	
	public static void main(String[] args) {
		String str = "jhgbfieurkkenrhbfckuergurg";
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for(int i =0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] != ch[j]) {
					sb.append(ch[i]);
					break;
				}
				System.out.print(sb);
			}
		}
		
	}

}
