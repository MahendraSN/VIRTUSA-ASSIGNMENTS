import java.util.HashSet;

class CommonElements {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);

        set2.add(20);
        set2.add(30);
        set2.add(40);

        // Find common elements
        set1.retainAll(set2);

        System.out.println("Common Elements: " + set1);
    }
}
