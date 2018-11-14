package student;

import student.school.School;

public class Student {

    public static void main(String[] args) {

        School school = new School(200, "Kozlova 5");
        System.out.println(school.number);
        System.out.println(school.address);
        System.out.println(school.getNumber());
        System.out.println(school.getAddres());
        school.number = 112;
        school.address = "asdasd 4";
        school.setAddress("Lenina 5");
        school.setNumber(23);

    }

}
