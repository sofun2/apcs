import java.util.*;

public class Tester {
    public static void main(String [] args) {
        Person a = new Person(1970, "Alice");
        System.out.println(a.toString());
        Student b = new Student(1980, "Bob", "Biology");
        System.out.println(b.toString());
        Instructor e = new Instructor(1990, "Eve", 300000);
        System.out.println(e.toString());
    }
}
