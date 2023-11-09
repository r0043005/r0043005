package test;

import java.util.Scanner;

//JPA401 遞迴階乘計算
//(1) 請寫一個程式持續輸入一個數 n，使用遞迴計算 n 的階乘，直到 n 輸入的數值是 999 為止。
//(2) 程式執行時，顯示【Input n (0 <= n <= 16):】要求輸入數值。
//(3) 顯示如執行結果參考畫面。
//--------------------------------------------------------------------------------------
//Input n (0 <= n <= 16):6
//6 的階層 = 720
//Input n (0 <= n <= 16):10
//10 的階層 = 3628800
//Input n (0 <= n <= 16):999

public class JPA401 {
	static int test(int s ,int x) {
		if(s==1) {
			return x;
		}
		x*=s;
		return test(s-1,x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sc=0;
		
		do {
			int x=1;
			System.out.print("Input n (0 <= n <= 16):");
			 sc=new Scanner(System.in).nextInt();
			 if(sc>0 && sc<=16) { 
			x = test(sc,x);
			System.out.println(sc+"的階層"+x);
			}
		}while(sc!=999);
	}

}
