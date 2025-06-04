import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
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

        //РАСЧЕТ СТОИМОСТИ ТОВАРА (первый вариант)
        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА (первый вариант)");

        //Cтоимость ручки
        float pencilCost = (float) 105.5;

        //Cтоимость книги
        float bookCost = (float) 235.23;

        //Скидка при покупке вместе
        int discount = 11;

        float sumWithDiscount = (pencilCost + bookCost) - ((pencilCost + bookCost) / 100 * discount);


        System.out.println("Cтоимость ручки без скидки " + pencilCost);
        System.out.println("Cтоимость книги без скидки " + bookCost);
        System.out.println("Cтоимость комбочека со скидкой " + sumWithDiscount);


        //РАСЧЕТ СТОИМОСТИ ТОВАРА (второй вариант)
        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА (второй вариант)");

        //Cтоимость ручки
        var bdpencilCost = new BigDecimal("105.5");

        //Cтоимость книги
        var bdbookCost = new BigDecimal("235.23");

        //Процент скидки при покупке вместе
        var bddiscount = new BigDecimal("11");

        // Сумма при покупке вместе
        var bdsumWithoutDiscount = bdpencilCost.add(bdbookCost);

        //Сумма скидки
        var sumDiscount = bdsumWithoutDiscount.divide(new BigDecimal(100));
        sumDiscount = sumDiscount.multiply(bddiscount);

        // Сумма чека со скидкой
        var bdsumWithDiscount = bdsumWithoutDiscount.subtract(sumDiscount).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Cтоимость ручки без скидки " + bdpencilCost);
        System.out.println("Cтоимость книги без скидки " + bdbookCost);
        System.out.println("Cтоимость комбочека со скидкой " + bdsumWithDiscount);

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
    }
}