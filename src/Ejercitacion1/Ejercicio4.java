package Ejercitacion1;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio4 {

    Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {
        //Enunciado -- Escribir  el código funcion para que devuelva el número maximo entre tres numeros

        //Comenzar a escribir código acá

/*
        System.out.println(Math.max(unNumeroA,unNumeroB,unNumeroC);
*/
        if((unNumeroA > unNumeroB) && (unNumeroA>unNumeroC)){System.out.println(unNumeroA);}
        if((unNumeroB>unNumeroA) && (unNumeroB>unNumeroC)){System.out.println(unNumeroB);}
        if((unNumeroC>unNumeroA) && (unNumeroC>unNumeroB)){System.out.println(unNumeroC);}
        if (unNumeroA==unNumeroB && unNumeroB==unNumeroC) {System.out.println(unNumeroA);}




return 0;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio4 ejercicio4 = new Ejercicio4();
        //Test 1
        System.out.println(ejercicio4.maximoEntreTresNumeros(102,45,30));
        //Test 2
        System.out.println(ejercicio4.maximoEntreTresNumeros(45,10,50));
        //Test 3
        System.out.println(ejercicio4.maximoEntreTresNumeros(11,11,11));
    }
}

