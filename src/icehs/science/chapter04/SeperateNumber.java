package icehs.science.chapter04;

public class SeperateNumber {

	public static void main(String[] args) {
		int n=456;
		
		int a=n/100;
		int b=(n/10)%10;
		int c=n%10;
		
		System.out.println("숫자 : "+n);
		System.out.println("백의 자리 수 : "+a);
		System.out.println("십의 자리 수 : "+b);
		System.out.println("일의 자리 수 : "+c);

	}

}
