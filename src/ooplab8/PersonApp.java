package ooplab8;

public class PersonApp {
    public static void main(String[] args) {

        //create object as student
        Student student = new Student("111111111111",
                "Sirada","10 M.2 Thungsong",
                "Female","STD0002",
                "Information System");

        System.out.println(student.toString());
        student.setName("Sirada");
        System.out.println(student.getName());
        System.out.println(student.toString());






    }//main
}//class