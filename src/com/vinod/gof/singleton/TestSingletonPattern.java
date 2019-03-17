package com.vinod.gof.singleton;

import java.io.*;

public class TestSingletonPattern {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Runnable runnable1 = () -> {
            System.out.println("Thread 1 is running");
            SingletonPattern singletonPattern3 = SingletonPattern.getInstance();
            System.out.println(System.identityHashCode(singletonPattern3));
        };

        Runnable runnable2 = () -> {
            System.out.println("Thread 2 is running");
            SingletonPattern singletonPattern4 = SingletonPattern.getInstance();
            System.out.println(System.identityHashCode(singletonPattern4));
        };

        Runnable runnable3 = () -> {
            System.out.println("Thread 3 is running");
            SingletonPattern singletonPattern5 = SingletonPattern.getInstance();
            System.out.println(System.identityHashCode(singletonPattern5));
        };

        Runnable runnable4 = () -> {
            System.out.println("Thread 4 is running");
            SingletonPattern singletonPattern6 = SingletonPattern.getInstance();
            System.out.println(System.identityHashCode(singletonPattern6));
        };

        runnable1.run();
        runnable2.run();
        runnable3.run();
        runnable4.run();

        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        System.out.println(singletonPattern1 == singletonPattern2);
        System.out.println(System.identityHashCode(singletonPattern1));
        System.out.println(System.identityHashCode(singletonPattern2));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\vinod\\projects\\serilized-object.ser")));
        objectOutputStream.writeObject(singletonPattern1);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("C:\\vinod\\projects\\serilized-object.ser")));
        SingletonPattern singletonPattern = null;
        singletonPattern = (SingletonPattern) objectInputStream.readObject();

        System.out.println("Check serialized result: "+(singletonPattern1 == singletonPattern));

    }
}
