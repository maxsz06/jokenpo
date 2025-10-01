package br.jandira.senai.jokenpo;

import java.util.Random;
import java.util.Scanner;

public class ConsoleJogo {

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

  decidirQuemGanhou();
     }

 public void decidirQuemGanhou(){



      // caso der empate
     if (escolhaJogador == escolhaComputaodor){
       System.out.println("Empate!!");



         // caso o usuario ganhar o jogo
     }else if ((escolhaJogador == 1 && escolhaComputaodor ==3) ||
               (escolhaJogador == 2 && escolhaComputaodor ==1) ||
               (escolhaJogador == 3 && escolhaComputaodor ==2)) {

         System.out.println("Voce ganhou! ");

     }else{          // caso o console ganhar

             System.out.println("O computador ganhou =(");

     }

  reniciarJogo();
 }

 public void reniciarJogo() {

     String escolha;

     Scanner reniciar = new Scanner(System.in);

     System.out.println("Voce deseja reniciar o jogo?");
     System.out.println("----[ S/N ]----");
     System.out.println(" (S) Para Sim ");
     System.out.println(" (N) Para Não ");
     escolha = reniciar.nextLine();

     if (escolha.equals("S")) {

         escolhaUsuario();

     } else {

         System.out.println("Obrigado!");
     }


 }

}

