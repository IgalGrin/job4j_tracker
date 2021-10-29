package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;
public class MagicBall {
    public static void main(String[] args) {
        String answer = "Может быть";
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int random = new Random().nextInt(3);
        if (random == 0) {
            answer = "Да";
        } else if (random == 1) {
            answer = "Нет";
        }
        System.out.println("Ответ на вопрос " + question + ": " + answer);
    }
}
