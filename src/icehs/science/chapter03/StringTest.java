package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String name="¼¼Á¾´ë¿Õ";
		String value="10000";
		int year=2017;
		
		System.out.println(name + ":" +value);
		System.out.println(year + "³â");
		System.out.println(value+year);

		int parseValue=Integer.parseInt(value);
		System.out.println(parseValue+year);
	}
}
