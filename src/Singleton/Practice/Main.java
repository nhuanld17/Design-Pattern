package Singleton.Practice;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tạo danh mục sản phẩm mới");
            System.out.println("2. In danh sách danh mục sản phẩm");
            System.out.println("3. Tạo sản phẩm mới");
            System.out.println("4. In danh sách sản phẩm");
            System.out.println("5. In danh sách sản phẩm của 1 danh mục");
            System.out.println("6. Xóa phẩm thông qua mã sản phẩm");
            System.out.println("7. Xóa danh mục sản phẩm thông qua mã danh mục sản phẩm");
            System.out.println("0. Thoát");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.addCategory();
                    break;
                case 2:
                    manager.getAllCategory();
                    break;
                case 3:
                    manager.addProduct();
                    break;
                case 4:
                    manager.getallProducts();
                    break;
                case 5:
                    manager.getProductsOfCategory();
                    break;
                case 6:
                    manager.deleteProductById();
                    break;
                case 7:
                    manager.deleteCategoryById();
                    break;
                case 0:
                    System.out.println("Đã thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }
        }
    }
}
