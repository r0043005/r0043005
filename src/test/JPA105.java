package test;

import java.util.Scanner;
public class JPA105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//JPA105 �s����
		//(1) ���@��p�B�ͱq�p�N�}�l�� 1 ���B5 ���B10 ���B50 �����s�ο��A��i�ۤv���s�����̡C�Эp��X�s�������������`�B�C
		//(2) �{������ɡA�����n�D��J�m�W�A��ܡi�п�J�z���m�W�G�j�A��ܦp���浲�G�Ѧҵe�� (1)�C
		//(3) �m�W��J�����A�n�D��J�ɪO�ӼơA��ܦp���浲�G�Ѧҵe�� (2)�C
		//(4) �̧ǭn�D��J 1 ���B5 ���B10 ���B50 ���w�����ƶq�A�ݿ�J���~�i�A��ܤU�@�C�A��ܦp���浲�G�Ѧҵe�� (3)�C
		//(5) ���B��J�����A��X�`�B�A��ܦp���浲�G�Ѧҵe�� (4)�C
		//---------------------------------------------------------------------------------------------------------
		//(1) �{������ɡA�����n�D��J�m�W�C
//		    �п�J�z���m�W�G   ex:�L�λ�
		//(2) �m�W��J�����A�n�D��J�ɪO�ӼơC
//		    Hi, �L�λ�,�п�J�z���ɪO���ӼơG    
		//(3) �̧ǭn�D��J 1 ���B5 ���B10 ���B50 ���w�����ƶq�A�ݿ�J���~�i�A��ܤU�@�C
//		    �п�J1�����ƶq�G         ex:80
//		    �п�J5�����ƶq�G         ex:70
//		    �п�J10�����ƶq�G        ex:55
//		    �п�J50�����ƶq�G        ex:38
		//(4) ���B��J�����A��X�`�B�C
//		    �z�����`�@���G2 �d 8 �� 8 �Q 0 ��
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�J�m�W:");
		String name=sc.next();
		System.out.printf("Hi,%s,�п�J�z���ɪO�Ӽ�%n",name);
		System.out.print("�M��J1�����ƶq:");
		int coin1=sc.nextInt();
	//	System.out.println();
		System.out.print("�M��J5�����ƶq:");
		int coin5=sc.nextInt();
		//System.out.println();
		System.out.print("�M��J10�����ƶq:");
		int coin10=sc.nextInt();
		//System.out.println();
		System.out.print("�M��J50�����ƶq:");
		int coin50=sc.nextInt();
	//	System.out.println();
		System.out.print("���B��J����,��X�`�B");
		int sum=coin1*1+coin5*5+coin10*10+coin50*50;
		System.out.println(sum/1000%10);
		System.out.printf("�z�����`�@��:%d�U%d�d%d��%d�Q%d��", sum/10000 ,sum / 1000 %10,sum / 100 % 10,sum / 10 % 10,sum % 10);
		
		
		
		
		
	}

}