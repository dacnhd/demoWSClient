package com.example.demo.controller;

import com.example.demo.service.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("list", productService.getList());
        return "admin/products/index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(Model model){
        model.addAttribute("product", new Product());
        return "admin/products/form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(Product product){
        productService.save(product);
        return "redirect:/students";
    }
}
