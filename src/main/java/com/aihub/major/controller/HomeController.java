package com.aihub.major.controller;

import com.aihub.major.model.Category;
import com.aihub.major.service.CategoryService;
import com.aihub.major.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class HomeController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @GetMapping({"/","/home"})
    public String home(Model model)
    {
        return "index";
    }
    @GetMapping("/website")
    public String website(Model model) {
        model.addAttribute("categories",categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProduct());
        return"website";
    }

    @GetMapping("/website/category/{id}")
    public String websiteByCategory(Model model, @PathVariable int id) {
        model.addAttribute("categories",categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProductByCategoryId(id));
        return"website";
    }

    @GetMapping("/website/viewproduct/{id}")
    public String viewProduct(Model model, @PathVariable Long id) {
        model.addAttribute("product",productService.getProductById(id).get());
        return"viewProduct";
    }



}
