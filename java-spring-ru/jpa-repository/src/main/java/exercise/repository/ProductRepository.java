package exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import exercise.model.Product;

import org.springframework.data.domain.Sort;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // BEGIN
    Optional<Product> findByPrice(int price);
    List<Product> findAllByPrice(int price);

    List<Product> findByPriceBetween(int startPrice, int endPrice, Sort sort);
    List<Product> findByPriceLessThan(int price);
    List<Product> findByPriceGreaterThan(int price, Sort sort);
    // END
}
