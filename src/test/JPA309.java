package test;

import java.util.Scanner;

//JPA309 癹伴计耞
//(1)  continue ぇ絛ㄒ糶猭
// class Ex {
//     public static void main(String argv[]) throws IOException {
//         for (int i=0; i<4; i++) {
//             if(i == 2) {
//             continue;
//             }
//             System.out.println("i = " + i);
//         }
//     }
// }
// Output
//     i = 0
//     i = 1
//     i = 3
//(2) 叫ノ continue 砞璸祘Α镑璸衡 1 ㄏノ块计ぇいêㄇ计琌 3 计┪琌 5 计τぃ琌 7 计
//(3) 盢硂ㄇ计块陪ボ磅︽挡狦把σ礶
//---------------------------------------------------------------
public class JPA309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sc=new Scanner(System.in).nextInt();
		int sun=0;
		System.out.println("Output:");
		for(int x=1;x<=sc;x++) {
			if(x%7==0) {
				continue;
			}
			if(x % 3==0 || x%5==0) {
				sun+=x;
				System.out.println("i="+x);
			}
		}
		System.out.println("场单:"+sun);

	}

}
