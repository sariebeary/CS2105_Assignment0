
import java.util.*;
import java.io.*;

/**
 * CS 2105 
 *
 * @author Sarah Bednar
 */
public class Copier {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Error: Enter only one argument, the file to read.");
            System.exit(1);
        }

        File input = new File(args[0]);
        if (!isReadableFile(input)) {
            System.out.println("Error: File " + input + " does not exist.");
            System.exit(1);
        }

    }



}
