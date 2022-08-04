package part6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("sameer");
        arrayList.add("saeed");
        arrayList.add("ahmed");
        arrayList.add("mutavalli");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println(Collections.binarySearch(arrayList,"sameer"));;


    
        String element = "sameer";

        for (int i =0; i<arrayList.size(); i++){
            if (element == arrayList.get(i)){

                System.out.println("element is found with the name of:" + arrayList.get(i));

                break;
            }
        }

    }
}
