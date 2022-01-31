/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Color.java
 * @author: Duc Ta
 * @author: Kullathon Sitthisarnwattanachai
 * **********************************************
 */
package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public class Color {

    // @formatter:off
    public static final String defaultPreference = "ANSI"; // default
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    // @formatter:on

    //
    // Instance Data Fields
    //
    /**
     * The character encoding system.
     */
    public final String encoding;

    /**
     * Initialize {@link Color} with {@link #defaultPreference} as the character encoding.
     */
    public Color() {
        this.encoding = defaultPreference;
    }

    /**
     * Initialize {@link Color} with {@code encoding} as the character encoding.
     *
     * @param encoding The character encoding type to use.
     */
    public Color(String encoding) {
        this.encoding = encoding;
    }

    /**
     * Generates a highlighted string in SF State theme color.
     *
     * @param s The string to highlight.
     * @return The highlighted string in the format specified in the sample output.
     */
    public static String sfsuHighlight(String s) {
        return ANSI_PURPLE_BACKGROUND + ANSI_YELLOW + s + ANSI_RESET;
    }

    public String getEncoding() {
        return encoding;
    }
}
