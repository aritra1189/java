
class student{
    String name;
    int age;


public void printinfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
student(student s2){//here we have copied the properties of s1 into s2
    this.name=s2.name;
    this.age=s2.age;
}
student()
{

}

}
public class copyobject {
    public static void main(String args[])
    {
    student s1=new student();
    s1.name="aritra";
    s1.age=21;
    student s2= new student(s1);//passing the object properties of s1 through s2.assigning the values of s1 to s2.
    s2.printinfo();
    return;
    }
    
}

