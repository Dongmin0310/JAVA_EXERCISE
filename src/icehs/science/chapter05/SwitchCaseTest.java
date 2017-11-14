package icehs.science.chapter05;

public class SwitchCaseTest {

	public static void main(String[] args) {
		int first=10;
		int second=20;
		int third=40;
		int forth=50;
		int fifth=80;
		
		double result=first*second/2*0.6;
		result+=(third+forth)/2*0.13;
		result+=fifth*0.27;
		System.out.println("평가 점수 : "+result);
		
		int intResult=(int)result/10;
		
		switch(intResult) {
		case 9:System.out.println("Special Class 입니다."); break;
		case 8:System.out.println("Gold Class 입니다."); break;
		case 7:System.out.println("Silver Class 입니다."); break;
		case 6:System.out.println("Bronze Class 입니다."); break;
		default:System.out.println("Member Class 입니다."); break;
		}
		
	}

}
