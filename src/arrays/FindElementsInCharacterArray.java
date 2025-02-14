package arrays;

import java.util.Arrays;

public class FindElementsInCharacterArray {
    final static int MAXCHAR = 10;
    public static void main(String [] args){

        char[] charArray = {'X', '7', '@', 'G', '!', '@', '#', '3', 'Y', '?'};
        char element = '@';
        System.out.println("charArray: " + Arrays.toString(charArray));
        returnPositionOfElement(charArray, element);

    }

    public static void returnPositionOfElement(char[] arr, char element){
        //declaro boolean
        boolean found = false;
        //recorro el array
        for(int i = 0; i < MAXCHAR; i++){
            //verifico que el valor actual sea igual al char que me pasan
            if(arr[i] == element){
                //si es asi, por cada posicion que voy recorriendo e imprimo -> (i, element)
                System.out.println("Posiciones encontradas: " + i + " del elemento: " + element);
                //si encontre paso a true;
                found = true;
            }
        }
        //si no encontre elemento imprimo
        if(!found){
            System.out.println("No hay elementos con: " + element);

        }
    }
}
