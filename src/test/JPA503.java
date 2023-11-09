package test;

import java.util.Arrays;

//JPA503 矩陣之和
//(1) 試撰寫一個函數，此函數可用來計算矩陣 A 與 B 的和，使「矩陣之和」程式正常執行。
// int A[][] = {{1, 2, 3}, {4, 5, 6}}
// int B[][] = {{7, 8, 9}, {10, 11, 12}}
//(2) 計算矩陣 A 與 B 的和，並把相加後的結果放在矩陣 C 裡。
//(3) 顯示如執行結果參考畫面。
//陣列A的內容為(3x3)：
//01 02 03 
//04 05 06 
//
//陣列B的內容為(3x3)：
//07 08 09 
//10 11 12 
//
//陣列A+B=C，陣列C的內容為(3x3)：
//08 10 12 
//14 16 18 
public class JPA503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{1, 2, 3}, {4, 5, 6}};
		int B[][] = {{7, 8, 9}, {10, 11, 12}};
		int C[][]=new int[2][3];
		C=addArr(A,B,C);
		
		System.out.printf("陣列A的內容為(3x3):\n");
		arrPrint(A);
		System.out.printf("陣列A的內容為(3x3):\n");
		arrPrint(B);
		System.out.printf("陣列A+B=C,陣列C的內容為(3x3):\n");
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
