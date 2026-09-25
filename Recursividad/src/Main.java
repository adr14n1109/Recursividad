import javax.sound.sampled.Line;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static int sumar(int n) {
        if (n == 1) {
            return 1;
        }
        int sumaHastaElMomento = n + sumar(n - 1);
        return sumaHastaElMomento;
    }
    static int potencia(int base, int exponente){
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    static int contarDigitos(int n){
        if(n >= 0 && n < 10){
            return 1;
        }
        if(n < 0){
            return contarDigitos(-n);
        }
        return 1 + contarDigitos(n / 10);
    }
    static String invertir(String cadena){
        if (cadena.length() <= 1){
            return cadena;
        }
        return cadena.charAt(cadena.length()-1)+ invertir(cadena.substring(0, cadena.length()-1));
    }

    public static void main(String[] args) {

        //Punto 1
        //System.out.println(factorial(5)); //Punto 1

        //Punto 2
        //System.out.println(sumar(5)); //Punto 2

        //Punto 3
        //System.out.println(potencia(5,2));

        //Punto 4
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese un numero: ");
        //int numero = sc.nextInt();
        //System.out.println("Contar digitos(" + numero + ") -> " + contarDigitos(numero));

        //Punto 5
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese un texto: ");
        //String texto = sc.nextLine();
        //System.out.println("El texto invertido es: " + invertir(texto));
    }
}