package test;

import java.util.Scanner;

//JPA309 �j�魿�ƧP�_
//(1) �p�U�� continue ���d�Ҽg�k�C
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
// Output�G
//     i = 0
//     i = 1
//     i = 3
//(2) �Х� continue �]�p�@�ӵ{���A����p�� 1 ��u�ϥΪ̿�J���ơv�����A���ǼƬO 3 �����ƩάO 5 �����ơA�Ӥ��O 7 �����ơC
//(3) �N�o�ǼƭȬۥ[���X�A��ܦp���浲�G�Ѧҵe���C
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
		System.out.println("�����ۥ[����:"+sun);

	}

}
