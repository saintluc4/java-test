import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        double num1 = scanner.nextDouble(); 

        System.out.print("Insira o operador logico (+) (Soma) , (-) Subtração , (*) Multiplicação , (/) Divisão): ");
        char operador = scanner.next().charAt(0); 

        System.out.print("Insira o segundo numero: ");
        double num2 = scanner.nextDouble(); 

        double result;

        switch (operador) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por 0");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operador logico invalido.");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + result);
        scanner.close();
    }
}