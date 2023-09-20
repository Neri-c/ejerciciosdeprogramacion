import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingresa un numero:");
        n = leer.nextInt();
        if (n % 2 == 0){
            System.out.println( "El numero es par");
        }
        else{
            System.out.println( "El numero es inpar");
        }
        leer.close();
    }
} 