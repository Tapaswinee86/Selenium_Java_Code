package JavaEssentials;


// of integers,  puts some values in the array,
// and prints each value to standard output.
public class JavaEssentials {
    public void charArrayM1()
    {
        char[] charArray = new char[10];
        charArray = new char[] {'c','d','e','r'};
        System.out.println(charArray.length);
        for(int i=0;i<charArray.length;i++)
        {
            System.out.println(charArray[i]);
        }

    }
    // Java program to illustrate creating an array of integers
    public void intArrayM2()
    {
        int[] intArray = new int[]{20,30,22,34,56,79,87,67,90};
        for(int i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
    }
   // Arrays of Objects
    class Student
   {
       public int rollNo;
       public String name;
       Student(int rollNo,String name)
       {
           this.rollNo =rollNo;
           this.name = name;
       }
   }
    //Elements of the Array are objects of a class Student

    public void objArrayM3()
    {
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1,"Tapaswinee");
        arr[1] = new Student(2,"Sai");
        arr[2] = new Student(3,"Pihu");
        arr[3] = new Student(4,"Kirti");
        arr[4] = new Student(5,"Oom");
        for (int i=0 ; i< arr.length ;i++)
        {
            System.out.println(arr[i].rollNo + arr[i].name);
        }


    }
    public static void main(String[] args) {

        JavaEssentials obj1 = new JavaEssentials();
        obj1.charArrayM1();
        obj1.objArrayM3();



    }
}
