package ma.formation.jpa.service;

import java.util.List;
import ma.formation.jpa.service.model.Product;
public interface IService {

    void saveProduct(Product p);
    List<Product> getAllProducts();
    List<Product> getProductsByDesignation(String designation);
    void removeProduct(Long id);
    Product getProdctById(Long id);
}