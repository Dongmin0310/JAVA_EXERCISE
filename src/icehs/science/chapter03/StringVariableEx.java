package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		String name="ȫ�浿";
		String mathSc="96";
		int engSc=82;
		
		int parseMathSc=Integer.parseInt(mathSc);
		
		System.out.println("�̸� : "+name);
		System.out.println("���� ���� : "+mathSc);
		System.out.println("���� ���� : "+engSc);
		System.out.println("----------");
		System.out.println(mathSc+engSc);
		System.out.println(parseMathSc+engSc);

	}

}
