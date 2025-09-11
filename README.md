Mã môn SOF3022 - Java 5 - Spring Boot Labs & Assignment
Dự án này tổng hợp toàn bộ **bài Lab** và **Assignment (ASM)** của môn **Java 5** tại FPT Polytechnic.  
Mục tiêu là giúp sinh viên làm quen với **Spring Boot**, **Thymeleaf**, **Controller**, **Model**, và phát triển ứng dụng web MVC.

---
## 📂 Cấu trúc thư mục
Java5-Labs/
│
├─ Lab1/ # Giới thiệu Spring Boot, Hello World, Form đơn giản
├─ Lab2/ # Controller nâng cao: Mapping, Params, Model, Forward/Redirect
├─ Lab3/ # (Sẽ cập nhật sau) ...

---

## 📝 Nội dung từng Lab

### 🔹 Lab 1 - Spring Introduction
- Cấu hình project Spring Boot bằng Maven.  
- Hello World với Thymeleaf.  
- Form Login cơ bản (username, password).  
- Tính diện tích & chu vi hình chữ nhật.  

👉 **Mục tiêu:** Làm quen với Spring Boot, Controller, View.

---

### 🔹 Lab 2 - Building Controller
- Mapping request với `@GetMapping`, `@PostMapping`, `@RequestMapping`.  
- Nhận dữ liệu từ URL: `@PathVariable`, `@RequestParam`.  
- Binding form vào object bằng `@ModelAttribute`.  
- Chia sẻ dữ liệu với View qua `Model` và `@ModelAttribute`.  
- Hiểu rõ sự khác nhau giữa **forward**, **redirect**, và **@ResponseBody**.  

👉 **Mục tiêu:** Hiểu sâu hơn về cách Spring Boot Controller hoạt động.

---

### 🔹 Lab 3 trở đi
- Sẽ tiếp tục được cập nhật trong repo.  

---

## 🚀 Cách chạy dự án

1. Clone repo:
   ```bash
   git clone https://github.com/NgocHai112/SOF3022.git
2. Mở bằng IntelliJ IDEA.

3. Chạy file Application.java trong từng Lab (Spring Boot sẽ tự khởi động Tomcat embedded).

4. Mở trình duyệt:
Lab1: http://localhost:8080/lab1
Lab2: http://localhost:8080/lab2
(Tương tự cho các bài lab và asm còn lại)
....
🛠️ Công nghệ sử dụng
Java 21
Spring Boot 3
Maven
Thymeleaf
IntelliJ IDEA bản 2025.1.3
GitHub
