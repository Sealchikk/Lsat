package amontov.controllers;

import amontov.models.Product;
import amontov.service.ProductService;
import amontov.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.Test;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {
    private MockMvc mvc;
    private ProductService service;
    @Autowired
    public void setService (ProductService service) {
        this.service = service;
    }

    @Autowired
    public void setMvc(MockMvc mvc) {
        this.mvc = mvc;
    }
    @Test
    public void addProduct () {
        service.addProduct(creat());
    }
    @Test
    public List<Product> all (){
       return service.getAll();
    }
    @Test
    public Product getOne () {
       return service.getOne(0);
    }
    public Product creat() {
        Product product = new Product();
        product.setName("Moloko");
        product.setCategory("Moloko");
        product.setPrice(12);
        product.setQuantity(12);
        product.setManufacture("dsada");
        product.setWeight("dasd");
        return product;
    }
}
