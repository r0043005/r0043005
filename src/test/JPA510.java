package test;

import java.util.Arrays;
import java.util.Scanner;

//JPA510 二分搜尋法
//(1) 程式內有已排序資料 {5, 9, 13, 15, 17, 19, 25, 30, 45}，請使用二分搜尋法尋找輸入的資料。
//(2) 程式連續執行兩次，於程式執行時，如執行結果參考畫面 (1) 所示，顯示【請輸入要找尋的資料：】，要求輸入欲尋找的資料 n。
//(3) 若沒有搜尋到相符的數值，顯示【n 不在陣列中】，將欲尋找的資料代入 n，如執行結果參考畫面 (2) 所示。
//(4) 尋找時，列出尋找區間及此區間的中間值，搜尋幾次就列出幾項，最後產出【經過 y 次的尋找】，y 代入搜尋次數：
// 若有搜尋到相符的數值，請顯示【您要找的資料在陣列中的第 x 個位置】，x 代入輸入值，此數值位於在陣列中的第幾個位置，
// 如執行結果參考畫面 (3) 所示。
//---------------------------------------------------------------------------------------------
//請輸入要找尋的資料：2
//尋找區間：0(5)..8(45),中間：4(17)
//尋找區間：0(5)..3(15),中間：1(9)
//尋找區間：0(5)..0(5),中間：0(5)
//經過 3 次的尋找
//2不在陣列中
//請輸入要找尋的資料：30
//尋找區間：0(5)..8(45),中間：4(17)
//尋找區間：5(19)..8(45),中間：6(25)
//尋找區間：7(30)..8(45),中間：7(30)
//經過 3 次的尋找
//您要找的資料在陣列中的第7個位置
public class JPA510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		 
	        
	           }

	private static void test() {
		// TODO Auto-generated method stub
		 int[] Array = {5, 9, 13, 15, 17, 19, 25, 30, 45};
	        Arrays.sort(Array); // 确保数组已排序
	        int min=0,max=Array.length-1,mid=0;
	        boolean flag=false;
	        int count=0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("請輸入要找尋的資料：");
	        int p=scanner.nextInt();
	        
	        while (min<=max) {
	        	count++;
	        	mid=min+(max-min)/2;
	        	System.out.printf("尋找區間：%d(%d)..%d(%d),中間：%d(%d)\n",min,Array[min],max,Array[max],mid,Array[mid]);
	        	if(Array[mid]>p) {
	        		max=mid-1;
	        	}else if(Array[mid]<p) {
	        		min=mid+1;
	        	}else if(Array[mid]==p) {
	        		flag=true;
	        		break;
	        	}
	           }
	        System.out.printf("經過 %d 次的尋找\n",count);
	        if(flag) {
	        	System.out.printf("您要找的資料在陣列中的第%d個位置\n",mid);
	        	
	        }else {
	        	
	        	System.out.printf("%d不在陣列中\n",p);
	        }
		
	}
				
	}

