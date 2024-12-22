package out.OPPS.L5GetterSetter;

public class Product {

    private int id;
    private String name;
    private double price;

    // public void setProduct(int i, String s, double p) {
    // id = i;
    // name = s;
    // price = p;

    // if (i < 0){
    // System.out.println("id can not be negative");
    // return;

    // } else if (price <= 0) {
    // System.out.println("price can not be negative");
    // return;

    // } else {
    // System.out.println("Product id: " + id + "\nProduct name: " + name +
    // "\nProduct price: " + price);
    // return;
    // }
    // }

    public void setId(int i) {
        if (i < 0) {
            System.out.println("id can not be negative");
            return;
        }
        id = i;
    }

    public void setName(String s) {
        if (s == null) {
            System.out.println("name can not be null");
            return;
        }
        name = s;
    }

    public void setPrice(double p) {
        if (p <= 0) {
            System.out.println("price must be positive");
            return;
        }
        price = p;
    }

    public int getId() { // getter means return value
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
