package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//JPA207 �T��������P�_
//(1) �мg�@�ӧP�_�T���Ϊ��{���G��T���������c���T���ήɡA�A�P�_�ӤT���ά��w���B�U���άO�����T���ΡA
//  �_�h����ܡi���i�H�c���T���Ρj�C
//(2) �c���T���Φs�b����G������ۥ[�j��ĤT��A�B�Ҥ��i�� 0�C
//(3) �����T���ΡG�䤤������䪺����M����ĤT�䪺����C
//(4) �w���T���ΡG�䤤������䪺����M�p��ĤT�䪺����C
//(5) �U���T���ΡG�����䪺����M�j��ĤT�䪺����C
//(6) �{������ɡA�e����ܡi�п�J�T�Ӿ�ơG�j�n�D��J�T�䪺����C
//(7) ���ư���|���A��ܦp���浲�G�Ѧҵe���C
//-------------------------------------------------------------------------------------------
//�п�J�T�Ӿ��:3 4 5
//�����T����
//�п�J�T�Ӿ��:3 4 6
//�w���T����
//�п�J�T�Ӿ��:4 4 3
//�U���T����
//�п�J�T�Ӿ��:2 4 7
//���i�H�c���T����
public class JPA207 {
	public static void test() {
		int[] a=new int [3];
		int[] b=new int [3];
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J�T�Ӿ��:");
		for(int k=0;k<a.length;k++) {
			a[k]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for(int x=0;x<a.length;x++) {
			
			for(int y=0;y<a.length;y++) {
			
				
				if(a[x]<a[y]) {
					
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
					
				}
			}
		}
		if(a[0]==0 && (a[0]+a[1])<a[2]) {
			System.out.println("���i�H�c���T����");
			
		}else {
			double aa=Math.pow(a[0], 2);
			double bb=Math.pow(a[1], 2);
			double cc=Math.pow(a[2], 2);
			if(aa+bb==cc) {
				System.out.println("�����T����");
				
			}else if(aa+bb<cc) {
				System.out.println("�w���T����");
				
			}else if(aa+bb>cc) {
				System.out.println("�U���T����");
				
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
