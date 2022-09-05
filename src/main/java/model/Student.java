package model;

public class Student {
    private String name;
    private int age;
    private int height;

    public Student (String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;

        System.out.println("My name is " + name + ", I am " + age +  " and my height is " + height);

    }

    public void setName(String myName) {
        this.name = myName;
    }
    public void setAge(int myAge) {
        this.age = myAge;
    }
    public void setHeight(int myHeight) {
        this.height = myHeight;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }

    public String studentToString () {
        return name + " is " + age + " years old and  " + height + " centimeters height ";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getAge() != student.getAge()) return false;
        if (getHeight() != student.getHeight()) return false;
        return getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + getHeight();
        return result;
    }
}