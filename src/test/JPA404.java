package test;

import java.util.Scanner;

//JPA404 ���j�̤j���]��
//(1) �г]�p�@�ӵ{���A�����J��Ӽ� m�Bn�A�ϥλ��j�p�� m �P n ���̤j���]�ơA���� m ��J���ƭȬO 999 ����C
//(2) �{������ɡA��ܡiInput m: �j�n�D��Jm�F��J�����C��U����ܡiInput n: �j�n�D��J n�C
//(3) �p��̤j���]�ơA��ܦp���浲�G�Ѧҵe���C
//------------------------------------------------------------------------------------
//Input m:7
//Input n:49
//�̤j���]�Ƭ� = 7
//Input m:64
//Input n:128
//�̤j���]�Ƭ� = 64
//Input m:15
//Input n:10
//�̤j���]�Ƭ� = 5
//Input m:999
public class JPA404 {
	static int loop(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			int temp = m % n;
			m = n;
			n = temp;

			return loop(m, n);
		}

	}

	static void test() {
		Scanner sc = new Scanner(System.in);
		int m = 0, n = 0;
		System.out.print("Input m:");
		m = sc.nextInt();
		while (m != 999) {
			System.out.print("Input n:");
			n = sc.nextInt();
			System.out.println("�̤j���]�Ƭ� =" + loop(m, n));
			System.out.print("Input m:");
			m = sc.nextInt();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

}
