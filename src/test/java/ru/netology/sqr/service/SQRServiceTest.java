package ru.netology.sqr.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void numberSquaresInTheRange() {
        SQRService service = new SQRService();
        //int min = 200;
        //int max = 300;
        int expected = 3;
        int actual = service.sqrService(200, 300);
        Assertions.assertEquals(expected, actual);
    }
}
