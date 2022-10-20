package HashMapTP2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EpicDoubleHashMap<Integer, Integer, String> pantoneMap = new EpicDoubleHashMap<>();

        pantoneMap.addCode(1, 456);
        pantoneMap.addCode(1, 289);
        pantoneMap.addCode(4, 189);
        pantoneMap.addCode(6, 189);

        pantoneMap.addColor(2, "Blue");
        pantoneMap.addColor(5, "Yellow");
        pantoneMap.addCodeAndColor(3, 987, "Red");

        System.out.println("Codes");
        System.out.println(pantoneMap.getCodes());

        System.out.println("Colors");
        System.out.println(pantoneMap.getColors());

        System.out.println("Codes and colors");
        System.out.println(pantoneMap.getCodeAndColor());



        //EXTRA FUNCTIONALITIES
        // Quantity of Values (Codes and Colors)

        System.out.println(pantoneMap.quantityOfValues());
        System.out.println("\n");

        // Boolean (true for repeated values)
        System.out.println("Boolean for repeated values: "+pantoneMap.equals());








    }
}
