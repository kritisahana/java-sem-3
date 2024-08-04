
public class creating_intArray {
    public static void main(String[]args){
        //declaring an array of integers
        int[]arr = new int[5];
        //initialize the first elements of array
        arr[0]=10;
        //initialize second elements of array and so on...
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        //accessing the elements of the array using for loop
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at index "+i+": "+arr[i]);
        }
    }
}
