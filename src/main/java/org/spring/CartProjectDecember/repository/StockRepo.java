package org.spring.CartProjectDecember.repository;

import org.spring.CartProjectDecember.enitity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends JpaRepository<StockEntity,Integer> {

}
