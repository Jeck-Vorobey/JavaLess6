package ru.netology.sqr.service;

public class SQRService {

    public int sqrService(int min, int max) {

        int first = 10;
        int last = 99;

        for (int i = 0; first <= last; first++) {
            //int min;
            if (first * first < min) {
                continue;
            }
            if (first * first <= max) {
                i++;
                continue;
            }
            return i;
        }
        return -1;

    }
}
