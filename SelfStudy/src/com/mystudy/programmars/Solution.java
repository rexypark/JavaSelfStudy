package com.mystudy.programmars;

import java.util.ArrayList;
import java.util.List;

class Solution {
    //try hello world	TrY HeLlO WoRlD

	  public static void main(String[] args) {
	      
		  solution("try hello world");
	  }  
	    
	  public static String solution(String s) {
	      
		     
	      String[] txtList = s.split(" ");
	      String all_txt = "";
	      
	      
	      for (int i = 0; i < txtList.length; i++) {
	    	  String txt = txtList[i];
	    	  String emp = "";
	    	  for (int j = 0; j < txt.length(); j++) {
		    	  if((j+1)%2 != 0) {
		    		  emp += txt.substring(j, j+1).toUpperCase();
		    	  }else {
		    		  emp += txt.substring(j, j+1);
		    	  }
		    	  
	    	  }
	    	  all_txt += emp + " ";
	      }
		  
		  
		  
	      String answer = all_txt;
		  
	      
	      System.out.println(s + "  ->  " + answer);
	      
	      
	      
	      return answer;
	  }
	}
