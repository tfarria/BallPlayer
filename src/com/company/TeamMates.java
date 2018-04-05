package com.company;

import java.util.Scanner;

public class TeamMates {

    public static void main(String[] args) {
        boolean touchdown = false;
        Scanner keyboard = new Scanner(System.in);
        BallPlayer Drew;
        String answer = " ";


        Drew = new BallPlayer();



            do {


                System.out.println("What is your jersey number ? ");
                Drew.setJerseyNumber(keyboard.nextLine());

                System.out.println("What position do you play ? ");
                Drew.setPosition(keyboard.nextLine());

                System.out.println("What team do you play for ? ");
                Drew.setTeamName(keyboard.nextLine());

                System.out.println("Do you want to enter another player ?   (Y/N)");
                answer = keyboard.nextLine();

                if (answer.equalsIgnoreCase("N")  ||  answer.equalsIgnoreCase("No"))

                touchdown = true;


            }while (!touchdown);
    }
}
