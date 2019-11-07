package com.mystudy.programmars;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[][] a = new int[2][2];
		System.out.println(a.length);
		a[0][1] = 1;	
	
		for (int i = 0; i<=a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}

