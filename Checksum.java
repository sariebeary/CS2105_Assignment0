
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.CRC32;

/**
 * CS 2105
 *
 * @author Sarah Bednar
 */
public class Checksum {

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Error: Enter only one argument, the file to read.");
            System.exit(1);
        }
        File input = new File(args[0]);
        if (!input.canRead() || !input.isFile()) {
            System.out.println("Error: File " + input + " does not exist.");
            System.exit(1);
        }
        byte[] bytes = Files.readAllBytes(Paths.get(args[0]));
        CRC32 crc = new CRC32();
        crc.update(bytes); // compute checksum
        System.out.println(crc.getValue()); // print checksum
    }

}
