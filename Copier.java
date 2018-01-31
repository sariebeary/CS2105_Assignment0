
import java.io.*;


/**
 * CS 2105
 *
 * @author Sarah Bednar
 */
public class Copier {

    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("Usage: java Copier [src] [dest]");
            System.exit(1);
        }
        File input = new File(args[0]);
        if (!input.canRead() || !input.isFile()) {
            System.out.println("Error: File " + input + " does not exist.");
            System.exit(1);
        }

    }

}
