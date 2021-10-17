package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic request = new DummyDic();
        String answer = request.engToRus("bicycle");
        System.out.println(answer);
    }
}
