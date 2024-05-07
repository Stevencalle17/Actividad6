package com.example;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
      Random random = new Random();
      int numeroAleatorio = random.nextInt(max_numero - min_numero + 1) + min_numero;
      int intentos = 0;
      Scanner scanner = new Scanner(System.in);
        
      System.out.println("¡Hola Bienvenido al juego de adivinar el número!");
      System.out.println("Tienes que adivinar un número entre " + min_numero + " y " + max_numero + ".");
  
      while (intentos < max_intentos) {
        System.out.print("¡Vamos! elige tu numero: ");
        int suposicion = scanner.nextInt();
        intentos++;
  
        if (suposicion == numeroAleatorio) {
          System.out.println("¡Guau Felicitaciones! ¡Has adivinado el número en " + intentos + " intentos!");
          return;
        } else if (suposicion < numeroAleatorio) {
          System.out.println("¡Fallastes! El número elegido es mayor que " + suposicion + ".");
        } else {
          System.out.println("El número elegido es menor que " + suposicion + ".");
        }
      }
  
      System.out.println("Lo siento, has agotado todos tus intentos.");
      System.out.println("El número aleatorio era: " + numeroAleatorio);

    }
}