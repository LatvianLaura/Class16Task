package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        //creating object with constructor without arguments

        // BUSINESS REQUIREMENTS FOR LESSON #12
        // 1. I would like to see a MENU to select different parts of superhero information card
        // 2. A list of superheroes
        // 3. Add new superhero
        // 4. show specific superhero information
        // 5. Delete the superhero from the list
        // Variable initialization
        Scanner scan = new Scanner(System.in);
        System.out.println("Please press 1 if you want to see info about the existing hero");
        System.out.println("Please press 2 if you want to enter new superhero");
        int menuOption = scan.nextInt();


        Hero hero1 = new Hero("Laura", "Diediske", "Laty", 1234566, HeroType.Hero, 35);
        Hero hero2 = new Hero("Anna", "Panna", "Ironman", 0007, HeroType.Hero, 8);
        Hero hero3 = new Hero();
        hero3.setName("John");
        hero3.setSurname("Kabinets");
        hero3.setDeedTime(42);
        hero3.setNickname("DR Evil");
        hero3.setHeroType(HeroType.Villain);

        Hero[] metropole = new Hero[3];
        metropole[0] = hero1;
        metropole[1] = hero2;
        metropole[2] = hero3;

        if (menuOption == 1) {
            for (int i = 0; i < metropole.length; i++) {
                System.out.println(metropole[i]);
            }

        } else {
            System.out.println("Enter the name of new hero: ");
            String newHeroName = scan.next();
            System.out.println("Enter the surname of new hero: ");
            String newHeroSurname = scan.next();
            System.out.println("Enter his/her nickname: ");
            String newHeroNickName = scan.next();
            System.out.println("What is his ID: ");
            Double newHeroID = scan.nextDouble();
            System.out.println("Is he/she evil (true or false)? :");
            Boolean newHeroType = scan.nextBoolean();
            System.out.println("Enter the deed time: ");
            Double newHeroDeedTime = scan.nextDouble();

            System.out.println("*** HERO INFORMATION ***");

            System.out.println("Hero name: " + newHeroName);
            System.out.println("Hero's surname is  " + newHeroSurname);
            System.out.println("Hero's nickname is : " + newHeroNickName);

            System.out.println(newHeroID + " is his hero ID.");
            System.out.println("Hero's deed time is: " + newHeroDeedTime);
            System.out.println();

            // If a hero is a villain or a hero
            if (newHeroType) {
                System.out.println(" Hero is a villain");
            } else {
                System.out.println("hero protects the city!");
            }

        }

        int heroNumber = scan.nextInt();
        scan.close();

        //////////////////////////////////////////////////////////////////
        /*
        Hero hero1 = new Hero("Laura", "Diediske", "Laty", 1234566, HeroType.Hero, 35);
        Hero hero2 = new Hero("Anna", "Panna", "Ironman", 0007, HeroType.Hero, 8);
        Hero hero3 = new Hero();
        hero3.setName("John");
        hero3.setSurname("Kabinets");
        hero3.setDeedTime(42);
        hero3.setNickname("DR Evil");
        hero3.setHeroType(HeroType.Villain);

        Hero[] metropole = new Hero[3];
        metropole[0] = hero1;
        metropole[1] = hero2;
        metropole[2] = hero3;
        */
        int counter = 0;
        for (Hero hero : metropole) {
            if (hero.calculatedLevel() == 1) {
                counter++;
            }
        }
        System.out.println("Hero 1 level is " + hero1.calculatedLevel());
        System.out.println("Hero 2 level is " + hero2.calculatedLevel());
        System.out.println("Hero 3 level is " + hero3.calculatedLevel());

        boolean isJohn = false;
        for (Hero hero : metropole) {
            if (hero.getName().matches("John")) {
                isJohn = true;
                break;
            }
        }
        if (isJohn) { //boolean is not compared to true/false
            System.out.println("There is a hero named John in metropolis");
        }
    }
}
