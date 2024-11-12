package com.ems.controller;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadDemo {
    public static void main(String[] args) {

        ExecutorService service = Executors.newVirtualThreadPerTaskExecutor();
        service.submit(()-> System.out.println("abc"));
    }
}
