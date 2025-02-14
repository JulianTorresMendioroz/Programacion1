package arrays;

/*
Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado.
*/

import java.sql.SQLOutput;

public class ElementsGreaterThanAverage {
    final static int MAXVECTOR = 10;
    public static void main(String [] args){

        int [] vector = {5,3,6,7,2,4,9,7,5,3};
        int average = sumAverage(vector);
        System.out.println("Average: " + average);
        int elementsInArrayGreaterThanAverage = elementsInArrayGreaterThanAverage(vector, average);
        System.out.println("Elementos mayores al promedio encontrados: " + elementsInArrayGreaterThanAverage);
    }

    public static int sumAverage(int [] arr){
        int sum = 0;
        for(int i = 0; i < MAXVECTOR; i++){
            sum+=arr[i];
        }
        return sum / MAXVECTOR;
    }

    public static int elementsInArrayGreaterThanAverage(int [] arr, int average){
        //declaro valor encontrado en 0
        int findValue = 0;
        //recorro el array
        for(int i = 0; i < MAXVECTOR; i++){
            //verifico si mi valor actual es mayor al promedio
            if(arr[i] > average){
                //si se cumple, sumo +1
                findValue++;
            }
        }

        //retorno los valores encontrados
        return findValue;

    }

    }
