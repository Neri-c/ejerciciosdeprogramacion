import java.util.Scanner;

public class ejercicio6 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingresa un numero");
        int a = leer.nextInt();

        if(a < 0){
            System.out.println("El numero es negativo");
        }
        else if( a > 0 ){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es cero");
        }
        leer.close();
    }
}
