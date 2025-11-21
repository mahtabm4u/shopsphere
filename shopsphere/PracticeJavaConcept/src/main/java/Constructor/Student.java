package Constructor;
//Without Constructor
public class Student

{
    String studentName;
    int age;

    public void display()
    {
        System.out.println("STUDENT NAME="+studentName+"\n"+"STUDENT AGE="+age);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.studentName="MAhtab";
        s1.age=25;
        s1.display();

        Student s2=new Student();
        s2.studentName="SHAIZA";
        s2.age=23;
        s2.display();

    }


}
