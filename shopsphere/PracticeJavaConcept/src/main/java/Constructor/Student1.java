package Constructor;

public class Student1 {

    String studentName;
    int roll;

    Student1(String n,int r)
    {
        studentName=n;
        roll=r;
    }

    public void display()
    {
        System.out.println("SN="+studentName+"\n"+"roll="+roll);
    }

    public static void main(String[] args) {
        Student1 s1=new Student1("MAHTAB",22);
        s1.display();
        Student1 s2=new Student1("SHAIZA",23);
        s2.display();

    }
}
