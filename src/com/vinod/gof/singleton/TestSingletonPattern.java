package com.vinod.gof.singleton;

public class TestSingletonPattern {
    public static void main(String[] args) {
        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        System.out.println(singletonPattern1 == singletonPattern2);
        System.out.println(System.identityHashCode(singletonPattern1));
        System.out.println(System.identityHashCode(singletonPattern2));
    }
}
