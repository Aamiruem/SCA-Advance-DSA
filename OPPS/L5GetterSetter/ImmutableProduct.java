package out.OPPS.L5GetterSetter;

public class ImmutableProduct {

    private int id;
    private String name;
    private double price;


    public ImmutableProduct(int i, String s, double p) {
        id = i;
        name = s;
        price = p;

    }



    // public void setProduct(int i, String s, double p) {
    //     id = i;
    //     name = s;
    //     price = p;

    //     if (i < 0){
    //     System.out.println("id can not be negative");
    //     return;

    //     } else if (price <= 0) {
    //         System.out.println("price can not be negative");
    //         return;

    //     } else {
    //         System.out.println("Product id: " + id + "\nProduct name: " + name + "\nProduct price: " + price);
    //         return;
    //     }
    // }

    // public void setId(int i) { //this is not change 
        
    //     id = i;
    // }

    public void setName(String s) { //name can only to be change
        
        name = s;
    }

    // public void setPrice(double p) { This is not change
        
    //     price = p;
    // }

    public int getId(){ //getter means return value
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
