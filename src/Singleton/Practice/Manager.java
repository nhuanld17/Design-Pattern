package Singleton.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    private final List<Category> categories;
    private final List<Product> products;

    private static Manager instance = null;

    private Manager() {
        this.categories  = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addCategory(){
        Category category = new Category();
        category.input();
        this.categories.add(category);
        System.out.println("Added Category");
    }

    public void addProduct(){
        Product product = new Product();
        product.input();
        this.products.add(product);
        System.out.println("Added Product");
    }

    public void getAllCategory() {
        if (this.categories.isEmpty()) {
            System.out.println("Danh sách danh mục đang trống");
            return;
        }
        for (Category category : this.categories) {
            System.out.println(category.toString());
        }
    }

    public void getallProducts() {
        if (this.products.isEmpty()){
            System.out.println("Danh sách sản phẩm đang trống");
            return;
        }

        for (Product product : this.products) {
            System.out.println(product.toString());
        }
    }

    public void getProductsOfCategory() {
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã danh mục để xem sản phẩm:");
        int categoryId = scanner.nextInt();

        for (Category category : this.categories) {
            if (categoryId == category.getId()) {
                found = true;
                displayProductsOfCategory(categoryId);
            }
        }

        if (!found) {
            System.out.println("Không có danh mục sản phẩm có mã là " + categoryId);
        }
    }

    private void displayProductsOfCategory(int categoryId) {
        for (Product product : this.products) {
            if (categoryId == product.getCategoryId()) {
                System.out.println(product.toString());
            }
        }
    }

    public void deleteProductById() {
        Scanner k =  new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần xóa");
        int id = k.nextInt();
        this.products.removeIf(product -> id == product.getProductId());

        getallProducts();
    }

    public void deleteCategoryById() {
        Scanner k = new Scanner(System.in);
        System.out.println("Nhập mã danh mục sản phẩm cần xóa:");
        int id = k.nextInt();
        this.categories.removeIf(category -> category.getId() == id);
        deleteProductOfCategory(id);
    }

    private void deleteProductOfCategory(int id) {
        this.products.removeIf(product -> product.getCategoryId() == id);
    }
}
