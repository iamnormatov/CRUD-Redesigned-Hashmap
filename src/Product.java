public class Product {
    private Integer productId; 
    private Double price;
    private String korhona;  
    private String saqlashMuddati;
 
    public Product(String productName, Double price, String korhona, String saqlashMuddati) {
        this.productName = productName;
        this.price = price;
        this.korhona = korhona;
        this.saqlashMuddati = saqlashMuddati;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getKorhona() {
        return korhona;
    }

    public void setKorhona(String korhona) {
        this.korhona = korhona;
    }

    public String getSaqlashMuddati() {
        return saqlashMuddati;
    }

    public void setSaqlashMuddati(String saqlashMuddati) {
        this.saqlashMuddati = saqlashMuddati;
    }

    public String toProduct() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", korhona='" + korhona + '\'' +
                ", saqlashMuddati='" + saqlashMuddati + '\'' +
                '}';
    }
}
