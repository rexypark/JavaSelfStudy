package com.mystudy.programmars;
import java.util.Scanner;

public class NearNum {
	public static void main(String[] args) {
		// 가까운 수 구하기
		// 1) x에 가장 가깝다  =  어떤 수와 x와의 차이가 가장 작다
		// 2) 차이의 최소값을 얼마로 초기화 할 것인가?
		// A(10)  :  입력 받은 10개의 숫자가 저장될 배열
		// MIN : 차이값 중 최소값
		// D : 6과의 차이값
		// K : 6에 가장 가까운 수
		Scanner scan = new Scanner(System.in);
		System.out.println("범위 최대 수를 입력하시오");
		int numCount = 10;
		System.out.println("가까운 수 구할 수를 입력하시오");
		int nearNum = 6;
		int D,K = 0;
		int MIN = numCount - 1;
		
		int [] A = new int[numCount];
		System.out.println(A.length);
		A[0] = 1;
		System.out.println(A[0]);
		for(int i=0; i<A.length; i++) {
			A[i] =  i+1;
		}
		for(int j=0; j<=numCount; j++) {

			D =Math.abs(nearNum - A[j]);
			if(D<MIN) {
				MIN = D;
				K = A[j];
			}
			
		}
		System.out.println(K);
	}
}
