package ru.phonebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readline() {
        String readerString = "";
        try {
            readerString = reader.readLine();
            if (readerString.equals("exit")) {
                System.exit(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readerString;

    }

    public static int readDigital() {
        int readInt = 0;
        boolean isWord = true;
        while (isWord) {
            try {
                String str = reader.readLine();
                if (str.equals("exit")) {
                    System.exit(0);
                }
                readInt = Integer.parseInt(str);
                isWord = false;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Повторите ввод данных");
            }

        }
        return readInt;


    }
}





