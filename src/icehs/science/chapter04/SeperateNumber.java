package icehs.science.chapter04;

public class SeperateNumber {

	public static void main(String[] args) {
		int n=456;
		
		int a=n/100;
		int b=(n/10)%10;
		int c=n%10;
		
		System.out.println("���� : "+n);
		System.out.println("���� �ڸ� �� : "+a);
		System.out.println("���� �ڸ� �� : "+b);
		System.out.println("���� �ڸ� �� : "+c);

	}

}
