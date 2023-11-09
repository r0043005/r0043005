package test;
//JPA504 禣ん计
//(1) 禣ん计 (Fibonacci sequence) ㄏノ縱砞璸禣ん计 011235813213455
// 材计 0材 1ㄤウ计玡ㄢ计㎝
//(2) 叫ノ皚よΑ糶禣ん计 0112358132134 祘Α
//(3) 叫ㄆ 10 俱计皚盢程玡ㄢ皚﹚禣ん计﹍ノ﹍ㄓ璸衡ㄤ緇禣ん计
//(4) だ︽よΑ陪ボ禣ん计玡 10 计
public class JPA504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1=new int[10];
		arry1[0]=0;
		arry1[1]=1;
		for(int x=2;x<10;x++) {
			arry1[x]=arry1[x-2]+arry1[x-1];
		}
		for(int x:arry1) {
			
			System.out.println(x);
		}
	}

}
