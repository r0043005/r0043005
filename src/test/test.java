package test;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		LineNumberReader lr;
		String st;
		String stArr[];
		ArrayList<String[]> arrList = new ArrayList<>();
		
		TreeSet<Student> nameSort = new TreeSet<>();
		TreeSet<Student> ageSort = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getAge(), o2.getAge());
			}
		});
	//	TreeSet<Student> ageSort = new TreeSet<>(new AgeComparator());
		HashMap<String, String[]> hs = new HashMap<String, String[]>();
		try {
			// 讀取檔案將資料
			fr = new FileReader("101.csv");
			lr = new LineNumberReader(fr);
			while (lr.ready()) {
				st = lr.readLine();
				//陣列儲存分割字串
				stArr = st.split(",");
				// 資料放入ArrayList
				arrList.add(stArr);
				// 資料放入TreeSet
				Student stq = new Student(stArr);
				nameSort .add(stq);
				ageSort.add(stq);
				// 資料放入HashMap
				for (int x = 0; x < stArr.length; x++) {
					hs.put(stArr[0], stArr);
				}
			}
			// 輸出ArrayList內的學生資料
			System.out.println("---------------ArrayList輸出---------------");
			for (int i = 0; i < arrList.size(); i++) {
				System.out.println(Arrays.toString(arrList.get(i)));
			}
			System.out.println();
			System.out.println("-------------TreeSet姓名排序輸出 -------------");
			// 按姓名排序輸出
			System.out.println("按姓名排序：");
			for (Student student :nameSort) {
				System.out.println(student);
			}
			System.out.println();
			System.out.println("-------------TreeSet年齡排序輸出 -------------");
			// 按年齡排序輸出
			System.out.println("按年齡排序：");
			for (Student student :ageSort) {
				System.out.println(student);
			}
			System.out.println();
			System.out.println("-------------HashMap姓名搜尋輸出 -------------");
			getName(hs);
			lr.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void getName(HashMap<String, String[]> hs) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] temp = new String[3];
		do {
			int flag = 0;
			System.out.print("請輸入要搜索的名稱:");
			String name = sc.next();
			for (String i : hs.keySet()) {
				if (i.equals(name)) {
					temp = hs.get(i);
					System.out.println("姓名: " + temp[0] + " 年齡:" + temp[1] + " 分數:" + temp[2]);
					flag = 1;
					System.out.println("是否繼續搜尋:1.繼續 2.離開");
					name = sc.next();
					if (name.equals("2")) {
						return;
					}
				}
			}
			if (flag == 0)
				System.out.println("找不到資料重新輸入");
		} while (true);
	}
}

class Student implements Comparable<Student> {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	private String name;
	private int age;
	private int score;

	public Student(String[] starr) {
		this.name = starr[0];
		this.age = Integer.parseInt(starr[1]);
		this.score = Integer.parseInt(starr[2]);
	}

	@Override
	public int compareTo(Student otherStudent) {
		return this.name.compareTo(otherStudent.name);
	}

	@Override
	public String toString() {
		return "姓名: " + name + " 年齡: " + age + " 分數: " + score;
	}
}