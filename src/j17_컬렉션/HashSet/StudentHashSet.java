package j17_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		
		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");
		
		/*
		 * 1. studentList를 만들기
		 * - 학생들을 전부 다 add 시키시오.
		 * - Student 배열을 생성하고 그 배열을 리스트로 변환 후
		 * - 새로운 ArrayList를 생성하여 전체를 추가
		 * 
		 */
		
		HashSet<Student> studentList = new HashSet<Student>();
		System.out.println(studentList);

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		System.out.println(studentList);
		
		HashSet<Student> studentSet = new HashSet<Student>();
		Student[] students = {student1, student2, student3, student4, student5};
		studentSet.addAll(Arrays.asList(students));
		
		Iterator<Student> ir = studentSet.iterator();
		
		while(ir.hasNext()) {
			Student student = ir.next();
			if(ir.next().getName().equals("서재효")) {
				studentSet.remove(student);
				break;
			}
		}
		
		System.out.println(studentSet);
		

	}

}
