import java.util.*;
public class st_nextElement {
    public static void main(String[]args){
        /*driver code*/
        StringTokenizer st= new StringTokenizer("Hello everyone have a nice day", " ");
        /*checks if the string has any more tokens*/
        while(st.hasMoreTokens()){
            /*Prints the elements of the string*/
            System.out.println(st.nextElement());
        }
    }
}
