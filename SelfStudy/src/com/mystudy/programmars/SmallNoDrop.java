package com.mystudy.programmars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallNoDrop {
	
	//������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, 
	//solution�� �ϼ����ּ���. 
	//��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
	//������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, 
	//[10]�� [-1]�� ���� �մϴ�.
	
	public static void main(String[] args) {
		//������ ������ �迭 ����
		ArrayList<Integer> intArr = new ArrayList<>();
		
		//intArr = [5,6,8,4,1]
		intArr.add(5);
		intArr.add(6);
		intArr.add(8);
		intArr.add(4);
		intArr.add(1);
		//�Է°� Ȯ��
		System.out.println(intArr);
		//filter�Լ� ���� �� ���
		System.out.println(filter(intArr));
		
	}
	
	//filter �Լ�
	public static ArrayList filter(ArrayList intArr) {
		//��迭�̰ų� 1�� ���� ��� �� ��� -1�� �迭�� ���
		ArrayList emp = new ArrayList();
		// emp = [-1]
		emp.add(-1);
		
		
		//���� ���� �迭�� ��ų� �ϳ��� ���� �ִ� ��� [-1]�迭�� �����Ѵ�.
		if(intArr.size() <= 1) {
			intArr = emp;
		}else {
			// �����迭�� ������������ ����
			Collections.sort(intArr);
			// �迭�� reverse���� ������������ ����
			Collections.reverse(intArr);
			// ���� ���� �� ���������� ����
			intArr.remove(intArr.size()-1);
		}
		//���� �迭 �� ����
		return intArr;
	}
}
