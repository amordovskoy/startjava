import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static final long NANO_START_TIME = System.nanoTime();
    public static final LocalTime LOCAL_TIME_START = LocalTime.now();

    public static void main(String[] args) {
        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println("                     /\\");
        System.out.println("   J    a  v     v  /  \\");
        System.out.println("   J   a a  v   v  /_( )\\");
        System.out.println("J  J  aaaaa  V V  /      \\");
        System.out.println(" JJ  a     a  V  /___/\\___\\" + "\n");
        
        System.out.printf("""
                 /\\            
           J    /  \\  v     v  a
           J   /_( )\\  v   v  a a
        J  J  /      \\  V V  aaaaa
         JJ  /___/\\___\\  V  a     a
        """);

        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        System.out.println("Решение задачи без округления результата");

        float penCost = 105.5f;
        float bookCost = 235.23f;
        int discount = 11;

        float discountPrice = (penCost + bookCost) - ((penCost + bookCost) / 100 * discount);
        float discountSize = (penCost + bookCost) - discountPrice;

        System.out.println("Стоимость ручки без скидки " + penCost);
        System.out.println("Стоимость книги без скидки " + bookCost);
        System.out.println("Стоимость ручки и книги со скидкой " + discountPrice);
        System.out.println("Размер скидки " + discountSize);

        System.out.println("\nРешение задачи с округлением результата");
        BigDecimal penCostBd = new BigDecimal("105.5");
        BigDecimal bookCostBd = new BigDecimal("235.23");
        BigDecimal discountBd = BigDecimal.valueOf(11L);
        var sumWithoutDiscountBd = penCostBd.add(bookCostBd);
        var sumDiscount = sumWithoutDiscountBd.divide(new BigDecimal(100));
        sumDiscount = sumDiscount.multiply(discountBd);
        var sumWithDiscountBd = sumWithoutDiscountBd.subtract(sumDiscount).setScale(2, RoundingMode.HALF_UP);
        var discountSizeBd = (penCostBd.add(bookCostBd)).subtract(sumWithDiscountBd);

        System.out.println("Стоимость ручки без скидки " + penCostBd);
        System.out.println("Стоимость книги без скидки " + bookCostBd);
        System.out.println("Стоимость ручки и книги со скидкой " + sumWithDiscountBd);
        System.out.println("Размер скидки " + discountSizeBd);

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        // Метод: третьей переменной
        System.out.println("\nИсходные значения A1 = 2, B1 = 5");
        int a1 = 2;
        int b1 = 5;
        int temp;
        
        temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("\nМетод: третьей переменной");
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        a1 += b1;
        b1 = a1 - b1;
        a1 -= b1;

        System.out.println("\nМетод: арифметических операций");
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("Метод: побитовой операции ^");
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        
        // 4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ
        System.out.println("\n4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");

        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;

        System.out.printf("%4d%6d%6d%6d%6d%6d", code1, code2, code3, code4, code5, code6);
        System.out.printf("\n");
        System.out.printf("%c%c%c%c%c%c", code1, code2, code3, code4, code5, code6);

        // 5. АНАЛИЗ КОДА ТОВАРА
        System.out.println("\n\n5. АНАЛИЗ КОДА ТОВАРА");
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
        System.out.printf("""
        [Температура, °C]:
          Исходное: %d
          +1: %d
          -1: %d
        """.formatted(temporary, ++temp, --temp));

        short pressure = Short.MAX_VALUE;
        System.out.println("""
        [Давление, Па]:
          Исходное: %d
          +1: %d
          -1: %d
        """.formatted(pressure, ++pressure, --pressure));

        char codeSystem = (int) Character.MAX_VALUE;
        System.out.println("""
        [Код состояния системы,]:
          Исходное: %d
          +1: %d
          -1: %d
        """.formatted((int) codeSystem, (int) ++codeSystem, (int) --codeSystem));

        int distance = Integer.MAX_VALUE; 
        System.out.println("""
        [Код состояния системы,]:
          Исходное: %d
          +1: %d
          -1: %d
        """.formatted(distance, ++distance, --distance));

        long startTime = Long.MAX_VALUE;
        System.out.println("""
        [Код состояния системы,]:
          Исходное: %d
          +1: %d
          -1: %d
        """.formatted(startTime, ++startTime, --startTime));

        // 7. ВЫВОД ПАРАМЕТРОВ JVM И ОС
        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        Runtime runtime = Runtime.getRuntime();
        int numProcessor = runtime.availableProcessors();
        long totalMemory = runtime.totalMemory() / 1024 / 1024;
        long freeMemory = runtime.freeMemory() / 1024 / 1024;
        long useMemory = totalMemory - freeMemory;
        long maxMemory = runtime.maxMemory() / 1024 / 1024;

        System.out.println("""
        Доступное число ядер: %d
        Выделенная память (МБ): %d
        Свободная память (Мб):  %d
        Используемая память (Мб): %d
        Максимально доступная для выделения память (Мб) %d
        """.formatted(numProcessor, totalMemory, freeMemory, useMemory, maxMemory));

        String systemDisk = System.getProperty("java.home");
        String versionOs = System.getProperty("os.name") + " version:" + System.getProperty("os.version");
        String versionJava = System.getProperty("java.version");
        String separator = System.getProperty("file.separator");

        System.out.println("""
        Системный диск: %s
        Версия ОС: %s
        Версия Java: %s
        Символ разделения пути (сепаратор): %s
        """.formatted(systemDisk, versionOs, versionJava, separator));

        // 8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА
        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");

        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();

        System.out.println(start);
        System.out.println(finish);

        // 8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА
        long nanoStartTime = System.nanoTime();
        LocalTime localTimeStart = LocalTime.now();

        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        long nanoTimeFinish = System.nanoTime();
        LocalTime localTimeFinish = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

        double timeDif = (nanoTimeFinish - nanoStartTime) / 1000000000.0000;
        BigDecimal rounded = new BigDecimal(timeDif).setScale(3, RoundingMode.UP);
        System.out.println("Старт проверки: " + localTimeStart.format(formatter));
        System.out.println("Финиш проверки: " + localTimeFinish.format(formatter));
        System.out.println("Время работы:   " + rounded + "сек");
    }
}