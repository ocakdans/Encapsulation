package com.selims.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Player player = new Player();
//        player.name = "Selim";
//        player.health=100;
//        player.weapon="Gun";
//
//        int damage= 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health : " + player.healthRemaining());
//
//        damage= 91;
//        player.loseHealth(damage);
//        System.out.println("Remaining health : " + player.healthRemaining());


        int arr[] = {9, 8, 7, 6};

        String s2 = null;

        try{

            System.out.println(s2.length());

            System.out.print("Good");

        }catch(NullPointerException e) {

            System.out.print("Better");

        }



        EnhancedPlayer player = new EnhancedPlayer("Selim",101, "Sword");
        System.out.println("initial health of player is:  "  + player.getHealth());


    }
}
