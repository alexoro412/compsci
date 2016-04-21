public class RecursionDemo {

	public static void main(String[] args) {
		System.out.println(mystery1("Hello", 0));
		System.out.println(mystery2("Hello", 0));
	}

	public static String mystery1(String s, int n) {
		if (n < s.length()) {
			return s.charAt(n) + mystery1(s, n + 1);
		} else {
			return "";
		}
	}

	public static String mystery2(String s, int n) {
		if (n < s.length()) {
			return mystery2(s, n + 1) + s.charAt(n);
		} else {
			return "";
		}
	}

}
