package com.mystudy.programmars;


//������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, 
//solution�� �ϼ����ּ���. 
//��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� 
//-1�� ä�� �����ϼ���. 
//������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, 
//[10]�� [-1]�� ���� �մϴ�.



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