package testFiles;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateCharacters {
	public static void main(String[] args) {
		String str = "bguycffjjrugfgkufrgfkjgreku";
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		char[] chrs = str.toCharArray();
		for (Character ch : chrs) {
			if (dupMap.containsKey(ch)) {
				dupMap.put(ch, dupMap.get(ch) + 1);
			} else {
				dupMap.put(ch, 1);
			}
		}
		Set<Character> keys = dupMap.keySet();
		System.out.println("Duplicate chars in a string " + str + " are :");
		for (Character ch : keys) {
			if (dupMap.get(ch) > 1) {
				System.out.println(ch + "--->" + dupMap.get(ch));
			}
		}

			}


}
