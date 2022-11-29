/*

                   ArminMalekMohammadiBidhendi     39912330117022    The encrypt decrypt practice

 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileDir = "";// آدرس فایل خود را در اینجا قرار دهید!
        encryptDecrypt newFile = new encryptDecrypt(fileDir);

        try {
            newFile.code();
            newFile.code();
            newFile.decode();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}