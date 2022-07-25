package amontov.repository;

import amontov.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findAll();
    @Query("select p from Product p where p.id = :id")
    Optional<Product> findById(@Param ("id") Long id);
    @Query("select p from Product p where p.name = :name")
    Optional <Product> findByName(@Param("name") String name);
    @Query("select p from Product p ORDER BY id")

    List<Product> findByOrderById ();



}
