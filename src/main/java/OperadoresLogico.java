import java.util.Scanner;

//3.3. Operadores lógicos
public class OperadoresLogico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Cortisol: ");
        double cortisol = entrada.nextDouble();
        //cortisol ideal é de 6 a 18.4

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;

        System.out.printf("Nivel de cortisol: %b%n", resultadoNormal);

        boolean resultadoAnormal = cortisol <6.0 || cortisol > 18.4;

        System.out.printf("Nivel de cortisol Anormal: %b%n", resultadoAnormal);

    }


}
//&& operador e
// || operador ou