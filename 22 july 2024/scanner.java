import java.util.Scanner; //import Scanner to get inouts
public class scanner {
    public static void main(String[]args){
        Scanner myobj = new Scanner(System.in);
        String username;
        System.out.println("Enter the username"); //enter username and press enter
        username = myobj.nextLine(); //scans the entered username and stores in variable
        System.out.println("User name is: "+username);
    }
}
