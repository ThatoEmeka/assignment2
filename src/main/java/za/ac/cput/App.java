package za.ac.cput;

import java.util.*;

/**
 * @author Emeka Thato Nwamadi - 219404070
 * 2021
 *This is a Java TDD project.
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> clothes = new ArrayList<String>();
        clothes.add("Hat");
        clothes.add("Shirt");
        clothes.add("Pants");
        clothes.add("Shoes");
        System.out.println(clothes);

        clothes.remove(2);

        clothes.stream().findFirst();

        // Create a HashMap object called capitalCities
        HashMap<String, String> cities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        cities.put("South Africa", "Cape Town");
        cities.put("United States", "Ohio");
        cities.put("Nigeria", "Lagos");
        System.out.println(cities);

        cities.remove(2);



        // Creating an empty Set
        Set<String> s = new HashSet<String>();

        // Set
        s.add("Hello");
        s.add("I");
        s.add("Do");
        s.add("Application");
        s.add("Developemnt");
        s.add(".");

        // typing the Set
        System.out.println("Set: " + s);

        s.remove(".");

        s.stream().findFirst();

        // list
        List<Integer> l = new ArrayList<>();
        l.add(06);
        l.add(12);
        l.add(99);

        // printing intergers
        System.out.println(l);

        l.remove(1);

        l.stream().findAny();

    }
}

