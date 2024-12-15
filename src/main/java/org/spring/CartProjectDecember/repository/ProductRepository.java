package org.spring.CartProjectDecember.repository;

import org.spring.CartProjectDecember.enitity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {

//@Query("")
//    List<ProductEntity> findAllbysearch(String key);


}
