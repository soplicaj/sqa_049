package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsTutor {
    public static void main(String[] args) {
//        ArrayList<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(100);
//        myList.add(-123);
//        myList.add(70);
//        myList.add(70);
//        myList.add(70);
//
//        List<Integer> myList2 = Arrays.asList(10, 20, 30, 100, -10, -20);
//        System.out.println(myList2);
//        System.out.println(myList);
//
//        myList.set(1, 20); //modifies the value from a certain index in my list to a new values
//        //index - the first parameter; new value - second parameter
//        System.out.println(myList);
//
//        myList.remove(0); //removes the value from the index of 0
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(70)); //removing an element specified as an argument
//        System.out.println(myList);
//
//        System.out.println(myList.indexOf(70));
//        System.out.println(myList.indexOf(100));
//        //returns the index for the searched element, as long as the element is IN THE COLLECTION
//        //if the element is missing from the collection - it will return -1
//
//        for (int i = 0; i < myList2.size(); i++) {
//            System.out.print(myList2.get(i) + " ");
//        }
//        System.out.println();

//        Initialize a list with the following values - 100, 10, 25, 25, 30, 35, 25.
        List<Integer> myList3 = new ArrayList<>();
        myList3.add(100);
        myList3.add(10);
        myList3.add(25);
        myList3.add(25);
        myList3.add(30);
        myList3.add(35);
        myList3.add(25);
        System.out.println(myList3);
//        Remove from this list all the occurrences of the values 25.
        while (myList3.contains(25)) { myList3.remove((Integer) 25); }
        System.out.println(myList3);
    }
}
