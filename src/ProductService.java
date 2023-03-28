import java.util.HashMap;
import java.util.Map; 
 
public class ProductService {
    private Map<Integer, Product> productMap;
    private Integer prductId;
    public ProductService(){
        this.productMap = new HashMap<>();
        this.prductId = 0;
    }

    public String createProduct(Integer productId, Product product){
        if (this.productMap.containsKey(productId)){
            return "Error ProductId";
        }
        product.setProductId(++this.prductId);
        this.productMap.put(productId, product);
        return "Product successful created";
    }

    public String getProduct(Integer productId){
        if (this.productMap.containsKey(productId)){
            return this.productMap.get(productId).toProduct();
        }
        return "Product is not found";
    }

    public String updateProduct(Integer productId, Product product){
        Integer productOn;
        if (this.productMap.containsKey(productId)){
            productOn = this.productMap.get(productId).getProductId();
            product.setProductId(productOn);
            this.productMap.replace(productId, this.productMap.get(productId), product);
            return "Product successful updated";
        }
        return "Product is not found";
    }

    public String deleteProduct(Integer productId){
        if (this.productMap.containsKey(productId)){
            if (this.productMap.remove(productId, this.productMap.get(productId))){
                return "Product successful deleted";
            }
        }
        return "Product is not found";
    }
}
