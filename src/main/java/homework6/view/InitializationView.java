package homework6.view;

public abstract class InitializationView {
    public static void printSetStartMessage() {
        System.out.println("Для игры быки и коровы, введите стартовые настройки:");
    }
    public static void requestWorldSize() {
        System.out.println("Введите длину слова:");
    }
    public static void requestTryCount() {
        System.out.println("Введите количество попыток:");
    }
    public static void requestGameType() {
        System.out.println("""
                Введите режим игры,
                en - кириллическое слово, ru - латиница, а также числа во всех остальных случаях"""
        );
    }
}
