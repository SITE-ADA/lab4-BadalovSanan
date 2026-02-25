package main.java.az.edu.ada.wm2.lab4.repository;
import java.util.HashMap;
import java.util.Map;

import az.edu.ada.wm2.lab4.model.Product;


public class ProductRepositoryImpl implements ProductRepository {
    HashMap<UUID, Product> productMap = new HashMap<>();
    public Product save(Product product) {
        productMap.put(product.getId(), product);
        return product;
    }
    public Optional<Product> findById(UUID id) {
        return Optional.ofNullable(productMap.get(id));
    }
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }
    public void deleteById(UUID id) {
        productMap.remove(id);
    }
    public boolean existsById(UUID id) {
        return productMap.containsKey(id);
    }
}