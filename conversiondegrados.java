import java.util.Scanner;
public class conversiondegrados {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double celsius,fahrenheit;
        System.out.println("Ingresa los grados celsius: ");
        celsius = input.nextDouble();
        fahrenheit = 1.8 * (celsius) + 32;
        System.out.println("la conversion a fahrenheit: "+fahrenheit+" °F");
        input.close();
    }
}
