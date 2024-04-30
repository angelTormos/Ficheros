package Gestion;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        int contador = 0;
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        File f = File.listRoots()[0];
        do {
        System.out.println("Lista de ficheros y directorios del directorio: " + f);
        System.out.println("---------------------------------------------------");
        System.out.println(contador + ".- " + "Directorio Padre");
        for (File e : f.listFiles()) {
            contador ++;
                if (e.isFile()) {
                    System.out.println(contador + ".- " + e.getName() + " " + f.length() + " bytes");
                }
                if (e.isDirectory()) {
                    System.out.println(contador + ".- " + e.getName() + " <Directorio>");
                }
            }
            System.out.println("Introduce un número");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 0){
                f = f.getParentFile();
                contador = 0;
            }else if (opcion != -1){
                contador = 0;
                if (opcion >= 0 && opcion <= f.listFiles().length){
                    if (f.listFiles()[opcion - 1].isDirectory() && f.listFiles()[opcion - 1].canRead()){
                        f = f.listFiles()[opcion - 1];
                    } else if (f.listFiles()[opcion - 1].isFile()) {
                        System.out.println("Esto es un archivo");
                    }
                }
            }
        }while (opcion != -1);
    }
}