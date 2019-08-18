package lk.productd.productdemo.restful.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {
}
