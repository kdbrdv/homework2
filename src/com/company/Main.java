package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Test(generateRandomAge(), 25);
        Test(generateRandomAge(), 30);
        Test(generateRandomAge(), 9);
        Test(generateRandomAge(), 15);
        Test(generateRandomAge(), 5);


    }

    public static String Test(int ageOfPerson, int outsideTemperature) {
        String result = "Возраст:" + ageOfPerson + " Температура на улице " + outsideTemperature;
        System.out.println(result);

        if (ageOfPerson > 20 && ageOfPerson < 45 && outsideTemperature > -20 && outsideTemperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (ageOfPerson > 20 && outsideTemperature > 0 && outsideTemperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (ageOfPerson > 45 && outsideTemperature > -10 && outsideTemperature < 25) {
            System.out.println("Можно идти гулять");
        } else System.out.println("Оставайтесь дома");


        return result;


    }
    public static int generateRandomAge(){
        final int max = 100;
        Random random = new Random();
        return random.nextInt(max);

    }
}
