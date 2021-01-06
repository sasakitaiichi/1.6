package Exceptionhandling;
import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("andrew.txt");
        System.out.println("Dose it exists?"+file.exists());
        System.out.println("The file has"+file.length()+"bytes");
        System.out.println("Can it be read?"+file.canRead());

        System.out.println("Can it be written?"+file.canWrite());
        System.out.println("Is it a directory?" + file.isDirectory());
        System.out.println("Is it a file?"+file.isFile());
        System.out.println("Is it a absolut?"+file.isAbsolute());

    }
}
