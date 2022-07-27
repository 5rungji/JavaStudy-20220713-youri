package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array5 {

	public static void main(String[] args) {

		int[] nums = new int[5];

		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		Student[] students = new Student[5];
		students[0] = new Student();
		
		for(int i = 0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
	}

}
