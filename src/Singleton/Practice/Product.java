package Singleton.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private int productId, categoryId;
    private String productTitle;
    private double price;

    public Product() {}

    public Product(int productId, int categoryId, String productTitle, double price) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productTitle = productTitle;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getProductTitle() {
        return productTitle;
    }
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin cho sản phẩm:");
        System.out.println("Mã sản phẩm:");
        try {
            int productId = scanner.nextInt();
            this.setProductId(productId);
        } catch (Exception e){
            System.out.println(e.getCause());
        }

        while (isValidProductId(productId)){
            System.out.println("Mã sản phẩm đã được sử dụng, vui lòng nhập mã sản phẩm khác:");
            System.out.println("Nhập mã sản phẩm mới:");
            productId = scanner.nextInt();
            this.setProductId(productId);
        }

        System.out.println("Nhập mã danh mục sản phẩm:");
        try {
            int categoryId = scanner.nextInt();
            this.setCategoryId(categoryId);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        while (!isValidCategoryId(categoryId)){
            System.out.println("Mã danh mục sản phẩm chưa có trên hệ thống");
            System.out.println("Nhập lại mã danh mục sản phẩm:");
            categoryId = scanner.nextInt();
            this.setCategoryId(categoryId);
        }

        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        this.setProductTitle(scanner.nextLine());

        System.out.println("Nhập giá:");
        this.setPrice(scanner.nextDouble());
    }

    private boolean isValidCategoryId(int categoryId) {
        List<Category> categories = Manager.getInstance().getCategories();
        List<Integer> categoryIds = new ArrayList<>();
        for (Category category : categories) {
            categoryIds.add(category.getId());
        }
        return categoryIds.contains(categoryId);
    }

    private boolean isValidProductId(int productId) {
        List<Product> products = Manager.getInstance().getProducts();
        List<Integer> productIds = new ArrayList<>();
        for (Product product : products) {
            productIds.add(product.getProductId());
        }
        return productIds.contains(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", categoryId=" + categoryId +
                ", productTitle='" + productTitle + '\'' +
                ", price=" + price +
                '}';
    }
}
