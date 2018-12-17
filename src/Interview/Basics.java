package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
		//System.out.println("======================");
		int l=1538129572;
		int n=1999999999;
		//System.out.println(n);
		//System.out.println(l);
		//System.out.println("======================");
		//printDiamondOfAsterisk(3);
		//Integer i=998999;
		//String val=i.toString();
		//System.out.println(val);
		//zerosToEnd(390620307);
		//System.out.println(Math.nextAfter(10.22,0.01));
		int x=maxValue(new int[] {2,3,5,9,5,6,3});
		//System.out.println(x);
		String longestWord=longestWord(new String[] {"apple", "orange", "banana","pomegranate", "cucumber"});
		//System.out.println(longestWord);
		//System.out.println(longestWordinSentence("walnut","chestnut","cinnamon","hazelnut"));
		//System.out.println(isPrime(37));
		
//		int n =5;
//		int previousNumber= 0;
//		int nextNumber= 1;
//		
//		
//		for (int i =1; i<=n; i++) {
//			previousNumber =previousNumber +nextNumber;
//			nextNumber =previousNumber -nextNumber;
//			System.out.print(previousNumber+" ");
//		}
		List<Integer> arr=Arrays.asList(1,2,2);
		//System.out.println(getMinimumUniqueSum(arr));
//		Locale currentLocale = Locale.getDefault();
//		 
//		System.out.println(currentLocale.getDisplayLanguage());
//		System.out.println(currentLocale.getDisplayCountry());
//		 
//		System.out.println(currentLocale.getLanguage());
//		System.out.println(currentLocale.getCountry());
		getNums(2,5);
		System.out.println();
		recursiveGetNums(2,5);
	}
	public static void getNums(int a, int b) {
		int n=2*a;
		for(int i=1;i<=b;i++) {
			System.out.print(n+" ");
			n=n*2;
		}
		
	}
	public static int recursiveGetNums(int a, int b) {
		if(b==1) {
			System.out.print(2*a+" ");
			return 2*a;
		}
		else {
			int c=recursiveGetNums(a,b-1);
			System.out.print(c+c+" ");
			return c+c;
		}
		
	}
	 public static int getMinimumUniqueSum(List<Integer> arr) {
		    // Write your code here
		        int sum=0;
		        for(int i=0;i<arr.size();i++){
		            for(int j=i+1; j<arr.size();j++){
		                if(arr.get(i)==arr.get(j))
		                    arr.set(j, arr.get(j)+1);
		            }
		        }
		        for(int k=0;k<arr.size();k++){
		            sum=sum+arr.get(k);
		        }
		        return sum;  
		    }
	public static boolean isPrime(int n) {
		boolean prime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return prime=false;
				
		}
		
		return prime;
	}
	public static void printab() {
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i <= j; i++) {
				if (i % 2 == 0)
					System.out.print("a");
				else
					System.out.print("b");
			}
			System.out.println();
		}
	}
	
	public static void printNumbersPymarid() {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number");
		int n = input.nextInt();
		for (int k = n; k >= 1; k--) {
			for (int i = n; i >= 1; i--) {
				for (int j = 1; j <= k; j++) {
					System.out.print(i + " ");
				}

			}
			System.out.println();
		}
	}
	public static void printDiamondOfAsterisk(int n) {
		
		for(int i=0;i<n;i++) {
			for(int k=n-1
					;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=n-i;j<=n;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=n-1;i>0;i--) {
			for(int k=0;k<n-i;k++) {
				System.out.print(" ");
			}
			for(int j=n-i;j<n;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	public static void zerosToEnd(Integer n) {
		//390620307->396237000
		String ns=n.toString();
		char[] nsc=ns.toCharArray();
		for(int i=0;i<nsc.length;i++) {
			if(nsc[i]=='0') {
				char temp=nsc[i];
				for(int j=i;j<nsc.length-1;j++) {
					nsc[j]=nsc[j+1];
					
				}
				nsc[nsc.length-1]=temp;
				
			}
		}
		System.out.println(Arrays.toString(nsc));
	}
	public static int maxValue(int[] numbers) {
		int max=1;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>max)
				max=numbers[i];
		}
		return max;
	}
	public static String longestWord(String[] words) {
		String longest="";
		for(int i=0; i<words.length; i++) {
			if(words[i].length()>longest.length())
				longest=words[i];
		}
		return longest;
	}
	
	public static String longestWordinSentence(String...words ) {
		String longest="";
		for(int i=0; i<words.length; i++) {
			if(words[i].length()>longest.length())
				longest=words[i];
		}
		return longest;
	}
	
}
