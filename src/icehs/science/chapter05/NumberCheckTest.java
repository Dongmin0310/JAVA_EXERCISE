package icehs.science.chapter05;

import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		int first=getUserInput(); 
		int second=getUserInput(); 
		System.out.println("입력하신 숫자가 "+first+", "+second+"입니까?");
		
		if(first*second<10 && first*second>0) {
			System.out.println("한 자리 수입니다.");
		}
		else if(first*second>=10 && first*second<100) {
			System.out.println("두 자리 수입니다.");
		}
		else if(first*second>=100) {
			System.out.println("세 자리 수 이상입니다.");
		}
		else if(first*second<0) {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
	}
	
	public static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}
	
}
