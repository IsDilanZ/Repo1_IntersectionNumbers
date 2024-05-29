package com.example.repo1_intersectionnumbers;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }

    public class example {

        public static int busqueda(int[] A, int dato) {
            int i, pos = -1;
            for (i = 0; i < A.length; i++) {
                if (dato == A[i]) {
                    pos = i;

                    break;
                }
            }
            return pos;
        }

        public static int[] Union(int []A, int[]B){
            int [] union = new int[A.length + B.length];
            int i,index;
            for(i=0; i<A.length;i++){
                union[i] = A[i];
            }
            index = A.length;

            for(i=0; i<B.length;i++){
                if(busqueda(A,B[i])==-1){
                    union[index]=B[i];
                    index++;
                }
            }
            return union;
        }


        /*public static int[] Interseccion(int[] A, int[] B) {
            int tam;
            if (A.length < B.length) {
                tam = A.length;

            } else {
                tam = B.length;
            }


            int[] inter = new int[tam];
            int i,index = 0;

            for (i = 0; i < A.length; i++) {
                if (busqueda(B, A[i]) != -1) {
                    inter[index] = A[i];
                    index++;
                }
            }
            return inter;
        }
*/
        public static void main(String[] args) {
            //Scanner number = new Scanner(System.in);
            int[] A = {1, 2, 3};
            int[] B = {4, 5, 6};
            int[] u = Union(A,B);
            //int[] n = Interseccion(A,B);
           // System.out.println(Arrays.toString(n));
            System.out.println(Arrays.toString(u));
        }
    }
}