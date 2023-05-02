package numberrangesummarizer;

import java.util.Collection;
import java.util.List;

public class GroupLists {
    private static Object delimiter1;
    private static Object delimiter2;
    /**
     *this is the list that will be converted to a delimiter
     */
    int commaSeparartedList = Integer.parseInt(1,3,"6,7,8","12,13,14,15","21,22,23,24",31);
    private CharSequence commaSeparatedList;  
    Integer convertList = Integer.join("-", commaSeparatedList, 2, 3, 4);

public static void main(Integer[] args) {
    int startnumber = 1;
    int middlenumber = 3;
    int endnumber = 31;
}
private static boolean delimiterRange(int startnumber, int middlenumber, int endnumber) {
    return false;
}

/**
 * @param args
 */
public static void delimiter1(Integer[] args) {
    int startnumber = 6;
    int middlenumber = 7;
    int endnumber = 8;

    if(delimiterRange(startnumber, endnumber, endnumber)) {
        System.out.println(startnumber + "-" + endnumber);
    }
    else {
        System.out.println("The program did not run");
    }
}  
public static void delimiter2(Integer[] args) {
    int startnumber = 12;
    int middlenumber1 = 13;
    int middlenumber2 = 14;
    int endnumber = 15;

    if(delimiterRange(startnumber, endnumber, endnumber)) {
        System.out.println(startnumber + "-" + endnumber);
    }
    else {
        System.out.println("The program did not run");
    }
}  
public static void delimiter3(Integer[] args) {
    int startnumber = 21;
    int middlenumber1 = 22;
    int middlenumber2 = 23;
    int endnumber = 24;

    if(delimiterRange(startnumber, middlenumber1, endnumber)) {
        System.out.println(startnumber + "-" + endnumber);
        }
    else {
        System.out.println("The program did not run");
    }
}
}