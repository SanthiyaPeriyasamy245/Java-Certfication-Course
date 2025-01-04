public class Student{
    int rollno;
    String name;
    int age;


    public Student()
    {
        this("unknown",21);
        //this() refers to the current constructor.
    }
    // constructor overloadig can be done
    public Student(int rollno,String name,int age)
    {
        this.age=age;
        this.rollno=rollno;
        this.name=name;
        // this refers to the current object
      
    }
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        Student Santhiya=new Student(20,"Santhiya",49);

        // new key word used to create an object
        // which allocates the memory space at heap for an object.
        //object memory allocation done at run time

        Student Deepika=new Student("Deepika",21);
        System.out.println(Santhiya.name + " "+ Deepika.name);

    }
    
}