class pen{
    String color;
    String type;
     public void write(){
        System.out.println("write something");//function under the class.it is called as methods.
     }
     public void printcolor(){
        System.out.println(this.color);
     }
     public void printtype(){
        System.out.println(this.type);//"this" is a keyword of java.this key word tells the function about the object which is trying to access the function. 
     }
}
public class OOPS{//public class
    public static void main(String args[])//function under object starts.its the main function
    {
        pen pen1=new pen();//type of object=name of the class.
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();//calling the function from class
        pen1.printcolor();
        pen1.printtype();
        pen pen2=new pen();
        pen2.color="green";
        pen2.type="ball point";
        pen2.write();//in java we call a fuction by giving a "." before it
        pen2.printcolor();
        pen2.printtype();
        return;

    }
}



    

