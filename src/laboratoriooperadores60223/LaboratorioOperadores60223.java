/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriooperadores60223;

/**
 *
 * @author Jairo
 */
public class LaboratorioOperadores60223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primera parte : Operadores usuarios
        //operadores de incremento
        int x = 10;
        int y = 10;
        boolean b = false;
        System.out.println("Valor inicial de x: " + x);
        System.out.println("Valor inicial de y: " + y);
        System.out.println("Valor inicial de x con pre-incremento: " + ++x);
        System.out.println("Valor inicial de y con pre-incremento: " + ++y);
        System.out.println("Valor final de x: " + x);
        System.out.println("Valor final de y: " + y);
        
        //operadores positivo/negativo|complemento booleano
        System.out.println("El negativo de x es : " + -x);
        System.out.println("El complemento de b es : " + !b);
        
        //Operador inversor a nivel de bits
        x = 192;
        System.out.println("El número 192 en binario es: " + Integer.toBinaryString(x));
        System.out.println("El inverso 192 en binario es: " + Integer.toBinaryString(~x));
        System.out.println("El inverso 192 es: " + ~x);
        
        //operador cast
        x = (int) 5.9999999999;
        System.out.println("Casteando un doble en entero: " + x);
        
        //segunda parte-operadores binarios
        //operadores aritmeticos
        x = 5;
        y = 5;
        System.out.println("suma: 5 + 5 = " + (x + y));
        System.out.println("resta: 5 - 5 = " + (x - y));
        System.out.println("multiplicación: 5 * 5 = " + (x * y));
        System.out.println("división: 5 / 5 = " + (x / y));
        System.out.println("módulo: 5 % 5 = " + (x % y));
        //concatenación
        String frase1 = "¡El operador suma (+)";
        String frase2 = "¡también une cadenas de texto!";
        System.out.println(frase1 + frase2);
        
        //división entera
        x = 7;
        y = 4;
        double z = x/y; //El resultado real es 1.75
        System.out.println("La división 7 / 4 es: " + z);
        
        //operadores lógico-relacionales
        b = (x > y);               // ¿7 mayor que 4? – true
        boolean b2 = (x < y);     // ¿7 menor que 4? - false
        boolean b3 = (x != y);   // ¿7 diferente de 4? – true
        System.out.println(" 7 > 4 AND 7 < 4?: " + (b && b2));
        System.out.println(" 7 > 4 OR 7 < 4?: " + (b || b2));
        System.out.println(" 7 > 4 AND 7 != 4?: " + (b && b3));
        System.out.println(" 7 > 4 Or 7 != 4?: " + (b || b3));
        System.out.println(" frase1 es un string? " + (frase1 instanceof String));
        
        //operadores de Asignación
        System.out.println("Hemos estado utilizando el operador " + "Asignación desde el principio! ¡Lo habías notado?");
        x = 10;
        y = 10;
        x += 20;
        y = y + 20;
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        
        //operadores Bitwise
        int byte1 = 51;
        int byte2 = 112;
        System.out.println("El byte1 en binario: " + Integer.toBinaryString(byte1));
        System.out.println("El byte2 en binario: " + Integer.toBinaryString(byte2));
        System.out.println("Operación Bitwise AND: " + Integer.toBinaryString(byte1 & byte2));
        System.out.println("Operación Bitwise OR: " + Integer.toBinaryString(byte1 | byte2));
        System.out.println("Operación Bitwise XOR: " + Integer.toBinaryString(byte1 ^ byte2));
        System.out.println("Desplazamiento 3 lugares a la izquierda: " + Integer.toBinaryString(byte1 << 3));
        System.out.println("Desplazamiento 3 lugares a la derecha: " + Integer.toBinaryString(byte1 >> 3));
        System.out.println("Desplazamiento sin signo 3 lugares a la "+"derecha :"  + Integer.toBinaryString(byte1 >>> 3));
        
        
    }
}
