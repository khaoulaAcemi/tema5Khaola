/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author khaoula
 */
public class Ej1 {
    public static void main(String[] args) {
        int numPalabras = obtenerNumPalabras();
        String[] arrayPalabras = obtenerArrayPalabras(numPalabras);
        mostrarArray(arrayPalabras);
        String[] arrayVocales = obtenerArrayPalabrasConVocales(arrayPalabras, 3);
        mostrarArray(arrayVocales);
        String[] arrayVocales2 = obtenerArrayPalabrasConVocales(arrayPalabras, 2);
        mostrarArray(arrayVocales2);
    }

    private static int obtenerNumPalabras() {
        try {
            String numPalabrasStr = JOptionPane.showInputDialog("Introduce el número de palabras a guardar: ");
            return Integer.parseInt(numPalabrasStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato incorrecto. Por favor, introduce un número.");
            return obtenerNumPalabras();
        }
    }

    private static String[] obtenerArrayPalabras(int numPalabras) {
        String[] arrayPalabras = new String[numPalabras];
        for (int i = 0; i < numPalabras; i++) {
            String palabra = JOptionPane.showInputDialog("Introduce la palabra " + (i + 1) + ": ");
            arrayPalabras[i] = palabra;
        }
        return arrayPalabras;
    }

    private static void mostrarArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("Posicion ").append(i).append(" - Palabra: ").append(array[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
        private static String[] obtenerArrayPalabrasConVocales(String[] arrayPalabras, int numVocales) {
        List<String> arrayVocales = new ArrayList<>();
        for (String palabra : arrayPalabras) {
            int contadorVocales int contadorV int intoc cont = contales = adorVocales 0;adorVocales =0 =0;
                 for ()
            
            
            
          
}
