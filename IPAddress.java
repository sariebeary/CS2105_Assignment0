
/**
 * CS 2105
 *
 * @author Sarah Bednar
 */
public class IPAddress {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Error: Enter only one argument, the binary representation of the ip address.");
            System.exit(1);
        }
        System.out.println(getDecimalAddress(args[0]));
    }

    public static String getDecimalAddress(String binaryIp) {
        try {
            long ip = Long.parseLong(binaryIp,2);
            return ((ip >> 24) & 0xFF)
                    + "." + ((ip >> 16) & 0xFF)
                    + "." + ((ip >> 8) & 0xFF)
                    + "." + (ip & 0xFF);
        } catch (NumberFormatException ex) {
            System.out.println("Error: Must enter binary integer value");
            System.exit(1);
        }
        return null;
    }

}
