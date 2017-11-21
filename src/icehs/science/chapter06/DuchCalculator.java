package icehs.science.chapter06;

import java.util.Scanner;

public class DuchCalculator {

	public static void main(String[] args) {
		int sumExpense=0;
		System.out.println("모임이 몇차까지 진행되었나요?");
		int numOfCha=getUserInput();
		System.out.println("=============================");
		System.out.println("각 차수에 쓴 비용을 입력하세요.");
		for(int i=1;i<=numOfCha;i++) {
			System.out.println(i+"차 비용 : ");
			sumExpense+=getUserInput();
		}
		System.out.println("총 비용은 "+sumExpense+"원 입니다.");
		System.out.println("=============================");
		System.out.print("모임의 인원수를 입력하세요.");
		int numOfPeople=getUserInput();
		System.out.println("=============================");
		System.out.println("더치패이 금액");
		int dutchMoney=sumExpense/numOfPeople;
		for(int i=1;i<=numOfPeople;i++) {
			if(i==numOfPeople) {
				System.out.println(numOfPeople+" : "+sumExpense);
			}
			else {
				System.out.println(i+" : "+dutchMoney);
				sumExpense-=dutchMoney;
			}
		}
	}
	
	public static int getUserInput() {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}
