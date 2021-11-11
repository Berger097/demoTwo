package ru.netology.sqr;

public class SQRService {

    public static int sqr(int nomOne, int nomeTwo) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= nomOne) {
                if (i * i <= nomeTwo) {
                    counter = counter + 1;
                }

            }

        }
        System.out.println(counter);
        return counter;

    }
}
