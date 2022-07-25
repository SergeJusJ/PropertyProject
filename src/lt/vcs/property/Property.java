package lt.vcs.property;

public class Property {
    private String city;
    double area, price;
    private String type;


    public Property(String city, double area, double price) {
        this.city = city;
        this.area = area;
        this.price = price;
    }

   public Property() {

    }

    public String getCity() {
        return city;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "The property is in " +  city + ", it costs "+ price + " Eur, the area is " + area + " square meters";
    }


    public PropertyType getType() { return PropertyType.FLAT;};

}
