import java.util.Scanner;

public class Dowhile {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int number=0;
    do{
        System.out.println("Enter the number:");
     number=sc.nextInt();
    System.out.print("YOUR number is here:");
    System.out.println(number);
}
while(number>=0);
System.out.println("THE END");



    }
    
}
