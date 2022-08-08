package controller;

import model.Product;
import storage.ReadWriteData;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public List<Product> productList = new ArrayList<>();
    private ReadWriteData readWriteData = ReadWriteData.getInstance();


    public void addProduct(Product product) {
        productList.add(product);
        readWriteData.writeData(productList);
    }

    public void editProduct(int id, Product product) {
        productList.set(id,product);
        readWriteData.writeData(productList);
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
        readWriteData.writeData(productList);
    }

    public void deleteAll() {
        productList.removeAll(productList);
        readWriteData.writeData(productList);
    }


}
