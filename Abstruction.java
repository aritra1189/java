abstract class shape{
   abstract void color();
    
}
class triangle extends shape{
    public void color(){
        System.out.println("colour is red");
    }

}
class circle extends shape{
    public void color(){
        System.out.println("color is blue");
    }

}

public class Abstruction {
    public static void main(String args[])
    {
    triangle t1=new triangle();
    t1.color();
    //shape s1=new shape();//as shape is abstracted it cant be instantiated
    //shape.color();//it is error as shape is abstracted so it cant be accessed
   
    return;
    }
    
}