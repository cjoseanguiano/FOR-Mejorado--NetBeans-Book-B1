/*
Uso de la instruccion for mejorada para sumar el total de enteror en un arreglo
 */
package pruebaformejorado;

/**
 *
 * @author carlosjoseanguiano
 */
public class PruebaFORMejorado {

    public static void main(String[] args) {
        int arreglo[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //int[] arreglos = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int total = 0;

        for (int numero : arreglo) {
            total += numero;
        }
        System.out.printf("Total de elementos dentro del arreglo %d\n", total);
    }

}
