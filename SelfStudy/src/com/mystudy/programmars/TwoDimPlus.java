package com.mystudy.programmars;

public class TwoDimPlus {
//	행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 
//	같은 열의 값을 서로 더한 결과가 됩니다. 
//	2개의 행렬 arr1과 arr2를 입력받아, 
//	행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.   
      
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
		
		
		//arr[행][열]
		for (int i = 0; i<=arr1.length - 1; i++) {
			for (int j = 0; j <= arr1[arr1.length-1].length - 1; j++) {
				arr1[i][j] = num++;
				arr2[i][j] = num2++;
			}
		}
		//입력 받은 Arrays
		printArr(arr1);
		printArr(arr2);
		
		int[][] answerArr = new int[row][col];
		if (arr1.length == arr2.length) {
				answerArr = solution(arr1,arr2);
		} else {
			System.out.println("배열의 크기가 다릅니다.");
		}
		
		//두 배열을 더한 배열 출력
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
