import java.util.Scanner;
public class suma {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println( "ingresa 2 numeros");
        a = input.nextInt();
        b = input.nextInt();
        c = a + b;
        System.out.println("La suma de los dos numeros es: "+c);
    input.close();
    }
}