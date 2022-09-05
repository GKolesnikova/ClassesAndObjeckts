import model.Student;

public class Main {
    public static void main(String[] args) {

        Student person1 = new Student("Gugi", 16, 178);
        person1.studentToString ();
        /*person1.setName("Gugi");
        person1.setAge(16);
        person1.setHeight(178);*/

        System.out.println("My name is " + person1.getName());
        System.out.println("I am " + person1.getAge());
        System.out.println("My height is " + person1.getHeight());

    }


}
