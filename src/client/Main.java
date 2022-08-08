package client;

import controller.ProductManager;
import model.Product;
import storage.ReadWriteData;
import storage.ReadWriteDataInterface;

import java.util.Scanner;

public class Main {
    static ProductManager productManager = new ProductManager();
    static ReadWriteDataInterface readWrite = ReadWriteData.getInstance();

    public static void main(String[] args) {

    }

    public static void menuOfProduct() {
        try {
            do {

                System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ----");
                System.out.println("Chọn chức năng theo số (để tiếp tục)");
                System.out.println("1. Xem danh sách");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp");
                System.out.println("6. Tìm sản phẩm có giá đắt nhất");
                System.out.println("7. Ghi file");
                System.out.println("8. Đọc file");
                System.out.println("9. Thoát");
                Scanner scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        productManager.display();
                        break;
                    case 2:
                        System.out.println("Mời bạn nhập ID");
                        String ID = scanner.nextLine();
                        System.out.println("Mời bạn nhập tên");
                        String name = scanner1.nextLine();
                        System.out.println("Mời bạn nhập giá");
                        double price = scanner.nextDouble();
                        System.out.println("Mời bạn nhập quantity");
                        String quantity = scanner1.nextLine();
                        System.out.println("Mời bạn nhập mô tả");
                        String dsecription = scanner.nextLine();
                        Product product = new Product(ID, name, price, quantity, dsecription);
                        productManager.addProduct(product);
                        break;
                    case 3:

                }
            } while (true)

        } catch ()
    }
}
