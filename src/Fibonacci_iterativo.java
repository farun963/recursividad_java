// Integrantes: Gerardo Vicente y Reynaldo Nequi

public class Fibonacci_iterativo {

    // Método para calcular el número de Fibonacci de manera iterativa
    public static int fibonacciIterativo(int n) {
        if (n <= 1)
            return n;

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    // Método principal para probar la implementación iterativa
    public static void main(String[] args) {
        int n = 11; // El número de Fibonacci que queremos calcular
        int resultado = fibonacciIterativo(n);
        System.out.println("El número de Fibonacci en la posición " + n + " es: " + resultado);
    }
}

