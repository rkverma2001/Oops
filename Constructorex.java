public class Constructorex {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ritesh";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        for (int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        Sys
    }
}
