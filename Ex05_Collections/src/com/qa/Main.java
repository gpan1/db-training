package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(c);
        catList.add(c2);
        for(int x = 0; x < animalList.size(); x++){
            System.out.println(animalList.get(x));
        }
        System.out.println("------------------------------------");
        for(Animal animal : animalList){
            System.out.println(animal);
        }
        System.out.println("------------------------------------");
        Iterator<Cat> catIterator = catList.iterator();
        while(catIterator.hasNext())
        {
            System.out.println(catIterator.next());
        }
        System.out.println("------------------------------------");
        HashMap<String, Animal> animalMap = new HashMap<String, Animal>();
        animalMap.put(c.getName(), c);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);
        animalMap.put(r2.getName(), r2);
        HashMap<Animal, String> animalMap2 = new HashMap<Animal, String>();
        animalMap2.put(c, "Fluffy");
        animalMap2.put(c2, "Doesn't like being picked up");
        animalMap2.put(d, "Overly excited about running");
        animalMap2.put(r, "Snuffles a lot, may have a cold");
        animalMap2.put(r2, "May actually be evil. Unsure.");

        for (String key : animalMap.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    animalMap.get(key));
        }
        System.out.println("------------------------------------");
        for (Animal key : animalMap2.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    animalMap2.get(key));
        }
        System.out.println("------------------------------------");

        HashSet<Animal> set = new HashSet<>();
        set.addAll(animalList);
        set.add(c);
        set.add(c2);
        Iterator<Animal> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("------------------------------------");
        System.out.println("\nFinding Spot.");
        for (Animal a : animalList){
            if (a.getName().equals("Spot")){
                System.out.println(
                        "Found Spot in the ArrayList: " + a);
            }
        }
        System.out.println("Found Spot in the HashMap: " + animalMap.get("Spot"));
        System.out.println("------------------------------------");
        Collections.sort(animalList);
        System.out.println("Sorted animal list");
        for (int x = 0; x < animalList.size(); x ++){
            System.out.println(animalList.get(x));
        }
        System.out.println("------------------------------------");
        TreeMap<String, Animal> tree = new TreeMap<>();
        tree.putAll(animalMap);

        System.out.println("TreeMap");
        for (String key : tree.keySet()) {
            System.out.println("Key: " + key + " Value: " +
                    tree.get(key));
        }
    }

}
