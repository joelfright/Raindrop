package org.sparta.joel;

public class App {

    public static void main(String[] args) {
        System.out.println(raindrop(34));
    }

    public static String raindrop(int num){
        String result = "";

        if(num % 3 == 0){
            result += "Pling";
        }
        if(num % 5 == 0){
            result += "Plang";
        }
        if(num % 7 == 0){
            result += "Plong";
        }
        if(result.equals("")){
            return String.valueOf(num);
        }

        return result;
    }

}
