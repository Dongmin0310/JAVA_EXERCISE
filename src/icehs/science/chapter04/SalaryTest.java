package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int n=1000000;
		int y,sy,b,sb,j,ty,tb;
		
		int y=n*12;
		int ty=y*10/100;
		int sy=y-ty;
		int b=y*20/100;
		int tb=b*55/1000;
		int sb=b-tb;
		int j=y+sy+b+sb;
		
		System.out.println("연봉 : "+y+"세후 연봉 : "+sy);
		System.out.println("보너스 : "+b+"세후 보너스 : "+ sb);
		System.out.println("지금액 : "+j);

	}

}
