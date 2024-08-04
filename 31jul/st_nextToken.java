import java.util.*;
public class st_nextToken {
    public static void main(String[]args){
        StringTokenizer st= new StringTokenizer("my,name,is,khan");
        //printing next StringToken
        System.out.println("next token is: "+st.nextToken(","));
        
    }
}
