public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Raghavi", 19, "Java");
        s1.display();
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {   
        this.name = name;             
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}
