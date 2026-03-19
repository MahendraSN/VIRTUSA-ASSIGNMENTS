import java.util.HashMap;

class WordFrequency {

    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = sentence.split(" ");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        for (String word : map.keySet()) {
            System.out.println(word + " = " + map.get(word));
        }
    }
}
