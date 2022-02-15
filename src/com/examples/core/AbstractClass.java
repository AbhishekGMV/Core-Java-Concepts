package com.examples.core;

abstract class SnapToKill {
    abstract void getGauntlet();
    abstract void collectStones();
}

class Thanos extends SnapToKill{ //concrete class
    @Override
    void getGauntlet() {
        System.out.println("Slap Eitri");
    }

    @Override
    void collectStones() {
        System.out.println("Slap avengers");
    }
}

class IronMan extends  SnapToKill {

    @Override
    void getGauntlet() {
        System.out.println("Create gauntlet");
    }

    @Override
    void collectStones() {
        System.out.println("Time travel!");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        SnapToKill thanos = new Thanos();
        thanos.getGauntlet();
        thanos.collectStones();

        SnapToKill ironman = new IronMan();
        ironman.getGauntlet();
        ironman.collectStones();
    }
}

