/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Messenger.java
 * Author: Duc Ta
 * Author: Kullathon Sitthisarnwattanachai
 * **********************************************
 */

//
// Please DO NOT CHANGE this file.
// Please DO NOT CHANGE this file.
// Please DO NOT CHANGE this file.
//

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class MyFavoriteApp {

    //
    // Static Data Fields
    //
    private static final Config config = new Config();

    //
    // Constructors
    //
    private MyFavoriteApp() {
    }

    //
    // main
    //
    public static void main(String[] args) {
        MyFavoriteApp.config.getStdOutStdErrTee().startLog();
        MyFavoriteApp.config.setPreferences();
        (new ChatSession(MyFavoriteApp.config.getClub(), MyFavoriteApp.config.getUniversity())).runChatSession();
        StdOutStdErrTee.stopLog();

        // Please feel free to use GraderTest to test our programs.
        // Grader tests are not a part of our required output.
        // GraderTest.run();
    }

    //
    // Static Methods
    //
    public static Config getConfig() {
        return MyFavoriteApp.config;
    }


    //
    // Method Shortcuts (convenient but optional to use)
    // Please DO NOT CHANGE this file. Please DO NOT comment out code.
    //
    public static String getGreetingIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getGreetingIdx(i);
    }
    public static String getFrontOfficeIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getFrontOfficeIdx(i);
    }
    public static String getCardIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getCardIdx(i);
    }
    public static String getChatSessionIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getChatSessionIdx(i);
    }
    public static String getClubIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getClubIdx(i);
    }
    public static String getColorIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getColorIdx(i);
    }
    public static String getNowTime(String s) {
        return MyFavoriteApp.getConfig().getTimer().getNowTime(s);
    }
    public static String getCommonIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getCommonIdx(i);
    }
    public static String getDecorIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getDecorIdx(i);
    }
    public static String getConfigIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getConfigIdx(i);
    }
    public static String getGeneralManagerIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getGeneralManagerIdx(i);
    }
    public static String getManagerIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getManagerIdx(i);
    }
    public static String getMessengerIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getMessengerIdx(i);
    }
    public static String getPersonIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getPersonIdx(i);
    }
    public static String getPlayerIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getPlayerIdx(i);
    }
    public static String getPresidentIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getPresidentIdx(i);
    }
    public static String getQuestionAnswerIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getQuestionAnswerIdx(i);
    }
    public static String getQuizIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getQuizIdx(i);
    }
    public static String getReceiptIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getReceiptIdx(i);
    }
    public static String getSFGiantsCardGeneratorIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getSfGiantsCardGeneratorIdx(i);
    }
    public static String getStdOutStdErrTeeIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getStdOutStdErrIdx(i);
    }
    public static String getStudentIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getStudentIdx(i);
    }
    public static String getTimerIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getTimerIdx(i);
    }
    public static String getUniversityIdx(int i) {
        return MyFavoriteApp.getConfig().getLang().getUniversityIdx(i);
    }
}
