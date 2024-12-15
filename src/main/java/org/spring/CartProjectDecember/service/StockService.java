package org.spring.CartProjectDecember.service;



import org.spring.CartProjectDecember.enitity.FutureStockEntity;
import org.spring.CartProjectDecember.enitity.OptionalStockEntiy;
import org.spring.CartProjectDecember.enitity.RestictStockEnity;
import org.spring.CartProjectDecember.enitity.StockEntity;
import org.spring.CartProjectDecember.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class StockService {

    private final StockRepo stockRepository;


    public StockService(StockRepo stockRepository) {
        this.stockRepository = stockRepository;
    }

//    public void createStocks() {
//
//        RestictStockEnity restrictStock = new RestictStockEnity();
//        restrictStock.setName("Restricted Stock");
//        restrictStock.setPrice(150.0);
//        restrictStock.setRestrictionReason("Regulatory Restrictions");
//        stockRepository.save(restrictStock);
//
//
//        OptionalStockEntiy optionalStock = new OptionalStockEntiy();
//        optionalStock.setName("Optional Stock");
//        optionalStock.setPrice(200.0);
//        optionalStock.setOptional(true);
//        stockRepository.save(optionalStock);
//
//        // Create FutureStock
//        FutureStockEntity futureStock = new FutureStockEntity();
//        futureStock.setName("Future Stock");
//        futureStock.setPrice(300.0);
//        java.util.Date utilDate = new java.util.Date();
//        futureStock.setMaturityDate(new Date(utilDate.getTime()));
//        stockRepository.save(futureStock);
   // }

    public List<StockEntity> getAllStocks() {

        return stockRepository.findAll();
    }


}

