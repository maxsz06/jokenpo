package br.jandira.senai.jokenpo;

import java.util.Random;
import java.util.Scanner;

public class ConsoleJogo {

    String pedra;
    String papel;
    String tesoura;
    int escolhaJogador;
    int escolhaComputaodor;

 public void escolhaUsuario(){

     Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha uma opção:");
    System.out.println("(1) Pedra");
    System.out.println("(2) Papel");
    System.out.println("(3) Tesoura");
    System.out.println("=======================");
    System.out.println("Escolha: ");
    escolhaJogador = scanner.nextInt();

    escolhaComputador();
 }

 public void escolhaComputador(){

     Random random = new Random();
    escolhaComputaodor = random.nextInt(3)+1;

     }

 public void decidirQuemGanhou(){

     if (escolhaJogador == escolhaComputaodor){

     }else if (escolhaJogador == 1 && escolhaComputaodor ==3){

     }
 }





}

