class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("名前: " + name + ", 年齢: " + age);
    }
}

public class ClassSample {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Hanako";
        student.age = 20;
        student.introduce();
    }
}