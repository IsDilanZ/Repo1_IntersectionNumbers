package com.example.repo1_intersectionnumbers;
import java.util.*;

public class HelloAplication {
    public static void main(String[] args) {
        Scanner Intersection = new Scanner(System.in);

        System.out.print("Enter the number of sets: ");
        int numberOfSets = Intersection.nextInt();
        Intersection.nextLine(); 

        List<Set<Integer>> setList = new ArrayList<>();

        for (int i = 0; i < numberOfSets; i++) {
            System.out.println("Enter the elements of the set " + (i + 1) + "separated by space: ");
            String elements = Intersection.nextLine();
            Set<Integer> set = new HashSet<>();
            for (String elementss : elements.split(" ")) {
                set.add(Integer.parseInt(elementss));
            }
            setList.add(set);
        }

        // Finding the interpretation of the sets
        Set<Integer> intersection = findIntersection(setList);

        System.out.println("Intersection of sets: " + intersection);
    }

    public static Set<Integer> findIntersection(List<Set<Integer>> set) {
        if (set == null || set.isEmpty()) {
            return Collections.emptySet();
        }

        //Start with the first set
        Set<Integer> intersection = new HashSet<>(set.get(0));

        // Perform the intersection with the remaining sets
        for (int i = 1; i < set.size(); i++) {
            intersection.retainAll(set.get(i));
        }
        return intersection;
    }
}
