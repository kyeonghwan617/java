package com.pcwk.arrray01;

import java.util.Arrays;

public class Q04_Sort {

	public static void main(String[] args) {
		// Sort
		int[] numArr = { 7, 4, 5, 1, 3 };

		// sort전 데이터
		for (int n : numArr) {
			System.out.print(n + ",");
		}
		System.out.println();
		for (int i = 0; i < numArr.length - 1; i++) {

			for (int j = 0; j > numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[i];
					numArr[i] = tmp;
				}
			}
			System.out.println(i + "," + Arrays.toString(numArr));
		}

	}

}
