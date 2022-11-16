class accounts{
    public String name;
    protected String email;
    private String password;
    //getter
    public String getpassword(){
        return this.password;
    }
    //setter
    public void setpassword(String pass){
        this.password=pass;
    }
}
public class Accessmodifiers {
    public static void main(String args[]){
        accounts account1=new accounts();
        account1.name="aritra";
        account1.email="aritra@gmail.com";
       // account1.password="abcd";//password cant be accessed here as it is private
        account1.setpassword("abcd");//setting new password
        System.out.println(account1.getpassword());//to get the new password

    }

}
