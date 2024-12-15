package org.spring.CartProjectDecember.enitity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("OPTIONAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionalStockEntiy extends StockEntity{
    public boolean isOptional() {
        return isOptional;
    }

    public void setOptional(boolean optional) {
        isOptional = optional;
    }

    private boolean isOptional;
}
