package org.spring.CartProjectDecember.controller;

import org.spring.CartProjectDecember.model.Product;
import org.spring.CartProjectDecember.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productServices;

    @PostMapping("/add")
    public void addingProduct(@RequestBody Product product){
       // System.out.println("prodcts at controller"+product);
        productServices.addingProduct(product);

    }
    @GetMapping("/listOfProducts")
    public ResponseEntity< List<Product>> gettingListOfProducts(){
        return new ResponseEntity<>( productServices.gettingListOfProducts(), HttpStatus.FOUND);
    }
    @GetMapping("/product{prodId}")
    public ResponseEntity< Product> gettingProductById(@PathVariable int prodId ){
       Product product=  productServices.gettingProductById(prodId);
       if (product!= null ){
           return new ResponseEntity<>(product,HttpStatus.FOUND);
       }else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }

    }

    @PutMapping("/updating{ProdId}")
    public ResponseEntity<String> updatingbyId(@PathVariable int ProdId,@RequestBody Product products){

      Product product = productServices.updatingProuctById(ProdId,products);
    return     (product!=null) ?
        new ResponseEntity<>("updated sucessfull",HttpStatus.ACCEPTED)
        : new ResponseEntity<>("no product",HttpStatus.NOT_FOUND);

    }

    @DeleteMapping("/deleting{ProdId}")
    public  ResponseEntity deletingProd(@PathVariable int ProdId){
      Product product=  productServices.gettingProductById(ProdId);

        if (product != null) {
            productServices.deletingProductById(ProdId);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }
//    @GetMapping("/seraching")
//    public ResponseEntity< List<Product>> seachingProduct(@RequestParam String key){
//
//     //  List<Product> products = productServices.seaching(key);
//       return  new ResponseEntity<>(products,HttpStatus.FOUND);
//
//
//    }

}
