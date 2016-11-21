
public class Student {
	
	public String name;
	private int id;
	private int age;
	private double gpa;
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}

    public String getIdKey(){
    	
    	return String.valueOf(id);
    }

	public void setId(int id) {
		this.id = id;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

    public String toString(){
    	//return "[String,name=" + name + "]";
    	return name;
    }

	public Student(String name, int id, int age, double gpa) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.gpa=gpa;

	}

}
