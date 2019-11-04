package com.mystudy.programmars;
import java.util.Scanner;

public class choiDaeGongAcAndBae {

	public static void main(String[] args) {
		// 유클리드호제법
		
		// 1) 큰수 결정
		// 2) 큰수 / 작은수
		// 3)나머지 조사
		// > 나머지가 0이면 
		// > 최대 공약수 = 작은 수
		// > 최소 공배수 = 두 수의 곱 / 최대 공약수
		// 나머지가 0이 아니면
		// > 큰 수 = 작은 수
		// > 작은 수 = 나머지 >2부터 반복
		// A : 입력받은 첫번 째 수
		// B : 입력받은 두번 째 수
		// Big : 큰 수 Small : 작은 수
		// NMG : 나머지
		// GCM : 최대 공약수    LCM : 최소 공배수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요  :  ");
		int A = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요  :  ");
		int B = scan.nextInt();
		
		int BIG, SMALL, NMG, GCM, LCM;
		
		if(A>B) {
			BIG = A;
			SMALL = B;
		}else {
			BIG = B;
			SMALL = A;
		}
		for(int i = 0; i<BIG; i++) {
			NMG = BIG%SMALL;
			if(NMG == 0) {
				GCM = SMALL;
				// 최대공약수 = 나머지가 0일때 작은 값
				// 최대 공배수 = 두수의 곱 / 최대공약수
				LCM = A*(B/GCM);
				System.out.println("GCM : " + GCM + ", LCM  : " + LCM);
				break;
			}else {
				BIG = SMALL;
				SMALL = NMG;
			}
		}
		
		scan.close();
	}
}
