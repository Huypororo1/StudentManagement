package util;

public class ArrayUtil {
	
	public static String[] combine(String[] first, String[] second) {
		int l1 = first.length, l2 = second.length;
		String[] third = new String[l1 + l2];
		int i = 0;
		for(String item : first) {
			third[i] = item;
			i++;
		}
		for(String item : second) {
			third[i] = item;
			i++;
		}
		return third;
	}

}
