public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		return s.equals(new StringBuilder(s).reverse().toString());
	}

	public static boolean isPalindromeLoop(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("a"));
		System.out.println(isPalindrome("A man, a plan, a canal, panama."));
		System.out.println(isPalindromeLoop("tacoca"));
	
	}
}
