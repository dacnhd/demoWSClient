package com.example.demo.myservice;

import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    
    @Bean
    public ProductService productService(){
        ProductServiceService pss = new ProductServiceService();
        ProductService ps = pss.getProductServicePort();
        return ps;
    }
}
