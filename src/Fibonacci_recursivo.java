public class Fibonacci_recursivo {

    // Método para calcular el número de Fibonacci de manera recursiva
    public static int fibonacciRecursivo(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    // Método principal para probar la implementación recursiva
    public static void main(String[] args) {
        int n = 11; // El número de Fibonacci que queremos calcular
        int resultado = fibonacciRecursivo(n);
        System.out.println("El número de Fibonacci en la posición " + n + " es: " + resultado);
    }
}

