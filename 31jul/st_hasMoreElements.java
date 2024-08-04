import java.util.*;
public class st_hasMoreElements {
    public static void main(String[]args){
        /*driver code*/
        StringTokenizer st= new StringTokenizer("Demonstrating methods from string tokenizer class", " ");
        /*checks if the string has any more tokens*/
        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}
