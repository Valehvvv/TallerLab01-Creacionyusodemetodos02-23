import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        metodoDimensiones();
        validarDimensiones()

    }
    public static int[] metodoDimensiones() {
        Scanner dimensiones = new Scanner(System.in);
        System.out.println("creara una matriz de nxm");
        System.out.println("seleccione la dimension de n (filas): ");
        int n = dimensiones.nextInt();
        System.out.println("seleccione la dimension de m (columnas): ");
        int m = dimensiones.nextInt();
        return new int[]{n, m};
    }
    public static int[] validarDimensiones(int[n,m]){
        if (filas>0 && columnas>0){
            System.out.println("se validan las dimensiones");
        }
        else{
            System.out.println("no se validan las dimensiones");
        }


    }
    }

