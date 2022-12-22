package ru.bekker.creational.singleton;

/**
 * https://telegra.ph/Double-check-locking-with-Singleton-12-12
 * Как сделать потокобезопасный синглтон?
 * 1) Синхронизированный метод
 * 2) Блокировка с двойной проверкой и volatile - поле.
 * 3) Ранняя инициализация поля в классе
 * 4) Поздняя инициализация во вложенном статическом классе
 * 5) Enum
 */
public class ProgramLogger {
    private static String logFile = "This is log file\n\n";

    private ProgramLogger() {
    }

    private static final class ProgramLoggerHolder {
        private static final ProgramLogger programLogger = new ProgramLogger();
    }

    public static ProgramLogger getProgramLogger() {
        return ProgramLoggerHolder.programLogger;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }

    private static class Singleton {
        private static volatile Singleton singleton;
        public static Singleton getInstance() {
            if (singleton == null) {
                synchronized (Singleton.class) {
                    if (singleton == null) {
                        singleton = new Singleton();
                    }
                }
            }
            return singleton;
        }
    }

    private enum EnumSingleton {
        INSTANCE
    }
}
