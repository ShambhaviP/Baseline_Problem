import java.io.*;
import java.util.ArrayList;


/**
 * Created by shambhap on 24/08/15.
 */

class Item{

    int qty;
    String name;
    double price;

    Item(int q,String n,double p)
    {
        qty=q;
        name=n;
        price=p;

    }


}



public class salestaxdriver {

    public static  void main(String args[]) throws IOException
    {

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give Input");
        String input = br.readLine();*/
       Item obj1=new Item(1,"Book",12.49);
        Item obj2=new Item(1,"Music CD",14.99);
        Item obj3=new Item(1,"chocolate bar",0.85);
        ArrayList<String> items=new ArrayList<String>();


        salestaxcalculator();
    }

    private static void salestaxcalculator() {


    }


}
