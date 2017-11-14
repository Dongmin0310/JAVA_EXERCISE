package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
				
		for(int i=1;i<=1000;i++) {
			a+=i;
		}
		
		for(int j=1;j<=1000;j++) {
			if(j%2==0) {
				b+=j;
			}
		}
		for(int k=1;k<=1000;k++) {
			if(k%2!=0) {
				c+=k;
			}
		}
		
		System.out.println("1부터 1000까지의 합 : "+a);
		System.out.println("1부터 1000까지의 짝수들의 합 : "+b);
		System.out.println("1부터 1000까지의 홀수들의 합 : "+c);
	}

}
