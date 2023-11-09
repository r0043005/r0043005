package test;

import java.util.Scanner;

//JPA301 整數連加
//(1) 請使用 for loop 撰寫程式，輸入一個正整數 N，計算 1 + 2 + 3 + … + N 的結果。
//(2) 程式執行時，顯示【Input:】要求輸入一個正整數，輸入完畢，於下方計算 1 + … + N 的總和。
//(3) 顯示如執行結果參考畫面。
//Input:
//88
//1 + ... + 88 = 3916
public class JPA301 {
	public static void test() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		int range=sc.nextInt();
		int temp=0;
		for(int x=1;x<=range;x++) {
			temp+=x;
		}
		System.out.printf("1+ ... + %d = %d\n",range,temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
	}

}
