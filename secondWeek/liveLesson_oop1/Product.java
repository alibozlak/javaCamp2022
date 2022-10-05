
// class isimleri PascalCase yazılır. <--- Önemli!

// public erişim belirtecidir (access modifiers), bu classa nerelerden erişilebileceğini belirler.
// public : heryerden erişilebilir demektir. Ayrıca private, protected gibi erişim belirteçleri de vardır.

// class, oluşacak nesneler için şablon görevi görür.
public class Product {

    // fields : camelCase yazılır. <-- Önemli!
    private String name;
    private double unitPrice;
    private double discount;
    private String imageUrl;
    private int unitsInStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

}
