package homework;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.List;

public class HelloOtus {

    public static void main(String[] args) {
        Multimap<String, List<String>> citiesInState = ArrayListMultimap.create();
        citiesInState.put("Florida",List.of("Orlando","Tampa","Miami"));
        citiesInState.put("California",List.of("Hollywood","Lancaster","LA"));
        citiesInState.put("Texas",List.of("Houston","Dallas","Galveston"));

        for (String state : citiesInState.keys()) {
            System.out.println(state + " " + citiesInState.get(state));
        }


    }


}
