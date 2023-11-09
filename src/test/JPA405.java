package test;

import java.util.Scanner;

//JPA405 遞迴函數
//(1) 請利用下面的公式，撰寫遞迴函數 sum2：
//  a. sum2(1) = 2
//  b. sum2(n) = sum2(n – 1) + 2 * n
//(2) 程式執行時，顯示【Input the number n:】要求輸入 n (n >= 1)，並將 n 值代入函數中。
//(3) 顯示如執行結果參考畫面。
//------------------------------------------------------------------------------------
//Input the number n: 50
//Ans: 2550
public class JPA405 {
	
	static int loop(int n){
		
		if(n==1) {
			return 2;
		}else {
			
			return loop(n-1)+2*n;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Input the number n:");
		int n=sc.nextInt();
		System.out.print("Ans:"+loop(n));
		
	}
}
