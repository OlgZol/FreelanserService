package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class FreelanserServiceTest {
    @Test
    public  void testCase1() {
        // Arrange
        FreelanserService service = new FreelanserService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        // Act
        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public  void testCase2() {
        // Arrange
        FreelanserService service = new FreelanserService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        // Act
        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;

        // Assert
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "test_data.csv")
    public void testWithParams (int income, int expenses, int threshold, int expected) {
        FreelanserService service = new FreelanserService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }
}