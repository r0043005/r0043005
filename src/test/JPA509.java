package test;

import java.util.Arrays;

//JPA509 ��ܱƧǪk
//(1) �Шϥο�ܱƧǪk (Selection Sort) ���g�{���C
//(2) �{�������@��ư}�C {1, 3, 2, 5, 4, 6}�C
//(3) �п�X��ܱƧǪk�����L�{�C
//(4) ��ܦp���浲�G�Ѧҵe���C
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
