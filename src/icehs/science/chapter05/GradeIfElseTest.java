package icehs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int score1=92;
		int score2=85;
		
		if(score1>=90) {
			System.out.println("홍길동 : A학점입니다.");
		}
		else {
			System.out.println("홍길동 : A학점을 받지 못했습니다.");
		}
		
		if(score2>=90) {
			System.out.println("홍길순 : A학점입니다.");
		}
		else {
			System.out.println("홍길순 : A학점을 받지 못했습니다.");
		}
	}

}
