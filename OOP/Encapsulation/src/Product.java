public class Product {
    // attrs || field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String code;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;   /* Use _id for the structure instead, 'this' makes it hard to type*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getCode() {
        return this.name.substring(0,1) + id;
    }

}
