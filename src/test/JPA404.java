package test;

import java.util.Scanner;

//JPA404 患癹程そ计
//(1) 叫砞璸祘Α尿块ㄢ计 mnㄏノ患癹璸衡 m 籔 n 程そ计 m 块计琌 999 ゎ
//(2) 祘Α磅︽陪ボInput m: 璶―块m块Ч拨︽陪ボInput n: 璶―块 n
//(3) 璸衡程そ计陪ボ磅︽挡狦把σ礶
//------------------------------------------------------------------------------------
//Input m:7
//Input n:49
//程そ计 = 7
//Input m:64
//Input n:128
//程そ计 = 64
//Input m:15
//Input n:10
//程そ计 = 5
//Input m:999
public class JPA404 {
	static int loop(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			int temp = m % n;
			m = n;
			n = temp;

			return loop(m, n);
		}

	}

	static void test() {
		Scanner sc = new Scanner(System.in);
		int m = 0, n = 0;
		System.out.print("Input m:");
		m = sc.nextInt();
		while (m != 999) {
			System.out.print("Input n:");
			n = sc.nextInt();
			System.out.println("程そ计 =" + loop(m, n));
			System.out.print("Input m:");
			m = sc.nextInt();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

}
