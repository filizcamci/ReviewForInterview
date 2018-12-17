package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Series {
	public static void main(String[] args) {
		// fibonacci(8);
		List<Integer> arr = Arrays.asList(3, 88, 4, 7, 8, 5, 6, 9, 11, 34, 56, 78, 98, 75, 74, 88);
		// System.out.println(maxn(arr,4));
		int[] myarr = new int[] { 2, 5, 3, 7, 5, 3, 4 };
		// System.out.println(indexOfNumber(5,myarr));
		Arrays.sort(myarr);
		//System.out.println(Arrays.binarySearch(myarr, 3));
		// System.out.println(duplicateNumber(arr));
		// System.out.println(nthhighest(arr,3));
		//System.out.println(fact(4));
		//fibonacciVersion2(8);
		System.out.println(fibonacciRecursive(11));

	}

	public static int fibonacciRecursive(int n) {
		if (n < 0)
			return n;
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

	}

	public static Integer indexOfNumber(int n, int[] arr) {
		Integer index = null;
		if (arr == null)
			return null;
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void fibonacci(int n) {
		List<Integer> nums = new ArrayList<>();
		// nums.add(0);
		nums.add(1);
		nums.add(1);
		for (int i = 1; i < (n - 1); i++) {
			nums.add(nums.get(i - 1) + nums.get(i));
		}
		System.out.println(nums);
		System.out.println("the number at index " + n + ":" + nums.get(n - 1));
	}

	public static int fact(int n) {

		if (n == 1)
			return 1;
		else {
			return n * fact(n - 1);

		}
	}

	public static void fibonacciVersion2(int n) {

		List<Integer> fib = new ArrayList<>();
		fib.add(1);
		fib.add(1);
		for (int i = 2; i < n; i++) {
			fib.add(fib.get(i - 1) + fib.get(i - 2));
		}
		System.out.println(fib);
	}

	public static List<Integer> maxn(List<Integer> list, int n) {
		// 3,5,4,7,8,5,6,9

		List<Integer> maxlist = new ArrayList<>();
		List<Integer> maxlist2 = new ArrayList<>();

		System.out.println(list);
		Collections.sort(list);
		System.out.println("sorted list:" + list);
		int max = list.get(0);

		for (int i = 0; i < n; i++) {
			maxlist2.add(list.get(list.size() - 1 - i));
//		for(int j=0;j<list.size();j++) {
//			if(list.get(j)>max) {
//				max=list.get(j);
//				
//			}
//		}
			// maxlist.add(max);

		}

		return maxlist2;
	}

	public static int duplicateNumber(List<Integer> numbers) {
		int freq = 1;
		Integer dup = 0;
		for (int i = 0; i < numbers.size(); i++) {
			freq = Collections.frequency(numbers, numbers.get(i));
			if (freq > 1)
				dup = numbers.get(i);
		}
//	Set<Integer> uni=new TreeSet<>(numbers);
//	System.out.println(uni);
//	Iterator<Integer> it = uni.iterator();
//	it.next();
//	System.out.println(it.next());
		return dup;
	}

	public static int nthhighest(List<Integer> numbers, int n) {
		Comparator<Integer> com = Comparator.comparing(i -> -i);
		Collections.sort(numbers, com);
		// Set<Integer> uni=new SortedSet<Integer>();
		SortedSet<Integer> suni = new TreeSet<>(numbers);
		List<Integer> slu = new ArrayList<>(suni);
		Collections.sort(slu, com);
		System.out.println(slu);
		return slu.get(n-1);
	}

}
