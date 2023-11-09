package test;

import java.util.Scanner;

public class JPA103a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JPA103 計算平均值
		// (1) 程式執行時，畫面顯示【Please input:】，於下方由鍵盤輸入 3 個整數，各整數中間以空隔鍵間隔，
//		    並分別存入三個整數變數。
		// (2) 計算這三個整數的平均值，平均值請取到小數第二位。
		// (3) 輸出平均值，顯示如執行結果參考畫面。
		// ------------------------------------------------------------------------------------------
//		    Please input:     ex: 3580 26400 13588
//		    Average:          ex: 14522.67
			Scanner sc=new Scanner(System.in);
			System.out.print("Please input:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			double avg=(double)(a+b+c)/3;
			System.out.printf("Average:%.2f",avg);
			
	}

}
