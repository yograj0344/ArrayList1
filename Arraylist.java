import java.util.*;
class Arraylist   // Array list belong to java.util package
                   // Array list is implements interface
                   // Array list is dynamically resizeble and provides flexibility and functionlity
                   // Array list class has predefined methodes to manupulate the list easily,
                   // Array use in methode add, remove,set, get,
{
    public static  void main(String[] aefs)
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("mang");  // add methode use in add element
        list.add("banana");
        list.add("orange");
        list.add("watermalen");
        list.add("hii");
        list.add("hii");
        list.add("jii");
        list.add("gg");
        System.out.println(list.size());
        



        System.out.println(list);
        System.out.println(list.get(0));  // get methode use get element
        list.set(2,"grape");   // set methode use set element
        System.out.println(list);
        list.add(2,"orang");
        System.out.println(list);
        list.remove(2);     // remove methode use in remove element
        System.out.println(list);
        


    }
}   