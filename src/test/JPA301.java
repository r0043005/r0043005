package test;

import java.util.Scanner;

//JPA301 ��Ƴs�[
//(1) �Шϥ� for loop ���g�{���A��J�@�ӥ���� N�A�p�� 1 + 2 + 3 + �K + N �����G�C
//(2) �{������ɡA��ܡiInput:�j�n�D��J�@�ӥ���ơA��J�����A��U��p�� 1 + �K + N ���`�M�C
//(3) ��ܦp���浲�G�Ѧҵe���C
//Input:
//88
//1 + ... + 88 = 3916
public class JPA301 {
	public static void test() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		int range=sc.nextInt();
		int temp=0;
		for(int x=1;x<=range;x++) {
			temp+=x;
		}
		System.out.printf("1+ ... + %d = %d\n",range,temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
	}

}
