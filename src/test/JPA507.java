package test;

import java.util.Scanner;

//JPA507 停車費用計算
//(1) 請用陣列方式寫出停車費用計算的程式。
//(2) 假設停車時段分為：
// a. 2 小時以內 (含 2 小時)，每小時以 30 元計算。
// b. 2 小時以上不足 4 小時，每小時以 50 元計算。
// c. 4 小時以上不足 6 小時，每小時以 80 元計算。
// d. 6 小時以上，每小時以 100 元計算。
//(3) 請輸入停車時數並計算出停車費用，分別計算 2 小時、3 小時、5 小時及 8 小時的應繳費用，顯示如執行結果參考畫面。
//-------------------------------------------------------------------------------------------------
//停車時數：2小時
//應繳費用：60元整
//--------------------
//停車時數：3小時
//應繳費用：110元整
//--------------------
//停車時數：5小時
//應繳費用：240元整
//--------------------
//停車時數：8小時
//應繳費用：520元整
public class JPA507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入停車時數:");
		int ttime = sc.nextInt();
		System.out.printf("停車時數：%d小時\n",ttime);
		int[] prices= {30,50,80,100};
		int[] time = {0,2,4,6};
		int sumPrices = 0;
		for(int x=3;x>=0;x--) {
			if(ttime>time[x]) {
				sumPrices+=(ttime-time[x])*prices[x];
				ttime=time[x];
			}
		}
		System.out.printf("應繳費用：%d元整",sumPrices);
		
	}
}
