package com.mystudy.programmars;
import java.util.Scanner;

public class NearNum {
	public static void main(String[] args) {
		// ����� �� ���ϱ�
		// 1) x�� ���� ������  =  � ���� x���� ���̰� ���� �۴�
		// 2) ������ �ּҰ��� �󸶷� �ʱ�ȭ �� ���ΰ�?
		// A(10)  :  �Է� ���� 10���� ���ڰ� ����� �迭
		// MIN : ���̰� �� �ּҰ�
		// D : 6���� ���̰�
		// K : 6�� ���� ����� ��
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �ִ� ���� �Է��Ͻÿ�");
		int numCount = 10;
		System.out.println("����� �� ���� ���� �Է��Ͻÿ�");
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
