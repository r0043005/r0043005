package test;

import java.util.Arrays;

//JPA509 選擇排序法
//(1) 請使用選擇排序法 (Selection Sort) 撰寫程式。
//(2) 程式內有一資料陣列 {1, 3, 2, 5, 4, 6}。
//(3) 請輸出選擇排序法的比對過程。
//(4) 顯示如執行結果參考畫面。
//1 3 2 5 4 6 
//1 2 3 5 4 6 
//1 2 3 5 4 6 
//1 2 3 4 5 6 
//1 2 3 4 5 6 
public class JPA509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 5, 4, 6 };
		int temp = 0;
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] > arr[y]) {
					temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
			for (int q : arr) {
				System.out.printf("%d ", q);
			}
			System.out.println();
		}
	}
}
