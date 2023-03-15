package Factory;

public class Customer {
    public static void main(String[] args) {
        int myBill=0;
        int tvPrice=GadgetFactory.getGadgetPrice("TV");
        int aCPrice=GadgetFactory.getGadgetPrice("AC");
        System.out.println("TV: "+ tvPrice);
        System.out.println("Fridge: "+aCPrice);

        myBill = GadgetFactory.getPriceByProperty("summer");
        myBill+= GadgetFactory.getPriceByProperty("animation");

        System.out.println("Total Bill: "+myBill);
    }
}
