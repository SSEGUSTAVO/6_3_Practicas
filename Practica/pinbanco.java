import java.util.Scanner;

public class pinbanco{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	int pin = 4862;
	System.out.print("Ingrese su pin: ");
	int val = input.nextInt();
	while(val != pin){
	    System.out.println("Validando...");
	    System.out.println("Error, ingrese su pin nuevamente: ");
	    val = input.nextInt();
	}
	System.out.println("Validando...");
	System.out.println("Correcto");
	System.out.println("¿Que operación desea realizar?");
    }
}