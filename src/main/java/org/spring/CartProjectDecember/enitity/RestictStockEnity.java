package org.spring.CartProjectDecember.enitity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("RESTRICT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestictStockEnity extends StockEntity{

    private String restrictionReason;

}
