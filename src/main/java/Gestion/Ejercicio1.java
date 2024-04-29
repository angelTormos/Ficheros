package Gestion;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        int contador = 0;
        int opcion;
        Scanner scanner = new Scanner(System.in);
        File f = File.listRoots()[0];
        do {
        System.out.println("Lista de ficheros y directorios del directorio: ");
        System.out.println("---------------------------------------------------");
        System.out.println(contador + ".- " + "Directorio Padre");
        for (String e : f.list()) {
            contador ++;
                if (f.isFile()) {
                    System.out.println(contador + ".- " + e + " " + f.length() + " bytes");
                }
                if (f.isDirectory()) {
                    System.out.println(contador + ".- " + e + " <Directorio>");
                }
            }
            System.out.println("Introduce un número");
            opcion = scanner.nextInt();
            scanner.nextLine();
        }while (opcion != 1);
    }
}
