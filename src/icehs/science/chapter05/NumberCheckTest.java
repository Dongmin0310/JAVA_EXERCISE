package icehs.science.chapter05;

import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		int first=getUserInput(); 
		int second=getUserInput(); 
		System.out.println("�Է��Ͻ� ���ڰ� "+first+", "+second+"�Դϱ�?");
		
		if(first*second<10 && first*second>0) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}
		else if(first*second>=10 && first*second<100) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}
		else if(first*second>=100) {
			System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		}
		else if(first*second<0) {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
	}
	
	public static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		return input;
	}
	
}
