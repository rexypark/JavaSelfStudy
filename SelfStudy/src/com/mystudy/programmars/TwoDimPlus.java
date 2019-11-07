package com.mystudy.programmars;

public class TwoDimPlus {
//	����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, 
//	���� ���� ���� ���� ���� ����� �˴ϴ�. 
//	2���� ��� arr1�� arr2�� �Է¹޾�, 
//	��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.   
      
//	arr1	        arr2        	return
//[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//[[1],[2]]	    [[3],[4]]	    [[4],[6]]
	final static int row = 2;
	final static int col = 2;
	static int num = 0;
	static int num2 = 1;
	
	
	public static void main(String[] args) {
		
		
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		
		
		//arr[��][��]
		for (int i = 0; i<=arr1.length - 1; i++) {
			for (int j = 0; j <= arr1[arr1.length-1].length - 1; j++) {
				arr1[i][j] = num++;
				arr2[i][j] = num2++;
			}
		}
		//�Է� ���� Arrays
		printArr(arr1);
		printArr(arr2);
		
		int[][] answerArr = new int[row][col];
		if (arr1.length == arr2.length) {
				answerArr = solution(arr1,arr2);
		} else {
			System.out.println("�迭�� ũ�Ⱑ �ٸ��ϴ�.");
		}
		
		//�� �迭�� ���� �迭 ���
		printArr(answerArr);
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {

		int[][] answer = {};
		for (int i = 0; i<=arr1.length - 1; i++) {
			for (int j = 0; j <= arr1[i].length - 1; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		for (int i = 0; i<=answer.length - 1; i++) {
			for (int j = 0; j <= answer[i].length - 1; j++) {
				System.out.println(answer[i][j]);
			}
		}
	      return answer;
	  }

	public static void printArr(int[][] arr) {
		for (int i = 0; i<=arr.length - 1; i++) {
			for (int j = 0; j <= arr[arr.length-1].length - 1; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
