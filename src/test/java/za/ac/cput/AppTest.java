package za.ac.cput;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @author Emeka Thato Nwamadi - 219404070
     * 2021
     * This is a Java TDD project.
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testMyArray() {

        ArrayList<String> clothes = new ArrayList<>();
        clothes.add("Hat");
        clothes.add("Shirt");
        clothes.add("Pants");
        clothes.add("Shoes");

        System.out.println(clothes);

        clothes.add("Belt");
        clothes.remove(1);
        clothes.stream().findFirst();

        System.out.println(clothes);


        HashMap<String, String> cities = new HashMap<String, String>();
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
        s.add("Development");
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
