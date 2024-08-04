import java.util.Scanner;
public class largestofarray {
    public static void main(String[]args){
        Scanner ob = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in array");
        n=ob.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++){
            arr[i]=ob.nextInt();
        }

        int temp;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]<arr[j]){ //desc order
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.printf("Third largest number of array is: %d", arr[2]);
    }
}
