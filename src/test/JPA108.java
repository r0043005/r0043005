package test;

public class JPA108 {
	public static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static double add(double a,double b) {
		double sum=a+b;
		return sum;
	}
	public static String add(String a,String b) {
		String sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JPA108 �и���k
		//(1) �Цb�P�@�����O���A�ϥ��и� (OverLoad) ���g�T�ӦP�˦W�� add ����k�C
		//(2) �ŧi main ��k�A���O���ѥH�U a�Bb�Bc ���ѼơC
		//a. add(2, 3);
		//b. add(5.2, 4.3);
		//c. add(��I Love ��, ��Java!!��);
		//(3) ��k�@�G�ǤJ��Ӿ�� (int, int)�A�p���Ӿ�ƪ��M (int)�C�{������ɡA�C�X�iAdding two integers: i,j�j�A
//		    �ЩI�s main ��k���� add(2, 3)�A�N�ѼƥN�J i,j ���C
		//(4) ��k�G�G�ǤJ��ӯB�I�� (double, double)�A�p���ӯB�I�ƪ��M (double)�C�{������ɡA�C�X�iAdding two doubles: i,j�j�A
//		    �ЩI�s main ��k���� add(5.2, 4.3)�A�N�ѼƥN�J i,j ���C
		//(5) ��k�T�G�ǤJ��Ӧr��(String, String)�A�p��X�᪺֫��Ӧr�� (String)�C�{������ɡA�C�X�iAdding two strings: i,j�j�A
//		    �ЩI�s main ��k���� add(��I Love ��, ��Java!!��)�A�N�ѼƥN�J i,j ���C
		//(6) �̫�̧���ܦ��T�Ӥ�k�ҭp��X���C�L�ȡA��ܦp���浲�G�Ѧҵe���C
		//-------------------------------------------------------------------------------------------------------------------
		//  Adding two integers: 2,3
		//  Adding two doubles: 5.2,4.3
		//  Adding two strings: I love ,java!!
		//  5 9.500000 I love Java!!
		//--------------------------------------------------------------------------------------------------------------------
		//class JPD01 {

		System.out.printf("�iAdding two integers:%s\n","2, 3");
		System.out.printf("�iAdding two integers:%s\n","5.2, 4.3");
		System.out.printf("�iAdding two integers:%s\n","I Love ,Java!!");
		System.out.printf("%d %f %s",add(2, 3),add(5.2, 4.3),add("I Love ", "Java!!"));
		
	}

}