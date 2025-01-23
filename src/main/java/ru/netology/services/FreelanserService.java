package ru.netology.services;

public class FreelanserService {
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int restcounter = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                // отдых
                balance -= expenses;
                balance /= 3;
                restcounter++;

            } else {
                // работа
                balance += income;
                balance -= expenses;
            }
        }

        return  restcounter;
    }
}
