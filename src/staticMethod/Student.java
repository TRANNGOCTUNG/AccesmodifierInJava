package staticMethod;

public class Student {
    private int rollno;
    public String name;
     static String college = "CodeGym";

    public Student() {
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }



    public int getRollno() {
        return rollno;
    }

    public void setRollno(int newRollno) {
        rollno = newRollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String newCollege) {
        college = newCollege;
    }
    public void display(){
        System.out.printf("%6s %10s %14s \n",rollno,name,college);
    }


}
