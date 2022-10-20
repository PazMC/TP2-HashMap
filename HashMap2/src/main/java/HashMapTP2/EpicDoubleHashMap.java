package HashMapTP2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.lang.String;

public class EpicDoubleHashMap<K extends Number, Codes, Colors> {
    HashMap<K, Codes> map1;
    HashMap<K, Colors> map2;

    public EpicDoubleHashMap() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
    }

    public void addCode(K key, Codes code) {
        try {

            if(map1.containsKey(key)){
                throw new RuntimeException("Try with another key");
            }else{
                map1.put(key,code);
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

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
            code = code.concat(entry.getKey().toString()).concat("=").concat(entry.getValue().toString());
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

        for (Map.Entry<K, Codes> entry : map1.entrySet()) {
            code += entry.getKey() + " = " + entry.getValue() + "\n";

        }

        for (Map.Entry<K, Colors> entry : map2.entrySet()) {
            color += entry.getKey() + " = " + entry.getValue() + "\n";
        }

        return code + color;
    }

    // EXCEPTIONS
public void tryAddCode(K keys, Codes value){



}





    //EXTRA FUNCTIONALITIES
    // QUANTITY OF CODES AND COLORS



   public String quantityOfValues(){
       int numberOfCodes=0;
       for (K i : map1.keySet())  {
           map1.get(i);
           numberOfCodes++;
          // System.out.println(map1.get(i));
       }
       int numberOfColors = 0;
       for (K i : map2.keySet()) {
           map2.get(i);
           numberOfColors++;
          // System.out.println(map2.get(i));
       }

       String quantityOfValues;
       String moreCodes = "There are more Codes than Colors";
       String moreColors = "There are more Colors than Codes";
       String sameQuantityValues = "There are the same quantity of Codes and Colors";
       quantityOfValues=(numberOfCodes>numberOfColors)?moreCodes:(numberOfCodes<numberOfColors)?moreColors:sameQuantityValues;


       return "Number of Codes: "+String.valueOf(numberOfCodes)+"\n"+"Number of Colors: "+ String.valueOf(numberOfColors)+"\n"+quantityOfValues;

    }

    public boolean equals() {
        //I think this next code it is wrong, because it compares keys not values:
        //return this.map1.keySet().equals(map2.keySet());
        return new HashSet<>(map1.values()).equals(new HashSet<>(map2.values()));
    }







}