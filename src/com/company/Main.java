package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    Random roll = new Random();
    Scanner keyboard = new Scanner(System.in);
    String alfabet=" ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

    public static void main(String[] args) {
	// write your code here
        Main action = new Main();
        System.out.println("Choose menu option");
        action.menu(action.keyboard.nextInt());
    }
    public void menu(int command){
        keyboard.nextLine();
        switch (command){
            case 1 -> caesarEncryptionMenu();
            //case 2 -> caesarDecryption();
            default -> menu(keyboard.nextInt());
        }
    }
    public void caesarEncryptionMenu(){
        System.out.println("Input Line");
        String input = keyboard.nextLine();
        caesarEncryption(input);
    }
    public int caesarEncryption(String input){



        for (int i=0; i<input.length(); i++){
            char letter = input.charAt(i);
            int tal = letterToNumber(letter);
            System.out.println(tal);
        }
        return -1;
    }
    public int letterToNumber(char letter){
        for (int i=0;i<alfabet.length();i++){
            char c = alfabet.charAt(i);
            if (c == letter){
                return i;
            }
        }
        return -1;
    }
    public int shiftNumbers(){
        for (int i=0;i<0;i++){

        }
        return -1;
    }
    public String numbersToLetters(){
        return " ";

    }
}
