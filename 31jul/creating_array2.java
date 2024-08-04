class Student {
    public int roll_num;
        public String name;
        Student(int roll_num, String name){
            this.roll_num=roll_num;
            this.name=name;
        }

}
class creating_array2{
    public static void main(String[]args){
        //declare an array of integers
        Student[]arr;
        //allocating memory for 5 objects of the type Student
        arr = new Student[5];
        //initialize the first elements of the array
        arr[0]= new Student(1,"Aman");
        arr[1]= new Student(2,"Vaibhav");
        arr[2]= new Student(3,"Shikar");
        arr[3]= new Student(4,"Darmesh");
        arr[4]= new Student(5,"Mohit");
        //accessing the elements of array
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at "+i+": "+arr[i].roll_num+" "+arr[i].name);
        }
    }
}
