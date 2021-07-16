package com.example.demo.controller;

import com.example.demo.service.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        return "redirect:/products";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String update(@PathVariable int id, Model model){
        Product product = productService.getDetail(id);
        model.addAttribute("product", product);
        return "admin/products/update";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String edit(@PathVariable int id, int quantity){
        productService.sellProduct(id, quantity);
        return "redirect:/products";
    }
}
