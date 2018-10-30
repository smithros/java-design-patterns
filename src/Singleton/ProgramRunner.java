package Singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLogger().toString());
        ProgramLogger.getProgramLogger().addLogInfo("First Log");
        ProgramLogger.getProgramLogger().addLogInfo("Second Log");
        ProgramLogger.getProgramLogger().addLogInfo("Third Log");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
