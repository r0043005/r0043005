package test;

import java.util.Scanner;

//JPA304 �\�I�O��
//(1) ������B�ͨ쪾�W�����\�U�y�͡A���\�U���I�\���p��覡�C
//(2) �{������ɡA�p���浲�G�Ѧҵe�� (1)�A�e����ܡiPlease enter meal dollars or enter -1 to stop:�j�A
//  �ШϥΪ̿�J�Ĥ@�D�\�I�O�ΡA�A���O�̧ǭn�D��J��L�D�\�I���O�ΡC
//(3) �Y�n�������{���p��A�ݿ�J -1 �ᰱ��{���p��A-1 ���C�J�\�I�p�⪺�O�Τ��C�p���浲�G�Ѧҵe�� (2)�A
//  ��X�\�I�ƶq�B�Ҧ��\�I���`�O�ΤΥ����t��O�ΡA�����Ȩ��ܤp�ƲĤG��C
//(4) ��ܦp���浲�G�Ѧҵe���C
//-------------------------------------------------------------------------------------------------
//Please enter meal dollars or enter -1 to stop: 180
//Please enter meal dollars or enter -1 to stop: 120
//Please enter meal dollars or enter -1 to stop: 99
//Please enter meal dollars or enter -1 to stop: 399
//Please enter meal dollars or enter -1 to stop: 150
//Please enter meal dollars or enter -1 to stop: -1
//�\�I�`�O��:948
//5 �D�\�I�����O�ά�: 189.60 
public class JPA304 {
public static void test() {
	Scanner sc=new Scanner(System.in);
	int temp=0;
	int count=0;
	boolean flag=false;
	while (!flag) {
		System.out.println("Please enter meal dollars or enter -1 to stop:");
		int a=sc.nextInt();
		if(a==-1) {
			flag=true;
		}else {
			temp+=a;
			count+=1;
		}
		
	}
	System.out.println("�\�I�`�O��:"+temp);
	System.out.printf("%d�D�\�I�����O�ά�:%.2f",count,(double)temp/count);
}
	public static void main(String[] args) {
		test();
	}
}
