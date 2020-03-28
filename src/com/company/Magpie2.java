package com.company;

public class Magpie2 {
    public static void main(String[] args) {

    }
    public static String getrandom()
        {

            int random = (int)(Math.random() * 4);

            switch (random) {
                case 0 :
                    return "Ummmmmm.";
                case 1 :
                    return "How is your day going";
                case 2 :
                    return "The weather is nice";
                case 3 :
                    return "That is pretty neat";

                default:
                    return "invalid number";

            }


    }
}

