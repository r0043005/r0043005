package test;

import java.util.Scanner;

//JPA507 �����O�έp��
//(1) �Хΰ}�C�覡�g�X�����O�έp�⪺�{���C
//(2) ���]�����ɬq�����G
// a. 2 �p�ɥH�� (�t 2 �p��)�A�C�p�ɥH 30 ���p��C
// b. 2 �p�ɥH�W���� 4 �p�ɡA�C�p�ɥH 50 ���p��C
// c. 4 �p�ɥH�W���� 6 �p�ɡA�C�p�ɥH 80 ���p��C
// d. 6 �p�ɥH�W�A�C�p�ɥH 100 ���p��C
//(3) �п�J�����ɼƨíp��X�����O�ΡA���O�p�� 2 �p�ɡB3 �p�ɡB5 �p�ɤ� 8 �p�ɪ���ú�O�ΡA��ܦp���浲�G�Ѧҵe���C
//-------------------------------------------------------------------------------------------------
//�����ɼơG2�p��
//��ú�O�ΡG60����
//--------------------
//�����ɼơG3�p��
//��ú�O�ΡG110����
//--------------------
//�����ɼơG5�p��
//��ú�O�ΡG240����
//--------------------
//�����ɼơG8�p��
//��ú�O�ΡG520����
public class JPA507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��J�����ɼ�:");
		int ttime = sc.nextInt();
		System.out.printf("�����ɼơG%d�p��\n",ttime);
		int[] prices= {30,50,80,100};
		int[] time = {0,2,4,6};
		int sumPrices = 0;
		for(int x=3;x>=0;x--) {
			if(ttime>time[x]) {
				sumPrices+=(ttime-time[x])*prices[x];
				ttime=time[x];
			}
		}
		System.out.printf("��ú�O�ΡG%d����",sumPrices);
		
	}
}
