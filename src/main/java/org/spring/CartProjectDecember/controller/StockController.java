package org.spring.CartProjectDecember.controller;

import org.spring.CartProjectDecember.enitity.StockEntity;
import org.spring.CartProjectDecember.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {
    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stocks/create")
    public String createStocks() {
      //  stockService.createStocks();
        return "Stocks created successfully!";
    }

    @GetMapping("/stocks")
    public List<StockEntity> getAllStocks() {
        return stockService.getAllStocks();
    }
}
