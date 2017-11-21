package icehs.science.chapter06;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		System.out.println("반의 학생수는?");
		int stuNo=getUserInput();
		int scoreSum=0;
		double avg=0.0;
		for(int i=1;i<=stuNo;i++) {
			System.out.print(i+"번의 점수는?");
			scoreSum+=getUserInput();
		}
	System.out.println(stuNo+"명의 총점 : "+scoreSum);	
	System.out.println(stuNo+"명의 총점 : "+(double)scoreSum/stuNo);	
	}
	public static int getUserInput() {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
