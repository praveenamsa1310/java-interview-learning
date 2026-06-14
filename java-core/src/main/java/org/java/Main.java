package org.java;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CompletableFuture<String> first =
                CompletableFuture.supplyAsync( () -> "Hello");
        CompletableFuture<String> second =
                CompletableFuture.supplyAsync(() -> "Praveen");

        CompletableFuture<String> result =
                first.thenCombine(second, (a, b) -> a + " " +b);
        System.out.println(result.join());
    }
}