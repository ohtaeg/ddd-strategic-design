package camp.nextstep.edu.kitchenpos.product.dao;

import camp.nextstep.edu.kitchenpos.product.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {
    Product save(Product entity);

    Optional<Product> findById(Long id);

    List<Product> findAll();
}
