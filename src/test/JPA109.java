package test;
//JPA109 �ܼƽd��
//(1) �Ш̷� JPD01.java �Ҵ��Ѫ��{���A�^�ǥ��T�ȡC
//(2) gameRating ��ƻݩI�s adder ��k�H���o���T���[�`�ȡC
//(3) adder ��k���p��覡���Gskill + action + excitement�C
//(4) ��X�^�Ǫ����T�ȡA��ܦp���浲�G�Ѧҵe���C
//-----------------------------------------------------------------------------
//The rating of the game is 23
//-----------------------------------------------------------------------------
//public class JPD01 { 
//public static int adder (__________________) { 
//  return _______________;                                    
//} 
//public static int gameRating (int s, int a, int e) { 
//  return adder(__________________);                                      
//} 
//public static void main (String argv[]) { 
//                       
//} 
//} 

public class JPA109 {
		public static int adder(int s , int a ,int e) { 
		  return s+a+e;                                    
		} 
		public static int gameRating (int s, int a, int e) { 
		  return adder(s,a,e);                                      
		} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int skill = 6, action = 9, excitment = 8, result; 
	 result = gameRating(skill, action, excitment); 
	System.out.print("The rating of the game is "); 
	 System.out.println(result);   
	}

}