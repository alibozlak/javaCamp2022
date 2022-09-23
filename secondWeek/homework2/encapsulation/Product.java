public class Product {
    private int _id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    // private String code;    // <-- Read only olmalı

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        // this : İçinde bulunduğum class
        // this.id = id;
        _id = id;
    }

    // Kısayoldan oluşturma : Sağ tık -> Source Action -> Generate  Getters and Setters
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
        return this.name.substring(0, 1) + this._id;
    }
    
}
