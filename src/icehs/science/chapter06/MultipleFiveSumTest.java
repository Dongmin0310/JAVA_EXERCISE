package icehs.science.chapter06;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int sum=0, i=1;
		while(sum<100) {
			int number=i*5;
			sum+=number;
			i++;
		}
		System.out.println(sum);

	}

}
