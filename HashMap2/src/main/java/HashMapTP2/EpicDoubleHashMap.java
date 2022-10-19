package HashMapTP2;

import java.util.HashMap;
import java.util.Map;

public class EpicDoubleHashMap<K extends Number, Codes, Colors> {
    HashMap<K, Codes> map1;
    HashMap<K, Colors> map2;
//hola
    public EpicDoubleHashMap() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
    }

    public void addCode(K key, Codes code) {
        map1.put(key, code);
    }

    public void addColor(K key, Colors color) {
        map2.put(key, color);
    }

    public void addCodeAndColor(K key, Codes code, Colors color) {
        map1.put(key, code);
        map2.put(key, color);
    }

    public String getCodes() {
        String code = "";
        for (Map.Entry<K, Codes> entry : map1.entrySet()) {
            code += entry.getKey() + " = " + entry.getValue() + "\n";
        }
        return code;
    }

    public String getColors() {
        String color = "";
        for (Map.Entry<K, Colors> entry : map2.entrySet()) {
            color += entry.getKey() + " = " + entry.getValue() + "\n";
        }
        return color;
    }

    public String getCodeAndColor() {

        String code = "";
        String color = "";
        String codeandcolor = "";
        codeandcolor = code + " " + color;


        for (Map.Entry<K, Codes> entry : map1.entrySet()) {
            code += entry.getKey() + " = " + entry.getValue() + "\n";

        }

        for (Map.Entry<K, Colors> entry : map2.entrySet()) {
            color += entry.getKey() + " = " + entry.getValue() + "\n";
        }

        return code + color;
    }

    //EXTRA FUNCTIONALITIES
    // QUANTITY OF CODES AND COLORS



   public String quantityOfValues(){
       int numberOfCodes=0;
       for (K i : map1.keySet())  {
           map1.get(i);
           numberOfCodes += + 1;
          // System.out.println(map1.get(i));
       }
       int numberOfColors = 0;
       for (K i : map2.keySet()) {
           map2.get(i);
           numberOfColors += +1;
          // System.out.println(map2.get(i));
       }

       String quantityOfValues;
       String moreCodes = "There are more Codes than Colors";
       String moreColors = "There are more Colors than Codes";
       String sameQuantityValues = "There are the same quantity of Codes and Colors";
       quantityOfValues=(numberOfCodes>numberOfColors)?moreCodes:(numberOfCodes<numberOfColors)?moreColors:sameQuantityValues;


       return "Number of Codes: "+String.valueOf(numberOfCodes)+"\n"+"Number of Colors: "+ String.valueOf(numberOfColors)+"\n"+quantityOfValues;

    }







}