public class Product {

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public Product(){
        // System.out.println("Yapıcı blok çalıştı.");
    }

    public Product(int id, String name, String description, double price, int stockAmount) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setStockAmount(stockAmount);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getCode() { 
        return this.name.substring(0, 1) + this.id;
    }
    
}
