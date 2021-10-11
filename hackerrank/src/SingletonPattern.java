public class SingletonPattern {
    private static SingletonPattern instance;
    public static String str;
    private SingletonPattern() {}

    static SingletonPattern getSingleInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}
