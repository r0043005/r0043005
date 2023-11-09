package test;

import java.util.Scanner;

//JPA307 迴圈最大公因數
//(1) 請設計一程式，持續輸入兩個數 m、n，m 與 n 中間以空隔鍵分隔，並以一個類別方法及 while loop 
//    計算 m 與 n 的最大公因數，直到輸入 m=999 為止。
//(2) 持續輸入兩個數 m、n，顯示如執行結果參考畫面，於下方輸出此兩數的最大公因數。
// Input:
// 8
// 12
// 4
// Input:
// 13
// 19
// 1
// Input:
// 7
// 49
// 7
// Input:
// 999
//-------------------------------------------------------------------------------
public class JPA307 {
	static void sj(int m, int n) {
		
		
		int temp=0;
		
		while (n!=0) {
				
				temp=m%n;
				m=n;
				n=temp;
		}
	
		System.out.println(m);
		}
			
			
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=0,n=0;
		System.out.println("Input");
		m=sc.nextInt();
		while (m!=999) {
			
		
			n=sc.nextInt();
			sj(m,n);
			System.out.println("Input");
			m=sc.nextInt();
		}
		
	}

}
