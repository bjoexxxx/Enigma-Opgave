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
        action.menu(action.keyboard.nextInt());
    }
    public void menu(int command){
        switch (command){
            case 1 -> caesarEncryptionMenu();
            //case 2 -> caesarDecryption();
            default -> menu(keyboard.nextInt());
        }
    }
    public void caesarEncryptionMenu(){
        String input = keyboard.nextLine();
        caesarEncryption(input);
    }
    public int caesarEncryption(String input){



        for (int i=0; i<input.length(); i++){
            char letter = input.charAt(i);
            lettersToNumbers();
        }
        return -1;
    }
    public void lettersToNumbers(){

    }
    public int shiftNumbers(){
        return -1;

    }
    public String numbersToLetters(){
        return " ";

    }
}
