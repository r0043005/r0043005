package test;

import java.util.Scanner;

public class JPA103a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JPA103 �p�⥭����
		// (1) �{������ɡA�e����ܡiPlease input:�j�A��U�����L��J 3 �Ӿ�ơA�U��Ƥ����H�Źj�䶡�j�A
//		    �ä��O�s�J�T�Ӿ���ܼơC
		// (2) �p��o�T�Ӿ�ƪ������ȡA�����ȽШ���p�ƲĤG��C
		// (3) ��X�����ȡA��ܦp���浲�G�Ѧҵe���C
		// ------------------------------------------------------------------------------------------
//		    Please input:     ex: 3580 26400 13588
//		    Average:          ex: 14522.67
			Scanner sc=new Scanner(System.in);
			System.out.print("Please input:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			double avg=(double)(a+b+c)/3;
			System.out.printf("Average:%.2f",avg);
			
	}

}
