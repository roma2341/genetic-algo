package com.zigzag.genetic;

import com.zigzag.genetic.core.AlgoManager;

public class Application {

    private static AlgoManager manager = new AlgoManager();
    public static void main(String... args) throws Exception{
        while(true){
            manager.nextGeneration();
            Thread.sleep(500L);
        }
    }
}
