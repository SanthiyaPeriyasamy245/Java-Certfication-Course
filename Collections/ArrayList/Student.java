package javapracitce;


public class Student implements Comparable<Student>{
	int rollno;
	public Student(int n)
	{
		this.rollno=n;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.rollno, o.rollno);
	}
	@Override
	public String toString()
	{
		return this.rollno+" ";
	}
	
}
