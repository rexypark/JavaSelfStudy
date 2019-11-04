package com.mystudy.programmars;

import java.util.ArrayList;
import java.util.Collections;



class ValReverse {

	public static void main(String[] args) {
		// long n 변수 설정
		long n = 118372;
		
		// 시작값 및 solution메서드 결과값 출력
		System.out.println("시작 값 n 출력 : " + n);
		System.out.println("내림차순 정렬 값 출력 : " + solution(n));
				
	}
	
/*	  정렬 연산식 수행
	 1. Long to String 형변환
	 2. 숫자 하나씩 리스트에 저장
	 3. 리스트를 sort함수로 오름차순 정렬
	 4. 오름차순 정렬 한 리스트를 reverse로 반전
	 5. 정렬된 값들을 string 변수에 저장
	 6. 값이 저장된 String을 Long으로 변환하여 정렬된 결과값 리턴
*/
	
	public static long solution(long n) {
	    //결과값 변수
		long answer = 0;
		
		//1. 받은 long값을 String으로 변환
		String s = String.valueOf(n);
		
		//String으로 받은 값들을 저장할 리스트 생성
		ArrayList<Character> list = new ArrayList<Character>();
		
		//2. s에 있는 문자열을 앞에서부터 하나씩 뽑아 리스트에 저장하는 반복문
		for (int i = 0; i < s.length(); i++) {
			        //chartAt(인덱스 번호) < 해당 번호에 있는 문자열 값
			list.add(s.charAt(i));
		}
		
		//3. 리스트 오름차순으로 정렬
		Collections.sort(list);
		//4. 리스트 반전 정렬
		Collections.reverse(list);
		
		//정렬된 숫자 저장 변수
		String num = "";
		
		//5. 숫자가 정렬된 리스트에서 앞에서부터 하나씩 뽑아 num변수에 저장하는 반복문
		for (int i = 0; i < s.length(); i++) {
			
			num += list.get(i);
		}
		
		//6. String인 결과값 num을 Long 타입으로 바꿔준다. 
		n = Long.parseLong(num);
		
		//anwser에 결과값 저장
		answer = n;
		
	    return answer;
	      
	  }
	
	
	
}













/**

함수 solution은 정수 n을 매개변수로 입력받습니다. 
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

입출력 예
n = 118372        
return	873211


**/
