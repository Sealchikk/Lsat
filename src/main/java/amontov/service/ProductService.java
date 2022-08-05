package amontov.service;

import amontov.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll ();
    List<Product> getFilter ();
    Product getOne (long id);
    void addProduct (Product product);
    void deleteProduct (long id, int quantity);


}
