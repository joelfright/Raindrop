package org.sparta.joel;

public class App {

    public static void main(String[] args) {
        System.out.println(raindrop(34));
    }

    public static String raindrop(int num){
        String result = "";

        //Checks for numbers that are out of bounds
        if(num <= 0){
            return "Number out of bounds";
        }

        // Checks all factors of int num
        if(num % 3 == 0){
            result += "Pling";
        }
        if(num % 5 == 0){
            result += "Plang";
        }
        if(num % 7 == 0){
            result += "Plong";
        }

        //Returns original number if no factors found
        if(result.equals("")){
            return String.valueOf(num);
        }

        return result;
    }

}
