package test;

import java.util.Arrays;

//JPA503 �x�}���M
//(1) �ռ��g�@�Ө�ơA����ƥi�Ψӭp��x�} A �P B ���M�A�ϡu�x�}���M�v�{�����`����C
// int A[][] = {{1, 2, 3}, {4, 5, 6}}
// int B[][] = {{7, 8, 9}, {10, 11, 12}}
//(2) �p��x�} A �P B ���M�A�ç�ۥ[�᪺���G��b�x�} C �̡C
//(3) ��ܦp���浲�G�Ѧҵe���C
//�}�CA�����e��(3x3)�G
//01 02 03 
//04 05 06 
//
//�}�CB�����e��(3x3)�G
//07 08 09 
//10 11 12 
//
//�}�CA+B=C�A�}�CC�����e��(3x3)�G
//08 10 12 
//14 16 18 
public class JPA503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{1, 2, 3}, {4, 5, 6}};
		int B[][] = {{7, 8, 9}, {10, 11, 12}};
		int C[][]=new int[2][3];
		C=addArr(A,B,C);
		
		System.out.printf("�}�CA�����e��(3x3):\n");
		arrPrint(A);
		System.out.printf("�}�CA�����e��(3x3):\n");
		arrPrint(B);
		System.out.printf("�}�CA+B=C,�}�CC�����e��(3x3):\n");
		arrPrint(C);

	}

	private static int[][] addArr(int[][] a, int[][] b, int[][] c) {
		// TODO Auto-generated method stub
		for(int x=0;x<a.length;x++) {
			for(int y=0;y<3;y++) {
				c[x][y]=a[x][y]+b[x][y];
			}
		}return c;
	}

	private static String arrPrint(int[][] a) {
		// TODO Auto-generated method stub
		
		for(int x=0;x<a.length;x++) {
			for(int p:a[x]) {
				System.out.printf("%02d ",p);
			}
			System.out.println();
		}return "";
		}

}
