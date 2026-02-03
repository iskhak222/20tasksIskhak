import java.util.*;

public class tasks {
    public static void main(String[] args) {


        // 11. find common elements
        ArrayList<String> countries1 = new ArrayList<>(Arrays.asList("france", "germany", "italy"));
        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList("italy", "spain", "france"));

        ArrayList<String> commonCountries = new ArrayList<>();

        for (String c : countries1) {
            if (countries2.contains(c)) {
                commonCountries.add(c);
            }
        }

        System.out.println("11. common countries: " + commonCountries);




        // 12. remove even-length strings
        ArrayList<String> names = new ArrayList<>(Arrays.asList("alex", "john", "anna", "mike"));

        names.removeIf(n -> n.length() % 2 == 0);
        System.out.println("12. names with odd length: " + names);



        // 13. find smallest element
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("hello", "sky", "beautiful day"));

        String shortest = songs.getFirst();
        for (String s : songs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }

        System.out.println("13. shortest song: " + shortest);




        // 14. replace all vowels
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));

        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).replaceAll("[aeiouAEIOU]", "*"));
        }

        System.out.println("14. words without vowels: " + words);




        // 15. partition arraylist
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6
        ));

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }

        System.out.println("15. even numbers: " + even);
        System.out.println("15. odd numbers: " + odd);




        // 16. rotate elements
        ArrayList<String> days = new ArrayList<>(Arrays.asList("mon", "tue", "wed", "thu", "fri", "sat", "sun"));

        Collections.rotate(days, 2);
        System.out.println("16. rotated days: " + days);




        // 17. remove null values
        ArrayList<String> students = new ArrayList<>(Arrays.asList("alice", null, "bob", null, "claire"));

        students.removeIf(s -> s == null);
        System.out.println("17. students without null: " + students);




        // 18. find second largest element
        ArrayList<String> movieTitles = new ArrayList<>(Arrays.asList("avatar", "up", "the lord of the rings"));

        movieTitles.sort((a, b) -> b.length() - a.length());
        System.out.println("18. second longest title: " + movieTitles.get(1));




        // 19. replace elements with lengths
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi"));

        ArrayList<Integer> fruitLengths = new ArrayList<>();

        for (String f : fruits) {
            fruitLengths.add(f.length());
        }

        System.out.println("19. fruit lengths: " + fruitLengths);




        // 20. create nested arraylist
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>(Arrays.asList("alex", "john"));
        ArrayList<String> hr = new ArrayList<>(Arrays.asList("anna", "maria"));

        departments.add(it);
        departments.add(hr);

        System.out.println("20. departments:");
        for (ArrayList<String> dep : departments) {
            System.out.println(dep);
        }
    }
}
