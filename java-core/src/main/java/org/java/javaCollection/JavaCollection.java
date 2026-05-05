package org.java.javaCollection;

import java.util.*;

public class JavaCollection {

    public static void main(String[] args) {

        // ArrayList Ordered, Allows Duplicate, Maintains insert order
        System.out.println("------ ArrayList Allows Duplicate, Maintains insert order ------");
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("kumar", 25, "Dev"),
                new Person("arun", 30, "QA"),
                new Person("sneha", 28, "HR"),
                new Person("rrrr", 28, "HR")

        ));

        list.add(3, new Person("kumar", 25, "Dev"));
        list.remove(3);
        System.out.println("index 2 object: " + list.get(2));
        System.out.println("Size of list: " + list.size());
        for (Person person : list) {
            System.out.println(person);
        }
        list.removeFirst();
        // ArrayList Stores elements in container, has additonal method
        LinkedList<Person> linkedList = new LinkedList<>(list);
        linkedList.remove(1);
        linkedList.addFirst(new Person("praveen", 25, "Dev"));
        System.out.println("Linked List" + linkedList);

        LinkedList<Integer> myNumbers = new LinkedList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.addFirst(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }

        // ArrayList Unique elements,
        System.out.println("// ArrayList Stores elements in container, has additonal method");
        Set<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        cars.remove("Ford");
        System.out.println("Set: " + cars);

        Set<String> carsTree = new TreeSet<>();
        carsTree.add("Volvo");
        carsTree.add("BMW");
        carsTree.add("Ford");
        carsTree.add("BMW");  // Duplicate
        carsTree.add("Mazda");
        carsTree.remove("Mazda");
        System.out.println("Tree Set: " + carsTree);

        // HashMap - Keys value pair, no duplicate
        Map<String, Integer> map = new HashMap<>();
        map.put("Volvo", 33);
        map.put("BMW", 15);
        System.out.println("Map: " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Osdfdsdfsslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        TreeMap<String, String> capitalCitiesMap = new TreeMap<>();
        capitalCitiesMap.put("England", "London");
        capitalCitiesMap.put("India", "New Dehli");
        capitalCitiesMap.put("Austria", "Wien");
        capitalCitiesMap.put("Norway", "Oslo");
        capitalCitiesMap.put("Norway", "Oslo"); // Duplicate
        capitalCitiesMap.put("USA", "Washington DC");

        System.out.println(capitalCitiesMap);

    }
}
