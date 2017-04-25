package com.hzz;

import jline.console.ConsoleReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsoleReader reader = new ConsoleReader();
        reader.addCompleter(new MyZkCommandCompletor());
        reader.setPrompt("my> ");
        String line = null;
        while ((line = reader.readLine()) != null) {
            if(line.equals("exit")) {
                break;
            }

        }
    }
}
