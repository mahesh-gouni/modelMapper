package org.spring.CartProjectDecember.mapper;


import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.spring.CartProjectDecember.enitity.ProductEntity;
import org.spring.CartProjectDecember.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class ModelMap {
    @Autowired
    public ModelMapper modelMapper;
    public ProductEntity modelToEntity(Product product){
        return  modelMapper.map(product, ProductEntity.class);
    }

    public Product entityToModel(ProductEntity entity) {

        return modelMapper.map(entity, Product.class);
    }
}
