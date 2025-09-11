package com.example.lab2.controller;

import com.example.lab2.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class ProductController2 {

    // GET: hiển thị form ban đầu + p1
    @GetMapping("/product2/form")
    public String form(Model model) {
        // Tạo sẵn p1 để hiển thị
        Product p1 = new Product("iPhone 30", 5000.0);
        model.addAttribute("p1", p1);

        return "product2";
    }

    // POST: lưu p2 từ form và vẫn truyền thêm p1
    @PostMapping("/product2/save")
    public String save(@ModelAttribute("p2") Product p, Model model) {
        // Bind dữ liệu form vào p2 (tự động nhờ @ModelAttribute)

        // Luôn có p1 để tránh lỗi null
        Product p1 = new Product("iPhone 30", 5000.0);
        model.addAttribute("p1", p1);

        return "product2";
    }

    // @ModelAttribute dùng để chia sẻ danh sách items cho tất cả view
    @ModelAttribute("items")
    public List<Product> getItems() {
        return Arrays.asList(
                new Product("Laptop", 1000.0),
                new Product("Phone", 800.0),
                new Product("Tablet", 600.0)
        );
    }
}
