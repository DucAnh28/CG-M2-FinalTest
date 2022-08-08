package controller;

import model.Product;
import storage.ReadWriteData;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public List<Product> productList = new ArrayList<>();
//    private ReadWriteData readWriteData = ReadWriteData.getInstance();

    public void display(){
        for (Product x : productList
             ) {
            System.out.println(x.toString());
        }
    }
    public void addProduct(Product product) {
        productList.add(product);
    }

    public void editProduct(int id, Product product) {
        productList.set(id,product);
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    public void deleteAll() {
        productList.removeAll(productList);
    }

}
