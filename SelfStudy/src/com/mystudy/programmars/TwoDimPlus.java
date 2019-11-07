package com.mystudy.programmars;

public class TwoDimPlus {
//	占쏙옙占쏙옙占? 占쏙옙占쏙옙占쏙옙 占쏙옙占? 占쏙옙占쏙옙 크占썩가 占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙占? 占쏙옙占쏙옙 占쏙옙, 
//	占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占? 占싯니댐옙. 
//	2占쏙옙占쏙옙 占쏙옙占? arr1占쏙옙 arr2占쏙옙 占쌉력받억옙, 
//	占쏙옙占? 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占? 占쏙옙환占싹댐옙 占쌉쇽옙, solution占쏙옙 占싹쇽옙占쏙옙占쌍쇽옙占쏙옙.   
      
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
		
		
		//arr[占쏙옙][占쏙옙]
		for (int i = 0; i<=arr1.length - 1; i++) {
			for (int j = 0; j <= arr1[arr1.length-1].length - 1; j++) {
				arr1[i][j] = num++; 
				arr2[i][j] = num2++;
			}
		}
		//占쌉뤄옙 占쏙옙占쏙옙 Arrays
		System.out.println("=초기 배열=\n");
		printArr(arr1);
		printArr(arr2);
		System.out.println("========");
		
		int[][] answerArr = new int[row][col];
		if (arr1.length == arr2.length) {
				answerArr = solution(arr1,arr2);
		} else {
			System.out.println("111123占썼열占쏙옙 크占썩가 占쌕몌옙占싹댐옙.");
		}
		System.out.println("|");
		System.out.println("V");
		System.out.println();
		//占쏙옙 占썼열占쏙옙 占쏙옙占쏙옙 占썼열 占쏙옙占?
		//두배열의 
		System.out.println("두배열의 합");
		System.out.println("========");
		printArr(answerArr);
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {

		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for (int i = 0; i<=arr1.length - 1; i++) {
			for (int j = 0; j <= arr1[i].length - 1; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println();
	      return answer;
	  }

	public static void printArr(int[][] arr) {
		for (int i = 0; i<=arr.length - 1; i++) {
			for (int j = 0; j <= arr[arr.length-1].length - 1; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
