package ru.bekker.structural.adapter;

import java.util.List;
import java.util.concurrent.*;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int rand = RandomGenerator.getDefault().nextInt(100);
        System.out.println(rand);

    }

}
