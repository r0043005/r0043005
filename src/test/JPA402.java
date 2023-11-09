package test;

import java.util.Scanner;

//JPA402 尾端遞迴階乘計算
//(1) 尾端遞迴程式設計的特性是以另外傳入的參數來累計遞迴的答案。
//(2) 請寫一個程式持續輸入一個數 n，請個別使用尾端遞迴程式設計及迴圈，計算 n 的階乘，直到 n 輸入的數值是 999 為止。
//(3) 程式執行時，顯示【Input n (0 <= n <= 16):】要求輸入數值。
//(4) 顯示如執行結果參考畫面。
//-----------------------------------------------------------------------------------------
//Input n (0 <= n <= 16):6
//6 的階層(尾端遞迴) = 720
//6 的階層(迴圈) = 720
//Input n (0 <= n <= 16):8
//8 的階層(尾端遞迴) = 40320
//8 的階層(迴圈) = 40320
//Input n (0 <= n <= 16):999
public class JPA402 {
	static int recursion(int s,int x){
		if(s==1) {
			return x;
		}
			return recursion(s-1, x*=s);
		
	}
	static int loop(int s,int y) {
		for(int x=1;x<=s;x++) {
			y*=x;
		}
			
		return y;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sc=0;
		
		do {
			int x=1;
			int y=1;
			System.out.print("Input n (0 <= n <= 16):");
			sc=new Scanner(System.in).nextInt();
			if(sc>0 && sc<=16) {
				x=recursion(sc, x);
				y=loop(sc,y);
				System.out.println(sc+"的階層(尾端遞迴)="+x);
				System.out.println(sc+"的階層(迴圈)="+y);	
			}
			
		}while(sc!=999);
	}

}
