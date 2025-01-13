package Workshop8;

public class Student {
	private String name;
	private int age;
	private double average;
	
	public GradeCalculator grade;
	
	public Student(String name, int age, double a, double b, double c, double d) {
		grade=new GradeCalculator();
		this.name=name;
		this.age=age;
		this.average=grade.averageGrade(a, b, c, d);
	
	}
	
	public double getAverage() {
		return average;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}


