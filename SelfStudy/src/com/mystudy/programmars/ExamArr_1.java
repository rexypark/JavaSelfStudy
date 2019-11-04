package com.mystudy.programmars;


//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, 
//solution을 완성해주세요. 
//단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 
//-1을 채워 리턴하세요. 
//예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, 
//[10]면 [-1]을 리턴 합니다.



class ExamArr_1 {

	  public static void main(String[] args) {
		  int [] arrs = {-1};
		  int [] anwser = new int[arrs.length - 1];
		  anwser = solution(arrs);
		  System.out.println(anwser[0]);
		  for (int i = 0; i < anwser.length; i++) {
			  System.out.println(anwser[i]);
		  }
		  
	  }
	  
	 
	  public static int[] solution(int[] arr) {
	      
		  int [] arrs = arr;
	      
	      int temp;
	      int isTen = 0;
	      for (int i=0; i<arrs.length; i++) {
	          if (i == 10) {
	        	  isTen = -1;
	          }else {
	          
		    	  for (int j = i+1; j<arrs.length; j++) {
		              if (i <= j) {
		                    temp = j;
		                    j = i;
		                    i = temp;
		              }
		          }
	          }
	      }
	      
	      int[] answer = {};
	      if (isTen == (-1)) {
	    	  int[] anwser = new int[1];
	    	  anwser[1] = isTen;
	      } else {
//	      int[] answer = new int[arrs.length-1];
	      for (int i = 0; i<arrs.length-1; i++) {
	          answer[i] = arrs[i];
	       }
	      }
	      return answer;
	  }
	}