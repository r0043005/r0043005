package test;
//JPA506 �T���}�C�������M
//(1) �]�}�C A �����׬� 4 * 2 * 3�A�]�b�{���X�̫ŧi���@�}�C�A�æb�ŧi�P�ɳ]�w��ȡA�M��p��}�C A ���Ҧ��������`�M (SUM)�C
// int A[][][] = {{{1,2,3},{4,5,6}},
//               {{7,8,9},{10,11,12}},
//               {{13,14,15},{16,17,18}},
//               {{19,20,21},{22,23,24}}}
public class JPA506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int A[][][] = {{{1,2,3},{4,5,6}},
               {{7,8,9},{10,11,12}},
               {{13,14,15},{16,17,18}},
               {{19,20,21},{22,23,24}}};
		 int temp=0;
		 for(int x=0;x<A.length;x++){
		
			 for(int y=0;y<A[x].length;y++){
				 
				 for(int z=0;z<A[x][y].length;z++){
					 temp+=A[x][y][z];
					 System.out.print(x==A.length-1 && z==A[x][y].length-1?A[x][y][z]+"="+temp:A[x][y][z]+"+");
					 
				 }
				
			 }
			 
		 }
	}

}
