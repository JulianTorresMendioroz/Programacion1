package arrays;

/*
Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.
*/

public class Average {
    final static int MAXVECTOR = 10;
    public static void main(String [] args){

        int [] vector = {5,3,6,7,2,4,9,7,5,3};
        int prom = sumAverage(vector);
        System.out.println(prom);
    }

    public static int sumAverage(int [] arr){
        //declaro sum en 0
        int sum = 0;
        //recorro desde 0 < 10, por cada iteracion:
        for(int i = 0; i < MAXVECTOR; i++){
            //guardo el valor de suma y sumo lo que tengo + arr[i]
            sum = sum + arr[i];
        }
        //retorno la suma
        return sum / MAXVECTOR;
    }
}
