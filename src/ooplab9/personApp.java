package ooplab9;

import jdk.nashorn.internal.scripts.JO;

public class personApp {

    public static void main(String[] args) {
        Person person = new Person("Sirada Kuncharin", 22,
                new Address("55/2", "Nakhornsithammarat",
                        "80110"),
                new Job("Student", 0));
        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(30000);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());








    }
}