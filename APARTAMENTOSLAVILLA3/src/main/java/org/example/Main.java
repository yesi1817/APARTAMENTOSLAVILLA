package org.example;

import MODELOS.Apartamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("Alquiler de apartamentos la villa");


        System.out.println("\n BIENVENIDOS");


        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();

        System.out.println("Digite la direccion");
        apartamento.setDireccion(lea.nextLine());

        System.out.println("Nombre de la unidad");
        apartamento.setNombreUnidad(lea.nextLine());


        System.out.print("Digite Area o metros cuadrados");
        apartamento.setArea(lea.nextFloat());

        System.out.print("Digite numero de habitaciones");
        apartamento.setHabitaciones(lea.nextInt());

        System.out.print("Digite precio del alquiler");
        apartamento.setPrecioAlquiler(lea.nextFloat());

        System.out.print("Digite la cntidad de baños");
        apartamento.setBaños(lea.nextInt());

        System.out.println(apartamento);

    }
}