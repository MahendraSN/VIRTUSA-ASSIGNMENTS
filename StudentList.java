import java.util.ArrayList;
import java.util.Collections;

class StudentList {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> students = new ArrayList<>();

        // Add student names
        students.add("Rahul");
        students.add("Ankit");
        students.add("Sneha");
        students.add("Priya");

        // Sort alphabetically
        Collections.sort(students);

        // Display sorted list
        System.out.println("Sorted Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
