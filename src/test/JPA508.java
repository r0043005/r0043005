 package test;

import java.util.Arrays;

//JPA508 �w�w�ƧǪk
//(1) �ШϥΪw�w�ƧǪk (Bubble Sort) ���g�{���C
//(2) �{�������@��ư}�C {2, 4, 3, 5, 7, 6, 9, 1}�C
//(3) �п�X�w�w�ƧǪk�����L�{�C
//(4) ��ܦp���浲�G�Ѧҵe���C
//--------------------------------------------------------------------------------------------------
//2 3 4 5 6 7 1 9
//2 3 4 5 6 1 7 9
//2 3 4 5 1 6 7 9
//2 3 4 1 5 6 7 9
//2 3 1 4 5 6 7 9
//2 1 3 4 5 6 7 9
//1 2 3 4 5 6 7 9
public class JPA508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {2,4,3,5,7,6,9,1};
		int temp;
		for(int y=0;y<array.length-1;y++) {
		for(int x=0;x<array.length-y-1;x++) {
		
				if(array[x]>array[x+1]){
					temp=array[x];
					array[x]=array[x+1];
					array[x+1]=temp;
					
					
				
			}
		}
		for(int q:array) {
			System.out.printf("%d ",q);
			
		}
		System.out.println();
		}
	}

}
