// Longest subarray such that adjacent elements have at least one common digit
// Given an array of N integers, write a program that prints the length of the longest subarray such that adjacent elements of the subarray have at least one digit in common.

// Examples:

// Input : 12 23 45 43 36 97 
// Output : 3 
// Explanation: The subarray is 45 43 36 which has 
// 4 common in 45, 43 and 3 common in 43, 36. 

// Input : 11 22 33 44 54 56 63
// Output : 4
// Explanation: Subarray is 44, 54, 56, 63

public class Prob1 {
	
	public static int subarrayLength(int[] intList) {
		int subArrayCount = 0;
		for (int i = 0; i < intList.length - 1; i++) {
			System.out.println(intList[i]);
			for (int j = 0; j < String.valueOf(intList[i]).length(); j++) {
				if (String.valueOf(intList[i + 1]).indexOf(Integer.parseInt(String.valueOf(intList[i].charAt(j))))) {
					subArrayCount++;
					System.out.println(Integer.toString(intList[i]).charAt(j));
				}
			}
		}
		return subArrayCount;
	}

	public static void main(String[] args) {
		int[] test = {12, 23, 45, 43, 36, 97};
		subarrayLength(test);
	}
}
