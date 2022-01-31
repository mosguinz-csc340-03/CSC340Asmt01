/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: Kullathon Sitthisarnwattanachai
 * **********************************************
 */
package assignment02PartB;

// Please organize all the given files in 1 same package

import java.util.Locale;
import java.util.ResourceBundle;

// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
public class Language {

    //
    // Static Data Fields
    //
    private static final String defaultPreference = "English"; // default
    private static final String officialGreeting = "Say Hey Willie";
    private static final String officialSong = "Take Me out to the Ball Game";
    private static final String officialAppName = "SF Giants Thank You";
    private static final String LANGUAGE_PATH = "assignment02PartB.resources.i18n";
    private static final Locale DEFAULT_LOCALE = new Locale("en");
    private static final Locale[] SUPPORTED_LOCALES = {
            DEFAULT_LOCALE, new Locale("th"), new Locale("alien")
    };
    private final String language;
    private final Locale locale;

    /**
     * Initialize {@link Language} with {@link #defaultPreference} as the language.
     */
    public Language() {
        this.language = defaultPreference;
        this.locale = DEFAULT_LOCALE;
    }

    /**
     * Initialize {@link Language} with {@code language}.
     *
     * @param language The language to use.
     */
    public Language(String language) {
        this.locale = findLocale(language);
        this.language = getLanguageLabel(locale);
    }

    public static String getOfficialAppName() {
        return officialAppName;
    }

    public static String getOfficialGreeting() {
        return officialGreeting;
    }

    public static String getOfficialSong() {
        return officialSong;
    }

    /**
     * Gets a supported language from the input.
     * <p>
     * {@code input} can be either the language code or the name of the language itself. Returns
     * {@link #DEFAULT_LOCALE} if the language is not supported.
     *
     * @param input The desired language.
     * @return The {@link Locale} object representing the language.
     */
    private static Locale findLocale(String input) {
        input = input.strip();
        for (Locale locale : SUPPORTED_LOCALES) {
            if (locale.getLanguage().equalsIgnoreCase(input)
                    || locale.getDisplayLanguage().equalsIgnoreCase(input)) {
                return locale;
            }
        }
        return DEFAULT_LOCALE;
    }

    public String getLanguage() {
        return language;
    }

    public Locale getLocale() {
        return locale;
    }

    /**
     * Gets the human-readable name of the language in the default locale.
     *
     * @param l The locale object.
     * @return The string used to represent the language.
     */
    private String getLanguageLabel(Locale l) {
        if (l.getLanguage().equalsIgnoreCase("alien")) {
            return "Alien";
        }
        return l.getDisplayLanguage(DEFAULT_LOCALE);
    }

    /**
     * Gets the {@link ResourceBundle} containing the strings for the specified {@code className}.
     * <p>
     * English strings will be used as a fallback if the strings for {@link #locale} cannot be
     * found.
     *
     * @param className The name of the resource bundle, which must be a fully-qualified class name
     *                  of this package.
     * @return A resource bundle containing the strings for the specified class.
     */
    public ResourceBundle getBundle(String className) {
        return ResourceBundle.getBundle(LANGUAGE_PATH + '.' + className, locale);
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getGreetingIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getFrontOfficeIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getCardIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getChatSessionIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getClubIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getColorIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getCommonIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getDecorIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getConfigIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getGeneralManagerIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getManagerIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getMessengerIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getPersonIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getPlayerIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getPresidentIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getQuestionAnswerIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getQuizIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getReceiptIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getSfGiantsCardGeneratorIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getStdOutStdErrIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getStudentIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getTimerIdx(int i) {
        return null;
    }

    /**
     * @deprecated Unused convenience method. Defined to allow compilation without editing {@link
     *         MyFavoriteApp}.
     */
    @Deprecated
    public String getUniversityIdx(int i) {
        return null;
    }
}
