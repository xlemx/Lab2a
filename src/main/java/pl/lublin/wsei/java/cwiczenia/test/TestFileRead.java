package pl.lublin.wsei.java.cwiczenia.test;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileRead {
    public static String contents= "";

    public static void main(String[] args) {
        try {
            contents= new String(Files.readAllBytes(Paths.get("infographic.xml")));
            System.out.println("ZAWARTOŚĆ PLIKU infographic.xml ");
            System.out.println(contents);
        } catch (IOException e) {
            System.out.println("Błąd wczytywania pliku infographic.xml ");
            e.printStackTrace();
        }
    }
}
