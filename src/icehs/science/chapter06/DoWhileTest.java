package icehs.science.chapter06;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int korscore=0;
		do {
			System.out.println("�ѱ��� ������ �Է��ϼ���.");
			korscore=getUserInput();
		}while(korscore<0||korscore>=100);
		System.out.println("������"+korscore+"�� �Դϴ�.");
	}

	private static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
