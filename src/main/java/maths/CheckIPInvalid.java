package maths;

public class CheckIPInvalid {
    public static void main(String[] args) {
        assert isValid("128.0.0.1");
        assert isValid("125.16.100.1");
        assert !isValid("125.512.100.1");
        assert !isValid("125.512.100.abc");
    }

    /**
     * Check if specified ip is valid
     *
     * @param ip to be checked
     * @return <tt>true</tt> if <tt>ip</tt> is valid, otherwise <tt>false</tt>
     */
    private static boolean isValid(String ip) {
        String[] bits = ip.split("\\.");
        if (bits.length != 4) {
            return false;
        }
        for (String bit : bits) {
            try {
                if (Integer.parseInt(bit) < 0 || Integer.parseInt(bit) > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false; /* contains other other character */
            }
        }
        return true;
    }
}
