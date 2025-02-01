
class Address{
    private int doorno;
    private String street;
    private String district;
    private int pincode;
    public Address(int doorno,String street,String district,int pincode)
    {
        this.doorno=doorno;
        this.street=street;
        this.district=district;
        this.pincode=pincode;
    }
    public void setaddress(int doorno,String street,String district,int pincode)
    {
         this.doorno=doorno;
        this.street=street;
        this.district=district;
        this.pincode=pincode;
    }
    
    public String toString()
    {
        return String.format("doorno:%d\nstreet:%s\ndistrict:%s\npincode:%d\n",doorno,street,district,pincode);
    }
}


class Student{
    String name;
    int rollno;
    Address address;
    public Student(String name,int rollno,Address address)
    {
        this.name=name;
        this.rollno=rollno;
        this.address=address;
    }
}

public class ObjectComposition{
    public static void main(String[]args)
    {
        Address address=new Address(11,"sdffd","dsffg",234567);
        Student s1=new Student("abc",35,address);
        System.out.println(s1.address);
        s1.address.setaddress(12,"sdds","sfd",233455);
          System.out.println(s1.address);
        
        
    }
}