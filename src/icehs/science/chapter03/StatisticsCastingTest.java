package icehs.science.chapter03;
public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lotto=0.0000001235;
		long pop=6973738433L;
		
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " + lotto);
		int intlotto=(int)lotto;
		System.out.println("�ζǿ� ��û�� Ȯ�� int ��ȯ : " + intlotto);
		System.out.println("�� ������ �α� �� : " + pop);
		int intpop=(int)pop;
		System.out.println("�� ������ �α� �� int ��ȯ : " + intpop);

	}

}
