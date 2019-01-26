/**
 * 
 */
package com.pawns;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arnaud
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	
	public boolean containsIndex(int index, int[] A) {
		boolean contains = false;
		for (int i = 0; i < A.length; i++) {
			if (i == index) {
				contains = true;
				break;
			}
		}
		return contains;
	}
	
	public int solution(int[] A) {
		List<Integer> indexList = new ArrayList<Integer>();		
		int stepCount = 0;		
		int i = 0;
		indexList.add(i);
		
		while (containsIndex(i + A[i], A)) {
			if (indexList.contains(i + A[i])) { 
				stepCount = -2;
				break;
			} else {
				stepCount++;
				i = i + A[i];
				indexList.add(i);
				System.out.println("INDEX: "+ i);
			}
		} 
		
		return stepCount + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {2,3,-1,1,3}; // with {1,1,-1,1} The pawn will never jump out
		Solution pawnSteps = new Solution();
		int result = pawnSteps.solution(A);
		if (result == -1) {
			System.out.println("The pawn will never jump out.");
		} else {
			System.out.println("The pawn jumped out after " + result + " jumps.");
		}	
	}
}
