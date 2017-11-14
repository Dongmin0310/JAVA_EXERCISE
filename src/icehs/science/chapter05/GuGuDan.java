package icehs.science.chapter05;

public class GuGuDan {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(j%2==0) {
					System.out.print(i+"*"+j+"="+i*j+"\t");					
				}
			}
			System.out.println();
		}

	}

}
