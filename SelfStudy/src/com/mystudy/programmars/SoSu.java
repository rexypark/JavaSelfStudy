package com.mystudy.programmars;
import java.util.Scanner;

public class SoSu {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		System.out.println(">");
		int a = scan.nextInt();


		for(int j1 = 2; j1<=a; j1++) {
			if(a%j1 == 0 ) {
				if(a==j1) {
					System.out.println(a + "�� �Ҽ�");
			}else {
				System.out.println(a + "�� �Ҽ��ƴ�");
				break; 
				}
			}
		}
		scan.close();

	}
}
