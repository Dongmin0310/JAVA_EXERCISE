package icehs.science.chapter06;

import java.util.Scanner;

public class DuchCalculator {

	public static void main(String[] args) {
		int sumExpense=0;
		System.out.println("������ �������� ����Ǿ�����?");
		int numOfCha=getUserInput();
		System.out.println("=============================");
		System.out.println("�� ������ �� ����� �Է��ϼ���.");
		for(int i=1;i<=numOfCha;i++) {
			System.out.println(i+"�� ��� : ");
			sumExpense+=getUserInput();
		}
		System.out.println("�� ����� "+sumExpense+"�� �Դϴ�.");
		System.out.println("=============================");
		System.out.print("������ �ο����� �Է��ϼ���.");
		int numOfPeople=getUserInput();
		System.out.println("=============================");
		System.out.println("��ġ���� �ݾ�");
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
