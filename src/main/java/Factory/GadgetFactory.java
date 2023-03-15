package Factory;

public class GadgetFactory {

    public static int getGadgetPrice(String gadgetType){
        Gadget gadget;
        if(gadgetType.equals("TV")){
            gadget=new TV();
        }

        else if(gadgetType.equals("AC")){
            gadget=new AC();
        }

        else {
            gadget=new Fridge();
        }
        return gadget.getPrice();
    }

    public static int getPriceByProperty(String property){
        if(property.equals("cooling"))
            return new Fridge().getPrice();
        else if(property.equals("animation"))
            return new TV().getPrice();
        else if(property.equals("summer"))
            return new AC().getPrice();
        else return -1;
    }
}
