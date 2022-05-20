package com.example.shrtnr.app.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

class CoderServiceTest {

    private static final Random random = new Random();

    private static final List<CoderService> coderServices = List.of(
            new Coder8ServiceImpl(),
            new Coder16ServiceImpl(),
            new Coder62ServiceImpl()
    );

    @Test
    void consistency() {
        for (CoderService coderService : coderServices) {
            for (int i = 0; i < 10; i++) {
                int value = random.nextInt(Integer.MAX_VALUE);

                Assertions.assertEquals(value, coderService.decode(coderService.encode(value)));
            }
        }
    }
}