package icehs.science.chapter06;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int korscore=0;
		do {
			System.out.println("한국어 점수를 입력하세요.");
			korscore=getUserInput();
		}while(korscore<0||korscore>=100);
		System.out.println("점수는"+korscore+"점 입니다.");
	}

	private static int getUserInput() {
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
