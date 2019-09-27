import java.util.Scanner;

public class multiplos{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	System.out.print("Ingrese un número entero positivo para calcular sus multiplos: ");
	int num = input.nextInt();
	int i = 0;
	while (i < num){
	    i++;
	    if (num % i != 0){
		continue;
	    }
	    else {
		System.out.println("El número "+ i + " es múltiplo de " + num +".");
	    }
	}
    }
}