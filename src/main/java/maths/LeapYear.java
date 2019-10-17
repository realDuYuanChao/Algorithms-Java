package maths;

/**
 * @author shellhub
 * <p>
 * reference: https://en.wikipedia.org/wiki/Leap_year
 * </p>
 */
public class LeapYear {
    public static void main(String[] args) {
        int[] years = {1977, 2021, 1980, 2020, 1900, 2000, 3200};
        for (int year : years) {
            if (isLeapYear(year)) {
                System.out.println(year + " is leap year.");
            } else {
                System.out.println(year + " is not leap year.");
            }
        }
    }

    /**
     * Check if year is leap year or not
     *
     * @param year the year to check
     * @return <tt>true</tt> if {@code year} is leap year
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 3200 != 0);
    }
}
