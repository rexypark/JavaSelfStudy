package com.mystudy.programmars;

import java.util.ArrayList;
import java.util.Collections;



class ValReverse {

	public static void main(String[] args) {
		// long n ���� ����
		long n = 118372;
		
		// ���۰� �� solution�޼��� ����� ���
		System.out.println("���� �� n ��� : " + n);
		System.out.println("�������� ���� �� ��� : " + solution(n));
				
	}
	
/*	  ���� ����� ����
	 1. Long to String ����ȯ
	 2. ���� �ϳ��� ����Ʈ�� ����
	 3. ����Ʈ�� sort�Լ��� �������� ����
	 4. �������� ���� �� ����Ʈ�� reverse�� ����
	 5. ���ĵ� ������ string ������ ����
	 6. ���� ����� String�� Long���� ��ȯ�Ͽ� ���ĵ� ����� ����
*/
	
	public static long solution(long n) {
	    //����� ����
		long answer = 0;
		
		//1. ���� long���� String���� ��ȯ
		String s = String.valueOf(n);
		
		//String���� ���� ������ ������ ����Ʈ ����
		ArrayList<Character> list = new ArrayList<Character>();
		
		//2. s�� �ִ� ���ڿ��� �տ������� �ϳ��� �̾� ����Ʈ�� �����ϴ� �ݺ���
		for (int i = 0; i < s.length(); i++) {
			        //chartAt(�ε��� ��ȣ) < �ش� ��ȣ�� �ִ� ���ڿ� ��
			list.add(s.charAt(i));
		}
		
		//3. ����Ʈ ������������ ����
		Collections.sort(list);
		//4. ����Ʈ ���� ����
		Collections.reverse(list);
		
		//���ĵ� ���� ���� ����
		String num = "";
		
		//5. ���ڰ� ���ĵ� ����Ʈ���� �տ������� �ϳ��� �̾� num������ �����ϴ� �ݺ���
		for (int i = 0; i < s.length(); i++) {
			
			num += list.get(i);
		}
		
		//6. String�� ����� num�� Long Ÿ������ �ٲ��ش�. 
		n = Long.parseLong(num);
		
		//anwser�� ����� ����
		answer = n;
		
	    return answer;
	      
	  }
	
	
	
}













/**

�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.

����� ��
n = 118372        
return	873211


**/
