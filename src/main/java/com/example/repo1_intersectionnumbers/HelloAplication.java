package com.example.repo1_intersectionnumbers;
import java.util.*;

public class HelloAplication {

        public static void main(String[] args) {
            Scanner container = new Scanner(System.in); //Variable initialization

            System.out.print("Enter the number of sets: ");
            int numSets = container.nextInt();     //Declare an integer variable and save my initialized
            container.nextLine(); //variable

            String[][] sets = new String[numSets][];//Initialize two arrays and assign my integer variable to one array
            int size = 0;//Initializing variable to zero


            for (int i = 0; i < numSets; i++) {
                System.out.print("Enter the number of elements in the set " + (i + 1) + ": ");
                int numElements = container.nextInt();//Declaring an integer variable and saving my initialized variable
                container.nextLine();//variable

                sets[i] = new String[numElements];//Initialize my new array inside the loop in "i" and assign my integer variable to array

                for (int j = 0; j < numElements; j++) {
                    System.out.print("Enter the element" + (j + 1) + " of the set " + (i + 1) + ": ");
                    sets[i][j] = container.nextLine();//Save my array "j" in my Variable
                }

                if (numElements > size) {  //Conditional
                    size = numElements;
                }
            }

            // Find the intersection
            String[] intersection = new String[size]; //Initialize my new array and Save my new String
            int intersectionSize = 0;//Initializing variable to zero


            // Check if the first set has all the elements that could be in the intersection

            for (String elem : sets[0]) {  //Loop through each element of the first set
                boolean aux = true;        //Determine if the current element is present in all sets.
                for (int i = 1; i < numSets; i++) {
                    boolean data = false;                        //Indicate if the current element is present in the current set
                    for (int j = 0; j < sets[i].length; j++) {   //Loop through each element of the current set
                        if (sets[i][j].equals(elem)) {           //Conditional
                            data = true;
                        }
                    }
                    if (!data) {
                        aux = false;                        //Identifies the elements in the current set to see if they are present or not.
                    }
                }
                if (aux) {
                    //Avoid duplicates at intersection
                    boolean temp = false;
                    for (int k = 0; k < intersectionSize; k++) {  // The current intersection
                        if (intersection[k].equals(elem)) {       //checks if elem is already present in the intersection array before adding it.
                            temp = true;
                        }
                    }
                    if (!temp) {                //Use after this loop to decide if to add elem to intersection
                        intersection[intersectionSize++] = elem;
                    }
                }
            }

            // Print the intersection
            System.out.println("The intersection is: ");
            for (int i = 0; i < intersectionSize; i++) {
                System.out.println(intersection[i]);
                if (i < intersectionSize - 1) {     //determine if to print a comma and a space after the current element of the intersection
                    System.out.println(", ");
                }
            }
        }
    }
