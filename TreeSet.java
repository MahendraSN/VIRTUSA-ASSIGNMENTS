import java.util.TreeSet;

class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(60);
        set.add(30);
        set.add(80);
        set.add(40);

        // Remove elements greater than 50
        set.removeIf(num -> num > 50);

        System.out.println("Updated Set: " + set);
    }
}
