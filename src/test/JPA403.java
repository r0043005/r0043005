package test;

import java.util.Scanner;

//JPA403 尾端遞迴次方計算
//(1) 請寫一個程式持續輸入兩個數 m、n，使用尾端遞迴及迴圈計算 m 的 n 次方，直到 m 輸入的數值是 999 為止。
//(2) 程式執行時，顯示【Input m:】要求輸入m；輸入完畢。於下行顯示【Input n:】要求輸入 n。
//(3) 顯示如執行結果參考畫面。
//---------------------------------------------------------------------------------
//Input m:3
//Input n:6
//Ans(尾端遞迴) = 729
//Ans(迴圈) = 729
//Input m:12
//Input n:3
//Ans(尾端遞迴) = 1728
//Ans(迴圈) = 1728
//Input m:999
public class JPA403 {
static int recursion(int m,int n,int temp) {
	if(n==1) {
		return temp;
	}
	else {
		temp*=m;
		return recursion(m,n-1,temp);
	}
}
static int loop(int m,int n,int temp) {
	
	for(int x=1;x<n;x++) {
		temp*=m;
	}
  return temp;	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m,n,temp;
		System.out.println("Input m:");
		m=sc.nextInt();
		while(m!=999){
			
			
			System.out.println("Input n:");	
			n=sc.nextInt();
			if(m!=999) {
				temp=m;
				temp=recursion(m,n,temp);
				System.out.println("Ans(尾段遞迴)="+temp);
				temp=m;
				temp=loop(m, n, temp);
				System.out.println("Ans(迴圈)="+temp);
				System.out.println("Input m:");
				m=sc.nextInt();
			}
			
		}
	}

}
