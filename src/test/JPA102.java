package test;

import java.util.Scanner;

public class JPA102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JPA102 ��촫��
		// (1) �{������ɡA�e����ܡiPlease input:�j�A�������L��J�Ʀr��A��X�ഫ�ƭ� (�Ѥ����ഫ���S��)�A
		//��ܦp���浲�G�Ѧҵe�� (2)�C
		// (2) ����ഫ�������G1 ���絥�� 2.20462 �S�C
		// -------------------------------------------------------------------------------------------------
		// (1) �{������ɡA�e����ܡiPlease input:�j�C ex: 15
		// (2) �����J�Ʀr�A�i�����ഫ�A��� kg = ponds�C ex: 15.000000 kg = 33.069300 ponds
		Scanner sc=new Scanner(System.in);
		System.out.print("Please input:");
		double kg=sc.nextDouble();
		double pub=kg*2.20462;
		System.out.printf("kg = ponds�C ex: %.6f kg = %.6f ponds",kg,pub);
		
	}

}
