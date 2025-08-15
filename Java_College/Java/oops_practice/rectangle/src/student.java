class student {
    // class properties
    public int roll;
    public String name ;
    public String course;
    public float marks1,marks2,marks3;
    //class methods
    public float total(){
        return marks1+marks2+marks3;
    }
    public double avg(){
        return  (marks1+marks2+marks3)/3;
    }
    public char grade(){
        if(avg() > 40)
            return 'P';
        else
            return 'X';
    }
}
class  studentTest{
    public static void main(String[] args) {
        student soumajit = new student();
        soumajit.roll = 115 ;
        soumajit.name = "Soumajit Majumder";
        soumajit.course = "BTech";
        soumajit.marks1 = 65;
        soumajit.marks2 = 45;
        soumajit.marks3 = 87;
        System.out.println("Name = "+soumajit.name);
        System.out.println("Roll = "+soumajit.roll);
        System.out.println("total = "+soumajit.total());
        System.out.println("avg = "+soumajit.avg());
        System.out.println("Grade = "+soumajit.grade());
    }
}
