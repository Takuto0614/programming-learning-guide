class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("名前: " + name + ", 年齢: " + age);
    }
}

public class ConstructorSample {
    public static void main(String[] args) {
        Person person = new Person("Taro", 24);
        person.showInfo();
    }
}