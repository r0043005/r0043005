package test;

import java.util.Scanner;

//JPA308 �q���g��O���`�p
//(1) David ��Y�ӳ������q�ʶR�@�t�C���q���g��]�ơA�ХH do-while �p�⦹���ʶR���`�O�ΡA
//  �ϡu�q���g��O���`�p�v�{�����`����C
//(2) do-while ���̤j�S�I���G�䤺�� statement �ܤַ|�Q����@���Cdo-while ���y�k�p�U�G
//do {
//   statement;
//   ...
//} while (exp)
//(3) �{������ɡA�p���浲�G�Ѧҵe�� (1)�A�e����ܡi�п�J���O���B�A�ο�J-1 �����G�j�A
//  �ШϥΪ̿�J�Ĥ@�����O���B�A�A���O�̧ǭn�D��J�O�ΡA�̫��J -1�C
//(4) ��ϥΪ̿�J -1�A�Y�������{���p��A�æp���浲�G�Ѧҵe�� (2)�A��X�q���g���`���O���`�X�C
//------------------------------------------------------------------------------------
//�п�J���O���B�A�ο�J-1�����G20000
//�п�J���O���B�A�ο�J-1�����G399
//�п�J���O���B�A�ο�J-1�����G199
//�п�J���O���B�A�ο�J-1�����G4000
//�п�J���O���B�A�ο�J-1�����G2000
//�п�J���O���B�A�ο�J-1�����G-1
//�q���P���`���O�G26598
public class JPA308 {
	static void test() {
		Scanner sc=new Scanner(System.in);
		int temp=0;
		int x=-1;
		do {
			System.out.print("�п�J���O���B,�ο�J-1����:");
			x=sc.nextInt();
			if(x!=-1) {
			temp+=x;
			}
			
		}while(x!=-1);
		System.out.println("�q���P���`���O:"+temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

}
