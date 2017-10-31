package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name="홍길동";
		String mathSc="96";
		int engSc=82;
		
		int parseMathSc=Integer.parseInt(mathSc);
		
		System.out.println("이름 : "+name);
		System.out.println("수학 점수 : "+mathSc);
		System.out.println("영어 점수 : "+engSc);
		System.out.println("----------");
		System.out.println(mathSc+engSc);
		System.out.println(parseMathSc+engSc);

	}

}
