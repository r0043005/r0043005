package test;

import java.util.Scanner;

//JPA403 ���ݻ��j����p��
//(1) �мg�@�ӵ{�������J��Ӽ� m�Bn�A�ϥΧ��ݻ��j�ΰj��p�� m �� n ����A���� m ��J���ƭȬO 999 ����C
//(2) �{������ɡA��ܡiInput m:�j�n�D��Jm�F��J�����C��U����ܡiInput n:�j�n�D��J n�C
//(3) ��ܦp���浲�G�Ѧҵe���C
//---------------------------------------------------------------------------------
//Input m:3
//Input n:6
//Ans(���ݻ��j) = 729
//Ans(�j��) = 729
//Input m:12
//Input n:3
//Ans(���ݻ��j) = 1728
//Ans(�j��) = 1728
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
				System.out.println("Ans(���q���j)="+temp);
				temp=m;
				temp=loop(m, n, temp);
				System.out.println("Ans(�j��)="+temp);
				System.out.println("Input m:");
				m=sc.nextInt();
			}
			
		}
	}

}
