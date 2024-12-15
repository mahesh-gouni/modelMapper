package org.spring.CartProjectDecember.enitity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("FUTURE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FutureStockEntity extends StockEntity{


    java.util.Date utilDate = new java.util.Date();
    private Date maturityDate = new Date(utilDate.getTime());
}
