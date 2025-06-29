import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        long nanoStartTime = System.nanoTime();
        LocalTime localTimeStart = LocalTime.now();

        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println("                     /\\");
        System.out.println("   J    a  v     v  /  \\");
        System.out.println("   J   a a  v   v  /_( )\\");
        System.out.println("J  J  aaaaa  V V  /      \\");
        System.out.println(" JJ  a     a  V  /___/\\___\\\n");
        
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
        float penBookCost = penCost + bookCost;

        float discountPrice = penBookCost - (penBookCost / 100 * discount);
        float discountSum = penBookCost - discountPrice;

        System.out.println("Стоимость ручки без скидки " + penCost);
        System.out.println("Стоимость книги без скидки " + bookCost);
        System.out.println("Стоимость ручки и книги со скидкой " + discountPrice);
        System.out.println("Размер скидки " + discountSum);

        System.out.println("\nРешение задачи с округлением результата");
        BigDecimal penCostBd = new BigDecimal("105.5");
        BigDecimal bookCostBd = new BigDecimal("235.23");
        BigDecimal discountBd = BigDecimal.valueOf(11);

        //стоимость чека без скид
        var noDiscountPriceBd = penCostBd.add(bookCostBd);
        var discountAmount = ((noDiscountPriceBd.divide(BigDecimal.valueOf(100))).multiply(discountBd)).setScale(2, RoundingMode.HALF_UP);;
        var discountPriceBd = (noDiscountPriceBd.subtract(discountAmount)).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Стоимость ручки без скидки " + penCostBd);
        System.out.println("Стоимость книги без скидки " + bookCostBd);
        System.out.println("Стоимость ручки и книги со скидкой " + discountPriceBd);
        System.out.println("Размер скидки " + discountAmount);

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        System.out.println("Исходные значения A1 = 2, B1 = 5");
        System.out.println("\nМетод: третьей переменной");
        int a1 = 2;
        int b1 = 5;
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("\nМетод: арифметических операций");
        a1 += b1;
        b1 = a1 - b1;
        a1 -= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("\nМетод: побитовой операции ^");
        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        
        System.out.println("\n4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");

        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;

        System.out.printf("%d%6d%6d%6d%6d%6d", code1, code2, code3, code4, code5, code6);
        System.out.printf("\n%c%6c%6c%6c%6c%6c", code1, code2, code3, code4, code5, code6);

        System.out.println("\n\n5. АНАЛИЗ КОДА ТОВАРА");
        int productCode = 123;
        int prodCategory = productCode / 100;
        int prodSubcategory = (productCode / 10) % 10;
        int prodPackageType = productCode % 10;

        int checksum = prodCategory + prodSubcategory + prodPackageType;
        int checkcode = prodCategory * prodSubcategory * prodPackageType;

        System.out.println("Код товара: " + productCode);
        System.out.println("  категория товара - " + prodCategory);
        System.out.println("  подкатегория - " + prodSubcategory);
        System.out.println("  тип упаковки - " + prodPackageType);
        System.out.println("Контрольная сумма = " + checksum);
        System.out.println("Проверочный код = " + checkcode);

        System.out.println("\n6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        byte temperature = Byte.MAX_VALUE;
        System.out.printf("""
                [Температура, °C]:
                Исходное: %d
                +1: %d
                -1: %d
                """.formatted(temperature, ++temp, --temp));

        short pressure = Short.MAX_VALUE;
        System.out.println("""
                \n[Давление, Па]:
                Исходное: %d
                +1: %d
                -1: %d
                """.formatted(pressure, ++pressure, --pressure));

        char codeSystem = Character.MAX_VALUE;
        System.out.println("""
                [Код состояния системы, код]:
                Исходное: %d
                +1: %d
                -1: %d
                """.formatted((int) codeSystem, (int) ++codeSystem, (int) --codeSystem));

        int distance = Integer.MAX_VALUE; 
        System.out.println("""
                [Пройденное расстояние, КМ]:
                Исходное: %d
                +1: %d
                -1: %d
                """.formatted(distance, ++distance, --distance));

        long startTime = Long.MAX_VALUE;
        System.out.println("""
                [Время с момента старта, сек]:
                Исходное: %d
                +1: %d
                -1: %d
                """.formatted(startTime, ++startTime, --startTime));

        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        Runtime rt = Runtime.getRuntime();
        int divider = 1024 * 1024;
        int cpuNum = rt.availableProcessors();
        long totalMemory = rt.totalMemory() / divider;
        long freeMemory = rt.freeMemory() / divider;
        long useMemory = totalMemory - freeMemory;
        long maxMemory = rt.maxMemory() / divider;

        System.out.println("""
                Доступное число ядер: %d
                Выделенная память (МБ): %d
                Свободная память (Мб):  %d
                Используемая память (Мб): %d
                Максимально доступная для выделения память (Мб) %d
                """.formatted(cpuNum, totalMemory, freeMemory, useMemory, maxMemory));

        String javaHome = System.getProperty("java.home");
        String systemDisc = javaHome.substring(0,1);
        String versionOs = System.getProperty("os.name") + " version:" + System.getProperty("os.version");
        String versionJava = System.getProperty("java.version");
        String separator = System.getProperty("file.separator");

        System.out.println("""
                Системный диск: %s
                Версия ОС: %s
                Версия Java: %s
                Символ разделения пути (сепаратор): %s
                """.formatted(systemDisc, versionOs, versionJava, separator));

        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        long nanoTimeFinish = System.nanoTime();
        LocalTime localTimeFinish = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

        double timeDif = (nanoTimeFinish - nanoStartTime) / 1e9;
        double rounded = Math.round(timeDif * 1000.0) / 1000.0;
        System.out.println("Старт проверки: " + localTimeStart.format(formatter));
        System.out.println("Финиш проверки: " + localTimeFinish.format(formatter));
        System.out.println("Время работы:   " + rounded + " сек");
    }
}