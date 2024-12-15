package org.spring.CartProjectDecember.enitity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;


import java.sql.Date;

@Entity
@Data
@Table(name = "productsDec")
public class ProductEntity {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "productId",nullable = false)
      private int productId;

    @Column(name = "productName",nullable = false)
     private String productName;

    @Column(name = "description",nullable = false)
     private String description;

    @Column(name = "brand",nullable = false)
     private String brand;

    @Column(name = "price",nullable = false)
     private double price;

    @Column(name = "category",nullable = false)
     private String category;

    @Column(name = "releaseDate",nullable = false)
  //  @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
     private Date releaseDate;

    @Column(name = "quantity",nullable = false)
     private int quantity;
}
