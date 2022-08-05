package amontov.controllers;

import amontov.models.Product;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll() {
        return null;
    }

    @GetMapping("/all/filter")
    public ResponseEntity<List<Product>> getFilter(@PathVariable int id,
                                                   @PathVariable String name,
                                                   @PathVariable String category) {
        return null;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> getOne (@PathVariable int id) {
        return null;
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody @Valid Product product) {
        return null;
    }

    @DeleteMapping ("/delete/{id}")
    public String deleteProduct(@PathVariable int id,
                                @PathVariable int quantity) {
        return null;
    }


}
