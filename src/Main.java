/*

                   ArminMalekMohammadiBidhendi     39912330117022    The encrypt decrypt practice

                   به صورت پیشفرض

 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileDir = ".\\file.txt";// آدرس فایل دلخواه خود را در اینجا قرار دهید!
        encryptDecrypt newFile = new encryptDecrypt(fileDir);

        try {
            newFile.code();
            System.out.println("coded successfully");
            newFile.decode();
            System.out.println("decoded successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}