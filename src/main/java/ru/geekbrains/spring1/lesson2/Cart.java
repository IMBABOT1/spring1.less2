package ru.geekbrains.spring1.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    private List<Product> cart;


    @PostConstruct
    public void init() {
       cart = new ArrayList<>();
    }

    public void add(Long id){
        cart.add(productService.findProductById(id));
    }

    public void remove(Long id){
        cart.remove(productService.findProductById(id));
    }
    
    @Override
    public String toString() {
        return cart.toString();
    }
}
