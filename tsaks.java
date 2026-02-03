import java.util.*;

public class tsaks {
    public static void main(String[] args) {
        // 1. merge unique elements

        ArrayList<String> books1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        ArrayList<String> books2 = new ArrayList<>(Arrays.asList("Python", "C#", "Java"));

        HashSet<String> mergedBooks = new HashSet<>();
        mergedBooks.addAll(books1);
        mergedBooks.addAll(books2);

        System.out.println("1. Merged unique books: " + mergedBooks);


        // 2. find maximum element

        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "Titanic", "Avatar", "The Lord of the Rings"
        ));

        String longest = movies.getFirst();
        for (String m : movies) {
            if (m.length() > longest.length()) {
                longest = m;
            }
        }
        System.out.println("2. Longest movie title: " + longest);




        // 3. count occurrences

        ArrayList<String> foods = new ArrayList<>(Arrays.asList(
                "Pizza", "Burger", "Pizza", "Pasta", "Pizza"
        ));

        int count = 0;
        for (String f : foods) {
            if (f.equals("Pizza")) {
                count++;
            }
        }
        System.out.println("3. Pizza count: " + count);




        // 4. remove all matching elements

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Orange", "Banana"
        ));

        fruits.removeIf(f -> f.equals("Banana"));
        System.out.println("4. Fruits without Banana: " + fruits);




        // 5. replace all elements
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
                "Red", "Green", "Blue"
        ));

        Collections.fill(colors, "Black");
        System.out.println("5. Colors replaced: " + colors);




        // 6. check sublist presence

        ArrayList<String> sports = new ArrayList<>(Arrays.asList(
                "Football", "Basketball", "Tennis", "Hockey"
        ));
        ArrayList<String> checkSports = new ArrayList<>(Arrays.asList(
                "Football", "Tennis"
        ));

        boolean containsAll = sports.containsAll(checkSports);
        System.out.println("6. Contains sublist: " + containsAll);




        // 7. find first and last index

        ArrayList<String> flowers = new ArrayList<>(Arrays.asList(
                "Rose", "Tulip", "Rose", "Lily"
        ));

        System.out.println("7. First index of Rose: " + flowers.indexOf("Rose"));
        System.out.println("7. Last index of Rose: " + flowers.lastIndexOf("Rose"));




        // 8. remove duplicates

        ArrayList<String> animals = new ArrayList<>(Arrays.asList(
                "Cat", "Dog", "Cat", "Horse"
        ));

        ArrayList<String> uniqueAnimals = new ArrayList<>(new HashSet<>(animals));
        System.out.println("8. Animals without duplicates: " + uniqueAnimals);




        // 9. convert arrayList to array

        ArrayList<String> cities = new ArrayList<>(Arrays.asList(
                "London", "Paris", "Rome"
        ));

        String[] cityArray = cities.toArray(new String[0]);
        System.out.println("9. Cities array: " + Arrays.toString(cityArray));



        // 10. convert array to arrayList

        Integer[] numbersArray = {1, 2, 3, 4};

        ArrayList<Integer> numbersList =
                new ArrayList<>(Arrays.asList(numbersArray));

        System.out.println("10. Numbers ArrayList: " + numbersList);
    }
}
