package com.stdstack.util;

import java.util.Random;

public class Randomizer {
    public static int getRandomInt(int min, int max){
        return min + new Random().nextInt(max-min);
    }
    public static String getRandomIP() {
        return getRandomInt(100,255) + "." +
                getRandomInt(100,255) + "." +
                getRandomInt(100,255) + "." +
                getRandomInt(100,255) + "." +
                getRandomInt(100,255);
    }
    public static Integer getRandomSessionId(){
        return getRandomInt(10_000_000, 99_999_999);
    }

    public static Long getConnectionTime;
}
