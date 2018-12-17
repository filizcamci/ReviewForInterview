package Interview;

import java.util.*;

public class StringExamples {

	public static void main(String[] args) {
//		isAnagram("customers", "store scum");
//		isAnagram("funeral", "real run");
//		isAnagram("William Shakespeare", "I am a weakish speller");
//		System.out.println("=============================");
//		isPalindrome("radar");
		// removeSpace("b ugun bir kasim per sembe");
		// isPalindrome("morning");
		// isPalindrome(4004);
		// isPalindrome(34567);
		// isPalindrome(456654);
//		isPalindrome("racecar");
//		System.out.println("=============================");
		//System.out.println(numberOfChars("moabcghgfhanbbcnnnnday"));
//		System.out.println(numberOfChars("persembe"));
//		System.out.println(numberOfChars("portakal"));
		// removeDuplicates("persembe gunu bize gel");
		// duplicateCharacters("persembe gunu bize gel");
		// duplicateCharacters("bugun otuz ekim ikibin onsekiz sali ");
		//removeDups("abdnsbgabcghdbavsgbsc");
		//System.out.println(haveSameLetters("aabb cd", "cdb aa b"));
		System.out.println(commons("once upon a time ","I want two plus size dresses"));

	}
	public static String rotate(String word, int n) {
		String w="";
		char[] c=word.toCharArray();
		for(int i=0;i<n;i++) {
			
		}
		return w;
	}
	public static String commons(String a,String b) {
		String common="";
		if(a==null || b==null)
			return null;
		String[] wordsa = a.split(" ");
		String[] wordsb=b.split(" ");
		for(int i=0;i<wordsa.length;i++) {
			for(int j=0;j<wordsb.length;j++) {
				if(wordsa[i].equals(wordsb[j]) && common.length()<wordsa[i].length())
					common=wordsa[i];
			}
		}
		if(common.equals(""))
			return null;
		return common;
	}

	public static boolean haveSameLetters(String word1, String word2) {
		boolean status = false;
		int count = 0;
		String w1=word1.replaceAll("\\s", "");
		String w2=word2.replaceAll("\\s", "");
		if (w1.length() != w2.length())
			return status;
		else {
			FirstWord:
			for (int i = 0; i < word1.length(); i++) {
				for (int j = 0; j < word2.length(); j++) {
					if (word1.charAt(i) == word2.charAt(j)) {
						count++;
						continue FirstWord;
					}
					
				}
			}
			if (count == word1.length())
				status = true;
		}
		return status;
	}

	public static void isAnagram(String word1, String word2) {
		boolean status = true;
		String word1copy = word1.replaceAll("\\s", "").toLowerCase();
		String word2copy = word2.replaceAll("\\s", "").toLowerCase();
		if (word1copy.length() != word2copy.length())
			status = false;
		char[] w1 = word1copy.toCharArray();
		char[] w2 = word2copy.toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		status = Arrays.equals(w1, w2);
		if (status)
			System.out.println(word1 + " and " + word2 + " are anagram words");
		else
			System.out.println(word1 + " and " + word2 + " are NOT anagram words");

	}

	public static boolean isPalindrome(String word) {
		StringBuilder sb = new StringBuilder(word);
		String reverseWord = sb.reverse().toString();
		boolean status = false;
		if (word.equalsIgnoreCase(reverseWord)) {
			System.out.println(word + " is palindrome");
			status = true;
		} else
			System.out.println(word + " is Not palindrome");
		return status;

	}

	public static void isPalindrome(Integer n) {
		String s = n.toString();
		isPalindrome(s);
		// if(isPalindrome(s))
		// System.out.println(n +" is a palindrome number");
		// else
		// System.out.println(n +" is not a palindrome number");

	}

	public static Map<Character, Integer> numberOfChars(String word) {
		Map<Character, Integer> chars = new TreeMap<>();
		for (char c = 'a'; c <= 'z'; c++) {
			int count = 0;

			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == c) {
					count++;
				}
			}
			if (count != 0)
				chars.put(c, count);
		}

		return chars;
	}

	public static void removeDuplicates(String word) {
		String nonDups = "";

		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (i == j)
					continue;
				if (word.charAt(i) == word.charAt(j)) {
					count++;
					continue;
				}
			}
			if (count == 0)
				nonDups = nonDups + word.charAt(i);

		}
		System.out.println(nonDups);
	}

	public static void removeDups(String s) {
		Set set = new HashSet();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
	}

	public static void duplicateCharacters(String word) {
		Set<Character> duplicates = new TreeSet<>();
		String w = word.replaceAll("\\s", "");
		String dups = "";
		List<Character> d = new ArrayList<>();

		for (int i = 0; i < w.length(); i++) {
			int count = 0;
			for (int j = 0; j < w.length(); j++) {
				if (i == j)
					continue;
				else {
					if (w.charAt(i) == w.charAt(j)) {
						count++;
						continue;
					}
				}
			}
			if (count != 0) {
				duplicates.add(w.charAt(i));
				dups = dups + w.charAt(i);
				if (!d.contains(w.charAt(i)))
					d.add(w.charAt(i));

			}

		}
		System.out.println(duplicates);
		System.out.println(dups);
		System.out.println(d);
	}

	public static void removeSpace(String s) {
		String ws = s.replaceAll("\\s", "");
		System.out.println(ws);
	}

	public static void permutation(String s) {
		int n = s.length();
		int perm = factorial(n);
		System.out.println("there are " + perm + " permutations");
		System.out.println("-------------------------------");
		Map<Integer, String> permutations = new HashMap<>();
		String fix = "";
		for (int i = 0; i < n; i++) {
			fix = s.substring(i);
		}
	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
