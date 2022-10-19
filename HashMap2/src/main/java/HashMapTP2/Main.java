package HashMapTP2;


public class Main {
    public static void main(String[] args) {
        EpicDoubleHashMap<Integer, Integer, String> pantoneMap = new EpicDoubleHashMap<>();

        pantoneMap.addCode(1, 456);

        pantoneMap.addColor(2, "Blue");

        pantoneMap.addCodeAndColor(3, 987, "Red");

        System.out.println("Codes");
        System.out.println(pantoneMap.getCodes());

        System.out.println("Colors");
        System.out.println(pantoneMap.getColors());

        System.out.println("Codes and colors");
        System.out.println(pantoneMap.getCodeAndColor());



        //EXTRA FUNCTIONALITIES
        // QUANTITY OF CODES AND COLORS

        System.out.println("Number of Codes : " + pantoneMap.countCodes());
        System.out.println("Number of Colors : " + pantoneMap.countColors());
    }
}
