package com.mystudy.programmars;
import java.util.Scanner;

public class choiDaeGongAcAndBae {

	public static void main(String[] args) {
		// ��Ŭ����ȣ����
		
		// 1) ū�� ����
		// 2) ū�� / ������
		// 3)������ ����
		// > �������� 0�̸� 
		// > �ִ� ����� = ���� ��
		// > �ּ� ����� = �� ���� �� / �ִ� �����
		// �������� 0�� �ƴϸ�
		// > ū �� = ���� ��
		// > ���� �� = ������ >2���� �ݺ�
		// A : �Է¹��� ù�� ° ��
		// B : �Է¹��� �ι� ° ��
		// Big : ū �� Small : ���� ��
		// NMG : ������
		// GCM : �ִ� �����    LCM : �ּ� �����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���  :  ");
		int A = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���  :  ");
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
				// �ִ����� = �������� 0�϶� ���� ��
				// �ִ� ����� = �μ��� �� / �ִ�����
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
