package icehs.science.chapter04;

public class AndOrOperation {

	public static void main(String[] args) {
		int a=15;
		int b=16;
		
		System.out.println(a<=b);
		System.out.println(a==b);
		//&�� |�� �ڿ������� �ϰ�, &&�� ||�� �տ��� �����̰ų� ���� ������ �ڿ����� ���� �ʴ´�.
		System.out.println(a<=b & a==b);
		System.out.println(a>=b & a==b++);
		System.out.println(b);
		System.out.println(a>=b && ++a==b);
		System.out.println(a);

	}

}
