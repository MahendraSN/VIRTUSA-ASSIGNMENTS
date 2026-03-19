import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Display method
    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

class StudentSort {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Rahul", 85));
        list.add(new Student(2, "Ankit", 75));
        list.add(new Student(3, "Sneha", 90));

        // Sort by marks
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.marks - s2.marks;
            }
        });

        System.out.println("Sorted by Marks:");
        for (Student s : list) {
            s.display();
        }

        // Sort by name
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("\nSorted by Name:");
        for (Student s : list) {
            s.display();
        }
    }
}
