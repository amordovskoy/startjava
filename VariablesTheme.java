import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static final long NANO_START_TIME = System.nanoTime();
    public static final LocalTime LOCAL_TIME_START = LocalTime.now();

    public static void main(String[] args) {
        // NANO_START_TIME = System.nanoTime();
        // LOCAL_TIME_START = LocalTime.now();
        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println("                     /\\");
        System.out.println("   J    a  v     v  /  \\");
        System.out.println("   J   a a  v   v  /_( )\\");
        System.out.println("J  J  aaaaa  V V  /      \\");
        System.out.println(" JJ  a     a  V  /___/\\___\\");
        
        System.out.println("\n");
        String textBlock = """
                                 /\\            
                           J    /  \\  v     v  a
                           J   /_( )\\  v   v  a a
                        J  J  /      \\  V V  aaaaa
                         JJ  /___/\\___\\  V  a     a
                        """;
        System.out.println(textBlock);

        // РАСЧЕТ СТОИМОСТИ ТОВАРА (первый вариант)
        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА (первый вариант)");

        float pencilCost = (float) 105.5;
        float bookCost = (float) 235.23;
        int discount = 11;

        float sumWithDiscount = (pencilCost + bookCost) - ((pencilCost + bookCost) / 100 * discount);

        System.out.println("Cтоимость ручки без скидки " + pencilCost);
        System.out.println("Cтоимость книги без скидки " + bookCost);
        System.out.println("Cтоимость комбочека со скидкой " + sumWithDiscount);

        // РАСЧЕТ СТОИМОСТИ ТОВАРА (второй вариант)
        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА (второй вариант)");
        var bdpencilCost = new BigDecimal("105.5");
        var bdbookCost = new BigDecimal("235.23");
        var bddiscount = new BigDecimal("11");
        var bdsumWithoutDiscount = bdpencilCost.add(bdbookCost);
        var sumDiscount = bdsumWithoutDiscount.divide(new BigDecimal(100));
        sumDiscount = sumDiscount.multiply(bddiscount);
        var bdsumWithDiscount = bdsumWithoutDiscount.subtract(sumDiscount).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Cтоимость ручки без скидки " + bdpencilCost);
        System.out.println("Cтоимость книги без скидки " + bdbookCost);
        System.out.println("Cтоимость комбочека со скидкой " + bdsumWithDiscount);

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        // Метод: третьей переменной
        System.out.println("\nИсходные значения A1 = 2, B1 = 5");
        int a1;
        int b1;
        int temp;

        a1 = 2;
        b1 = 5;
        temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("\nМетод: третьей переменной");
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;

        System.out.println("\nМетод: арифметических операций");
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("Метод: побитовой операции ^");
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        
        // 4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ
        System.out.println("\n4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");

        int asCode1 = 1055;
        int asCode2 = 1088;
        int asCode3 = 1080;
        int asCode4 = 1074;
        int asCode5 = 1077;
        int asCode6 = 1090;

        char asLet1 = (char) asCode1;
        char asLet2 = (char) asCode2;
        char asLet3 = (char) asCode3;
        char asLet4 = (char) asCode4;
        char asLet5 = (char) asCode5;
        char asLet6 = (char) asCode6;

        System.out.printf("%4d%6d%6d%6d%6d%6d", asCode1, asCode2, asCode3, asCode4, asCode5, asCode6);
        System.out.printf("\n");
        System.out.printf("%4s%6s%6s%6s%6s%6s", asLet1, asLet2, asLet3, asLet4, asLet5, asLet6);

        // 5. АНАЛИЗ КОДА ТОВАРА
        System.out.println("\n4. АНАЛИЗ КОДА ТОВАРА");
        int productCode = 123;
        String numberString = String.valueOf(productCode);
        int prodCategory = productCode / productCode;
        int prodSubCategory = productCode / 60;
        int prodTypePackage = productCode % 10;

        int controlSum = prodCategory + prodSubCategory + prodTypePackage;
        int checkcode = prodCategory * prodSubCategory * prodTypePackage;

        System.out.println("Код товара: " + productCode);
        System.out.println("  категория товара - " + prodCategory);
        System.out.println("  подкатегория - " + prodSubCategory);
        System.out.println("  тип упаковки - " + prodTypePackage);
        System.out.println("Контрольная сумма = " + controlSum);
        System.out.println("Проверочный код = " + checkcode);

        // 6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ
        System.out.println("\n6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temporary = Byte.MAX_VALUE;
        textBlock = """
                       [Температура, °C]:
                          Исходное: %d
                          +1: %d
                          -1: %d
                        """.formatted(temporary, ++temp, --temp);
        System.out.println(textBlock);

        short pressure = Short.MAX_VALUE;
        textBlock = """
                       [Давление, Па]:
                          Исходное: %d
                          +1: %d
                          -1: %d
                        """.formatted(pressure, ++pressure, --pressure);
        System.out.println(textBlock);

        char codeSystem = (int) Character.MAX_VALUE;
        textBlock = """
                       [Код состояния системы,]:
                          Исходное: %d
                          +1: %d
                          -1: %d
                        """.formatted((int) codeSystem, (int) ++codeSystem, (int) --codeSystem);
        System.out.println(textBlock);

        int distance = Integer.MAX_VALUE; 
        textBlock = """
                       [Код состояния системы,]:
                          Исходное: %d
                          +1: %d
                          -1: %d
                        """.formatted(distance, ++distance, --distance);
        System.out.println(textBlock);

        long startTime = Long.MAX_VALUE;
        textBlock = """
                       [Код состояния системы,]:
                          Исходное: %d
                          +1: %d
                          -1: %d
                        """.formatted(startTime, ++startTime, --startTime);
        System.out.println(textBlock);

        // 7. ВЫВОД ПАРАМЕТРОВ JVM И ОС
        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        Runtime runtime = Runtime.getRuntime();
        int numProcessor = runtime.availableProcessors();
        long totalMemory = runtime.totalMemory() / 1024 / 1024;
        long freeMemory = runtime.freeMemory() / 1024 / 1024;
        long useMemory = totalMemory - freeMemory;
        long maxMemory = runtime.maxMemory() / 1024 / 1024;

        textBlock = """
                        Доступное число ядер: %d
                        Выделенная память (МБ): %d
                        Свободная память (Мб):  %d
                        Используемая память (Мб): %d
                        Максимально доступная для выделения память (Мб) %d
                        """.formatted(numProcessor, totalMemory, freeMemory, useMemory, maxMemory);
        System.out.println(textBlock);

        String systemDisk = System.getProperty("java.home");
        String versionOs = System.getProperty("os.name") + " version:" + System.getProperty("os.version");
        String versionJava = System.getProperty("java.version");
        String separator = System.getProperty("file.separator");

        textBlock = """
                        Системный диск: %s
                        Версия ОС: %s
                        Версия Java: %s
                        Символ разделения пути (сепаратор): %s
                        """.formatted(systemDisk, versionOs, versionJava, separator);
        System.out.println(textBlock);

        // 8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА
        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");

        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();

        System.out.println(start);
        System.out.println(finish);

        // 8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА
        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        long nanoTimeFinish = System.nanoTime();
        LocalTime localTimeFinish = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

        double timeDif = (nanoTimeFinish - NANO_START_TIME) / 1000000000.0000;
        BigDecimal rounded = new BigDecimal(timeDif).setScale(3, RoundingMode.UP);
        System.out.println("Старт проверки: " + LOCAL_TIME_START.format(formatter));
        System.out.println("Финиш проверки: " + localTimeFinish.format(formatter));
        System.out.println("Время работы:   " + rounded + "сек");
    }
}