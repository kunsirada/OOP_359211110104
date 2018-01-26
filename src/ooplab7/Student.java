package ooplab7;
//talking about student?
// 1.Student ID
// 2.Name
// 3.person ID
// 4.Address

public class Student {
    //properties of student class
    private String id;
    private String name;
    private String pid;
    private String address;
    //Constructor
    //default constructor
    public Student () {}
    //create by own//
    public Student (String id, String n,String pid, String a){
        //assing data to class properties// //
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.address = a;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //getter and setter methods
    public String getId () {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}