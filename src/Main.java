import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listanm = metodoDimensiones();
        validarDimensiones(listanm);
    }
    public static ArrayList<Integer> metodoDimensiones() {
        ArrayList<Integer> listanm = new ArrayList<Integer>();
        Scanner dimensiones = new Scanner(System.in);
        System.out.println("creara una matriz de nxm");
        System.out.println("seleccione la dimension de n (filas): ");
        int n = dimensiones.nextInt();
        System.out.println("seleccione la dimension de m (columnas): ");
        int m = dimensiones.nextInt();
        listanm.add(n);
        listanm.add(m);
        return listanm;

    }
    public static void validarDimensiones(ArrayList<Integer> listanm){
        int filas = listanm.get(0);
        int columnas = listanm.get(1);
        if (filas>0 && columnas>0){
            System.out.println("se validan las dimensiones");
        }
        else{
            System.out.println("no se validan las dimensiones");
        }


    }
}

