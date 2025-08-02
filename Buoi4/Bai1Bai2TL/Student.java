package Bai1Bai2TL;
public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { //set: sua
        this.name = name;
    }

    public int getAge() {   //get: lay
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
