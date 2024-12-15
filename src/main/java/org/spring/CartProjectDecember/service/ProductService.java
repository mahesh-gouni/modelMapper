package org.spring.CartProjectDecember.service;

import org.modelmapper.ModelMapper;
import org.spring.CartProjectDecember.enitity.ProductEntity;
import org.spring.CartProjectDecember.mapper.ModelMap;
import org.spring.CartProjectDecember.model.Product;
import org.spring.CartProjectDecember.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
      @Autowired
      private  ProductRepository productRepository;
      @Autowired
      private ModelMap modelMap;
   public void addingProduct(Product product) {
      // System.out.println("product at service"+product);
      ProductEntity productEntity= this.modelMap.modelToEntity(product);
      // System.out.println("converted by mapper"+productEntity);
      productRepository.save(productEntity);


   }

    public List<Product> gettingListOfProducts() {
       List<ProductEntity> list= productRepository.findAll();
       List<Product> model= list.stream().map(modelMap::entityToModel).collect(Collectors.toList());
       return  model;
    }

    public Product gettingProductById(int prodId) {

        ProductEntity productEntity= productRepository.findById(prodId).orElseThrow();
        Product product = modelMap.entityToModel(productEntity);

        return product;
    }

    public Product updatingProuctById(int prodId,Product products) {
       ProductEntity productEntity = modelMap.modelToEntity(products);

       productRepository.save(productEntity);
return products;

    }

    public void deletingProductById(int prodId) {
       productRepository.deleteById(prodId);
    }

//    public List<Product> seaching(String key) {
//     List<ProductEntity> products =  productRepository.findAllbysearch(key);
//        List<Product> model= products.stream().map(modelMap::entityToModel).collect(Collectors.toList());
//        return  model;
//    }
}
