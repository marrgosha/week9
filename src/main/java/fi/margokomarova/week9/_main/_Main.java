package fi.margokomarova.week9._main;

import fi.margokomarova.week9.entity.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class _Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cat", 2));
        animals.add(new Animal("dog", 3));
        animals.add(new Animal("chicken", 1));
        animals.add(new Animal("crocodile", 5));
        animals.add(new Animal("fox", 4));
        animals.add(new Animal("elephant", 6));
        animals.add(new Animal("hare", 4));
        animals.add(new Animal("lion", 7));
        animals.add(new Animal("bird", 2));
        animals.add(new Animal("mouse", 1));

        Stream<Animal> animalStream = animals.stream();
        //task3
        //long count=animalStream.filter(animal -> animal.getAge()>4)
        //     .count();
        //System.out.println(count);

        //task5
        //String names=animalStream.map(animal -> animal.getName().toString());


        // Optional<String> names=animalStream.reduce((animal, animal2) -> animal.getName()+animal2.getName());
        //System.out.println(names);

        //task4
        //Map<String,Animal>map=animalStream.collect(Collectors.toMap(animal -> animal.getName(),animal -> animal));
        // System.out.println(map.toString());

        //task2
        //animalStream.sorted((animal1, animal2)->animal1.getAge()-animal2.getAge())
        // .forEach(animal -> System.out.println(animal.getName()+","+
        //        animal.getAge()));

        //task1
        Optional<Animal> anyLion = animalStream.filter(animal -> animal.getName().equals("lion"))
                .findAny();
        try {
            if (anyLion.isEmpty()) {
                System.out.println("IllegalArgumentException");
                throw new Exception();
            }
            Animal lion = anyLion.get();
            System.out.println("Age of lion=" + lion.getAge());
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }


}
