import java.io.*;
import java.util.ArrayList;
import  java.util.Iterator;


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
        ArrayList<Item> items=new ArrayList<Item>();
        items.add(obj1);
        items.add(obj2);
        items.add(obj3);
        System.out.println("Input 1");
        generateList(items);
        System.out.println("\nReceipt");
                generateList(items);
        total(items);
        
    }

    private static double salestaxcalculator(ArrayList<Item> items) {

        double basictax=0.0;
        double import_duty=0.0;

        for(Item item3:items) {

            int quantity=item3.qty;
            String itemname=item3.name;
            double price1=item3.price;

            if(itemname.equalsIgnoreCase("Book") || itemname.equalsIgnoreCase("box(es) of headache pills") || itemname.equalsIgnoreCase("chocolate bar")){

                basictax+=0.0;
            }
            else basictax= 0.1*price1;

            if(itemname.equalsIgnoreCase("imported")){
                import_duty+=0.05*price1;
            }

        }

     double totalsalestax=basictax+import_duty;

    return totalsalestax;




    }

    private static void total(ArrayList<Item> items) {
   double sum=0;



        for(Item item1:items){
      double cost=item1.price;
      sum+=cost;
        }
        double totalamount=sum+salestaxcalculator(items);
        System.out.println("Sales tax:"+salestaxcalculator(items));
         System.out.println("Total:"+totalamount);

    }

    private static void generateList(ArrayList<Item> items) {


  for(Item item2:items) {

      int quantity=item2.qty;
      String itemname=item2.name;
      double price1=item2.price;

      System.out.println(quantity+" "+itemname+" "+"at"+" "+price1);


  }

    }


}
