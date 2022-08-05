package part6;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class ArrayandLinkedlist {
   public static int timeArrayList;
    public static int timeLinkedsList;
    public static void main(String[] args) {



        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("sameer");
        arrayList.add("saeed");
        arrayList.add("ahmed");
        arrayList.add("mutavalli");

        for (int i = 0; i <= arrayList.size(); i++){
            timeArrayList = (int) Date.from(Instant.now()).getTime();
        }
        System.out.println("Array List Time\t" + timeArrayList);

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("sameer");
        linkedList.add("saeed");
        linkedList.add("ahmed");
        linkedList.add("mutavalli");

        for (int n = 0; n <= linkedList.size(); n++){
            timeLinkedsList = (int) Date.from(Instant.now()).getTime();
        }
        System.out.println("Linked list time\t" + timeLinkedsList);
        System.out.println(timeArrayList<timeLinkedsList);


    }
}
