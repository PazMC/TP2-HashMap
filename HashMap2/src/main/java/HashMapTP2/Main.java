package HashMapTP2;

public class Main {
    public static void main(String[] args) {
        EpicDoubleHashMap<Integer, Integer, String> pantoneMap = new EpicDoubleHashMap<>();

        pantoneMap.addCode(1, 456);
        pantoneMap.addCode(4, 289);
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
        // QUANTITY OF VALUES (CODES AND COLORS)

        System.out.println(pantoneMap.quantityOfValues());








    }
}
