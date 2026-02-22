public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create array
        String[] lines = new String[7];

        // Step 2: Populate array
        lines[0] = " ***   ***  ******   ***** ";
        lines[1] = "*   * *   * *     * *     *";
        lines[2] = "*   * *   * *     * *      ";
        lines[3] = "*   * *   * ******   ****** ";
        lines[4] = "*   * *   * *             * ";
        lines[5] = "*   * *   * *       *     * ";
        lines[6] = " ***   ***  *        *****";

        // Step 3: Print using loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}