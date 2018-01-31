
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
        byte[] buffer = new byte[1024];
        FileInputStream fis = new FileInputStream(args[0]);
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream(args[1]);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        try {
            try {
                int numBytes;
                while ((numBytes = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, numBytes);
                }
            } finally {
                bos.close();
            }
        } finally {
            bis.close();
        }

        System.out.println(args[0] + " is successfully copied to " + args[1]);

    }

}
