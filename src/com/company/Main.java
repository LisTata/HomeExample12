package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
      //  System.out.println(generateString(3,6));
        ArrayList<LinkedList<String>> bigBox=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            LinkedList<String> smallBox=new LinkedList<>();
            for (int j = 0; j < 5; j++)
                smallBox.add(generateString(3,6));
                bigBox.add(smallBox);



        }
        for (LinkedList<String>  smallBox: bigBox) {
            for (String s : smallBox)
                System.out.print(s + " ");
            System.out.println();
        }

    }
    //Сгенерировать случайную строку
    public static String generateString(int minCount, int maxCount){
        Random random = new Random();
        //Получить случайное число от minCount до maxCount
        int count = random.nextInt(maxCount-minCount)+minCount;
        int rand=0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++){
            char c = (char)(random.nextInt((int)'z'-(int)'a')+'a');
            rand=random.nextInt(10)+1;
            sb.append(c);
        }

        return sb.toString()+rand;
    }

    }

