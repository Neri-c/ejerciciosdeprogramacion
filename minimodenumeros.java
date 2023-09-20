import java.util.Scanner;
public class minimodenumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c;
        System.out.println("ingresa tres numeros:");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        if (a != b && a != c && b != c){
            if (a < b){
                if (a < c){
             System.out.println( "El numero menor es:"+a);
                }
                else{
                    System.out.println("El numero menor es:"+c);
                }
            }
            else{
                if (b < c){
                    System.out.println("El numero menor es: "+b);
                }
                else{
                    System.out.println("El numero menor es: "+c);
                }
            }
        }
        else{
            System.out.println("Los numeros deben ser diferentes.");
        }
        leer.close();
    }
}
