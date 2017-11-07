package icehs.science.chapter04;

public class AndOrOperation {

	public static void main(String[] args) {
		int a=15;
		int b=16;
		
		System.out.println(a<=b);
		System.out.println(a==b);
		//&나 |는 뒤에꺼까지 하고, &&나 ||는 앞에서 거짓이거나 참이 나오면 뒤에꺼를 하지 않는다.
		System.out.println(a<=b & a==b);
		System.out.println(a>=b & a==b++);
		System.out.println(b);
		System.out.println(a>=b && ++a==b);
		System.out.println(a);

	}

}
