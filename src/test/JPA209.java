package test;

import java.util.Scanner;

//JPA209 �H���y��
//(1) �м��g�{���A��J x�By �y�ЭȡA�P�_���I����H���άO�b���Ӯy�жb�W�C
//(2) �{������ɡA�e����ܡi�п�Jx�y�СG�j�n�D��J x �y�СC
//  �|�ҡG�Y��J���y�ЭȬ� (3.0, -2.5)�A��X�i�y�Э� + �b�ĥ|�H���j�F
//  �Y��J���y�ЭȬ� (4.5, 0.0)�A��X�i�y�Э� + �b x �b�W�j�C
//(3) ���ư���|���A��ܦp���浲�G�Ѧҵe�� (2)�C
//----------------------------------------------------------------------------------
//�п�Jx�y�СG4.5
//�п�Jy�y�СG0
//(4.50,0.00)�bx�b�W
//�п�Jx�y�СG0
//�п�Jy�y�СG3.2
//(0.00,3.20)�by�b�W
//�п�Jx�y�СG-5.5
//�п�Jy�y�СG-3.8
//(-5.50,-3.80)�b�ĤT�H��
//�п�Jx�y�СG-4.3
//�п�Jy�y�СG7.2
//(-4.30,7.20)�b�ĤG�H��
public class JPA209 {
	public static void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�JX�y��:");
		double x = scanner.nextDouble();
		System.out.print("�п�JY�y��:");
		double y = scanner.nextDouble();

		if (x >= 0 && y >= 0) {
			if (y == 0) {
				System.out.println("�bX�b�W");
			} else if (x == 0) {
				System.out.println("�bY�b�W");
			} else {
				System.out.printf("(%.2f,%.2f)�b�Ĥ@�H��\n",x,y);
			}
		} else if (x >= 0 && y <= 0) {
			if (y == 0) {
				System.out.println("�bX�b�W");
			} else if (x == 0) {
				System.out.println("�bY�b�W");
			} else {
				System.out.printf("(%.2f,%.2f)�b�ĥ|�H��\n",x,y);
			}

		} else if (x <= 0 && y >= 0) {
			if (y == 0) {
				System.out.println("�bX�b�W");
			} else if (x == 0) {
				System.out.println("�bY�b�W");
			} else {
				System.out.printf("(%.2f,%.2f)�b�ĤG�H��\n",x,y);
			}
		} else if (x <= 0 && y <= 0) {
			if (y == 0) {
				System.out.println("�bX�b�W");
			} else if (x == 0) {
				System.out.println("�bY�b�W");
			} else {
				System.out.printf("(%.2f,%.2f)�b�ĤT�H��\n",x,y);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
	}

}
