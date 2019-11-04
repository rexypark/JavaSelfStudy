package com.mystudy.programmars;
import java.util.Scanner;

public class SoSu {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.println(">");
		int a = scan.nextInt();


		for(int j1 = 2; j1<=a; j1++) {
			if(a%j1 == 0 ) {
				if(a==j1) {
					System.out.println(a + "은 소수");
			}else {
				System.out.println(a + "은 소수아님");
				break; 
				}
			}
		}
		scan.close();

	}
}
