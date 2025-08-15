class Student{
   String name;
   int roll;
   int marks;
}
public class array_object {
    public static void main(String[] args) {
        // creating the objects s1,s2,s3
        Student s1 = new Student();
        s1.name = "Rishav";
        s1.roll = 12;
        s1.marks = 87;
        Student s2 = new Student();
        s2.name = "Kailash";
        s2.roll = 06;
        s2.marks = 93;
        Student s3 = new Student();
        s3.name = "Kartikeya";
        s3.roll = 01;
        s3.marks = 100;

        System.out.println("**Array object**");
        // we have to manually create array of object
        // create array named s of Student type
        //  int arr[] = new int[4];
        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        for(int i = 0;i<s.length;i++){
            System.out.println(s[i].name + " : "+ s[i].marks);
        }
        System.out.println("**Enhanced for Loop**");
        for(Student stud : s){
            System.out.println(stud.name +" : "+stud.marks);
        }

    }
}
