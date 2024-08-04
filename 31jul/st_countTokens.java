import java.util.*;
public class st_countTokens {
    public static void main(String[]args){
        /*driver code*/
        StringTokenizer st= new StringTokenizer("Hello everyone have a nice day", " ");
        /*checks if the string has any more tokens*/
        /*Prints the elements of the string*/
        System.out.println("Total number of tokens:"+st.countTokens());
    }
}
