import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class encryptDecrypt {

    String fileDirectory;
    boolean isEncrypted;
    public encryptDecrypt(String fileDirectory_){
        fileDirectory = fileDirectory_;
    }
    public void changeFileURL(String newFileDirectory){ fileDirectory = newFileDirectory; }
    public void code() throws IOException {

        if ( !isEncrypted ){

            File userFile = new File(fileDirectory);
            Scanner fileScan = new Scanner(userFile);
            String fileContext = "";
            String codedFile = "";

            while (fileScan.hasNextLine()){ fileContext = fileContext.concat((fileScan.nextLine()+"\n")); }

            char[] charArray = fileContext.toCharArray();

            for(int x = 0; x < fileContext.length(); x++){
                int id = (int) charArray[x];
                int codeId = 2*id +2;
                charArray[x] = (char) codeId;
            }

            for(int x = 0; x < charArray.length; x++){
                codedFile += charArray[x];
            }

            FileWriter codedWriter = new FileWriter(fileDirectory);
            codedWriter.flush();
            codedWriter.write(codedFile);
            codedWriter.close();

            isEncrypted = true;

        }else System.out.println("The file is already encrypted!");

    }


    public void decode() throws IOException {

        if ( isEncrypted == true ){

            File userFile = new File(fileDirectory);
            Scanner fileScan = new Scanner(userFile);
            String codedFIle = "";
            String decodedFile = "";

            while (fileScan.hasNextLine()){ codedFIle = codedFIle.concat((fileScan.nextLine()+"\n")); }

            char[] charArray = codedFIle.toCharArray();

            for(int x = 0; x < codedFIle.length(); x++){
                int id = (int) charArray[x];
                int codeId = id/2 -1;
                charArray[x] = (char) codeId;
            }

            for(int x = 0; x < charArray.length; x++){
                decodedFile += charArray[x];
            }

            FileWriter codedWriter = new FileWriter(fileDirectory);
            codedWriter.flush();
            codedWriter.write(decodedFile);
            codedWriter.close();

            isEncrypted = true;

        }else System.out.println("The file is not encrypted!");

    }
}
