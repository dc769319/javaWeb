package com.charles.tools;

import java.util.Random;

public class RandomNumber {
    public static int generate(int min, int max) throws Exception {
        if (max < min) {
            throw new Exception("Param max should greater than min");
        }
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }
}
