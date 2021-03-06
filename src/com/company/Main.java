package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    Random roll = new Random();
    Scanner keyboard = new Scanner(System.in);
    String alfabet=" ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

    public static void main(String[] args) {
	// write your code here
        Main action = new Main();
        System.out.printf("""
            Choose menu option
            1. Caesar Encryption
            2. Caesar Decryption
            3. Exit Program
            """);
        action.menu(action.keyboard.nextInt());
    }
    public void menu(int command){
        keyboard.nextLine();
        switch (command){
            case 1 -> caesarEncryptionMenu();
            case 2 -> caesarDecryptionMenu();
            case 3 -> exitProgram();
            default -> menu(keyboard.nextInt());
        }
    }
    public void caesarEncryptionMenu(){
        System.out.println("Input sentence you wish encrypted");
        String input = keyboard.nextLine().toUpperCase();
        System.out.println(caesarEncryption(input));
        System.out.printf("""
            Choose menu option
            1. Caesar Encryption
            2. Caesar Decryption
            3. Exit Program
            """);
        menu(keyboard.nextInt());
    }
    public String caesarEncryption(String input){
        System.out.println("Input Shift value");
        int talShifted = keyboard.nextInt();
        StringBuilder build = new StringBuilder();

        for (int i=0; i<input.length(); i++){
            char letter = input.charAt(i);
            int tal = letterToNumber(letter);
            //System.out.println(tal);
            int shiftNumber=shiftNumber(tal,talShifted);
            if (shiftNumber>29){
                shiftNumber = (tal-alfabet.length()+1)+talShifted;
            } else if (shiftNumber<0){
                shiftNumber = (tal+alfabet.length()-1)+talShifted;
            }
            numberToLetter(shiftNumber,input);
            //System.out.print(numberToLetter(shiftNumber,input));
            build.append(numberToLetter(shiftNumber,input));
        }
        return build.toString();
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
    public int shiftNumber(int tal, int talShifted){
        int numberShifted = tal+talShifted;
        //System.out.println(tal);
        return numberShifted;
    }
    public char numberToLetter(int numberShifted, String input){
        char letter2;
        for (int i=0; i<input.length(); i++){
            letter2 = alfabet.charAt(numberShifted);
        return letter2;
        }
        return ' ';

    }
    public void caesarDecryptionMenu(){
        System.out.println("Input sentence you wish decrypted");
        String input = keyboard.nextLine().toUpperCase();
        System.out.println(caesarEncryption(input));
        System.out.printf("""
            Choose menu option
            1. Caesar Encryption
            2. Caesar Decryption
            3. Exit Program
            """);
        menu(keyboard.nextInt());
    }
    public void exitProgram(){
    }
}
