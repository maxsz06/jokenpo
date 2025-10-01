package br.jandira.senai.jokenpo;

import java.util.Scanner;

public class JogosApp {

    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("======Iniciando Game======");
        System.out.println("==========================");

        ConsoleJogo consoleJogo = new ConsoleJogo();
        consoleJogo.escolhaUsuario();
    }

}
