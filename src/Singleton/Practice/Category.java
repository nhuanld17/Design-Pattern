package Singleton.Practice;

import java.util.List;
import java.util.Scanner;

public class Category {
    private int id;
    private String catName;

    public Category() {
    }

    public int getId() {
        return id;
    }
    public String getCatName() {
        return catName;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void input(){
        Scanner k = new Scanner(System.in);
        System.out.println("Tên danh mục:");
        this.setCatName(k.nextLine());
        System.out.println("Mã danh mục:");
        this.setId(k.nextInt());
        k.nextLine();

        while (isValidCategory()){
            System.out.println("Danh mục không hợp lệ");
            System.out.println("Tên danh mục hoặc mã danh mục đã bị trùng");
            System.out.println("Tên danh mục:");
            this.setCatName(k.nextLine());
            System.out.println("Mã danh mục:");
            this.setId(k.nextInt());
            k.nextLine();
        }
    }

    private boolean isValidCategory() {
        List<Category> categories = Manager.getInstance().getCategories();
        for (Category category : categories) {
            if ((category.getId() == this.getId() && category.getCatName().equalsIgnoreCase(this.getCatName())
            || (category.getId() == this.getId() || category.getCatName().equalsIgnoreCase(this.getCatName())))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", catName='" + catName + '\'' +
                '}';
    }
}
