package de.neuefische;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = List.of(5, 3, 4, 2, 9, 7, 8);

        //Filter the list for even numbers:

        List<Integer> evenNumbers = listOfNumbers.stream()
                .filter(numbers -> numbers % 2 ==0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);


        //Double each number in the list:

        List<Integer> doubleEachNumber = listOfNumbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println(doubleEachNumber);


    }
}