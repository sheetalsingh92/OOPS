import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {
	
	ArrayList studentList = new ArrayList();
	HashMap <String, Student> studentMap= new HashMap<String, Student>();
	
	public StudentTest(){
		System.out.println("StudentTest constructor called");
		
	}
	
	public void run(){
		System.out.println("StudentTest run() called");
		
		Student s0= new Student("Mark", 1000123,30,3.9);
		Student s1= new Student("M", 10007563,32,3.6);
		Student s2= new Student("Mars", 1000123,33,3.3);
		
		studentList.add(s0);
		//studentList.add(Mars);
		studentList.add(s1);
		studentList.add(s2);
		
		System.out.println("Student:" + studentList.get(0));
		System.out.println("Student:" + studentList.get(1));
		System.out.println("Student:" + studentList.get(2));
		
		Student myStudent = (Student) studentList.get(2);
		System.out.println("myStudent:" + myStudent);
		
		displayStudents();
		
		studentMap.put(s0.getIdKey(), s0);
		studentMap.put(s1.getIdKey(), s1);
		studentMap.put(s2.getIdKey(), s2);
		
		//System.out.println("Hashmap output");
		System.out.println("Student:"+ studentMap.get("1000123"));
		
		Student missing = studentMap.get("9999");
		if(missing !=null)
		System.out.println("Student:" +missing.getName());
	}
	
	public void displayStudents(){
           for ( Object studentobj : studentList){			
			Student st = (Student) studentobj;
			System.out.println("Student: " + st);
		}
	}
	
	public static void main(String[] args){
		StudentTest stTest = new StudentTest();
		stTest.run();
	}
}
