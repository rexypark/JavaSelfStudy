package com.mystudy.programmars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallNoDrop {
	
	//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, 
	//solution을 완성해주세요. 
	//단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
	//예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, 
	//[10]면 [-1]을 리턴 합니다.
	
	public static void main(String[] args) {
		//정수를 저장할 배열 선언
		ArrayList<Integer> intArr = new ArrayList<>();
		
		//intArr = [5,6,8,4,1]
		intArr.add(5);
		intArr.add(6);
		intArr.add(8);
		intArr.add(4);
		intArr.add(1);
		//입력값 확인
		System.out.println(intArr);
		//filter함수 실행 및 출력
		System.out.println(filter(intArr));
		
	}
	
	//filter 함수
	public static ArrayList filter(ArrayList intArr) {
		//빈배열이거나 1의 값만 들어 갈 경우 -1의 배열로 출력
		ArrayList emp = new ArrayList();
		// emp = [-1]
		emp.add(-1);
		
		
		//만약 받은 배열이 비거나 하나의 값만 있는 경우 [-1]배열을 리턴한다.
		if(intArr.size() <= 1) {
			intArr = emp;
		}else {
			// 받은배열을 오름차순으로 정렬
			Collections.sort(intArr);
			// 배열을 reverse시켜 내림차순으로 정렬
			Collections.reverse(intArr);
			// 제일 작은 맨 마지막값만 제거
			intArr.remove(intArr.size()-1);
		}
		//필터 배열 값 리턴
		return intArr;
	}
}
