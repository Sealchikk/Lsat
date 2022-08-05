package amontov.service.impl;

import amontov.models.Product;
import amontov.repository.ProductRepository;
import amontov.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Product> getFilter() {
        return repository.findByOrderById();
    }

    @Override
    public Product getOne(long id) {
        try {
            return repository.findById(id).get();
        } catch (NullPointerException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void addProduct(Product newProduct) {
        if (repository.findByName(newProduct.getName()).isPresent()) {
            Product product = repository.findByName(newProduct.getName()).get();
            newProduct.setQuantity(newProduct.getQuantity() + product.getQuantity());
            repository.delete(product);
            repository.save(newProduct);
        } else {
            repository.save(newProduct);
        }
    }

    @Override
    public void deleteProduct(long id, int quantity) {
        if (repository.findById(id).isPresent()) {
            Product product = repository.findById(id).get();
            if (product.getQuantity() > quantity) {
                product.setQuantity(product.getQuantity() - quantity);
                repository.deleteById(id);
                repository.save(product);
            }
            if (product.getQuantity() == quantity) {
                repository.deleteById(id);
            }
            if (product.getQuantity() < quantity) {

            }

        }
    }
}