import java.util.Scanner;
//Eduardo Jose Larios Membreño
//Carnet:2024-1651U

public class array {
    public static void Valores(int arreglo[]) {
        //declaramos el scanner leer
        Scanner leer = new Scanner(System.in);
        for (int x = 0; x < arreglo.length; x++) {
            try {
                //pedimos valores para el arreglo y con un trycatch nos asegurampos de que los valores sean numeros enteros
                System.out.println("Ingrese los valores del arreglo : ");
                arreglo[x] = leer.nextInt();
            } catch (Exception e) {
                System.out.println("escribir un numero entero ");
                leer.next(); 
                x--; 
            }
        }
        leer.close();
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //definimos el arreglo
        try {
            int[] arreglo = TamañodelArreglo();
            Valores(arreglo);
            MostrarValores(arreglo);
            //arrayinverso            
            ValoresInvertidos(arreglo);
        } catch (Exception e) {
            System.out.println("El valor ingresado tiene que ser un numero entero ");
            main(args);
        }
        leer.close();
    }

    public static int[] TamañodelArreglo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valores a escribir: ");
        int ancho= leer.nextInt();
        if (ancho <= 0) {
            System.out.println("Los valores deben de ser mayores a cero ");
            return TamañodelArreglo();
        }
        int arreglo[] = new int[ancho];
        return arreglo;
    }

    public static void MostrarValores(int arreglo[]) {
        System.out.println("Los valores ingresados son: ");
        for (int x = 0; x < arreglo.length; x++) {
            System.out.println(arreglo[x] + ", ");
        }
    }

    public static void ValoresInvertidos(int arreglo[]) {
        System.out.println("Los valores de manera inversas son : ");
        for (int x = arreglo.length - 1; x >= 0; x--) {
            System.out.println(arreglo[x] + ", ");
        }
    }
}
