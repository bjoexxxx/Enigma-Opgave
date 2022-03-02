package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    Random roll = new Random();
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        Main action = new Main();
        action.menu(action.keyboard.nextInt());
    }
    public void menu(int command){
        switch (command){
            case 1 -> caesarEncryption();
            case 2 -> caesarDecryption();
            default -> menu(keyboard.nextInt());
        }
    }
    public String caesarInput(){
        String input = keyboard.nextLine();
      return input;
    }
    public int lettersToNumbers(){
        caesarInput()
        String alfabet=" ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        return numbers;
    }
    public int shiftNumbers(){

    }
    public String numbersToLetters(){

    }
}
