package university;

import student.school.School;

public class Student {

    private School school;

    public static void main(String[] args) {
        Student st = new Student();
        Student st1 = new Student();
        System.out.println(st.getName());
        System.out.println(st1.getAge());
    }

    private int age; // инициализируются значениями по умолчанию. числовые = 0
    private String name; // boolean = false; char = 0; все объекты = null

    static int counter;
    {
        age = 12; // вызывается каждый раз при создании объекта
        name = "name";
    }

    static {
        counter++; // вызывается один раз при создании программы
    }

    //    public university.Student() {}  ---- если не заданы другие конструктора, этот уже существует по умолчанию
    // но если созданы другие конструктора с параметрами, этого нет. но можно его создать вручную

    public Student (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void printClassName() {
        System.out.println("university.Student");

    }

    public Student (int age) {
        this(age, "constructor 1");
    }

    public Student () {
        this(20, "constructor 2");
        System.out.println("constructor  2 call");
        int a = 10;
    }

    public Student(String name) {
        this(20);
        this.name = name;
    }



}

