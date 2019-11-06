package com.mystudy.programmars;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j = 1;
		for (int i = 1; i <= j; i++) {
			
			System.out.println("a");
			int a = scan.nextInt();
			if (a == 1) {
				continue;
			} else {
				i--;	
			}
			
			
		}
	}
}
