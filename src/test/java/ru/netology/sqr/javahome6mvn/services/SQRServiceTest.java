package ru.netology.sqr.javahome6mvn.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    // @CsvSource({
    //         "3,200,300",
    //        "8,200,500"
    //})
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void shouldCalc1(int expected, int x, int y) {
        SQRService service = new SQRService();

        //int expected=3;
        int actual = service.calcSQR(x, y);

        Assertions.assertEquals(expected, actual);

    }


}
