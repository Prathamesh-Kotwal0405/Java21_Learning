package com.prathamesh.exercise15;

import com.prathamesh.practice.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private Map<String, CartItem> items = new HashMap<>();

    public void addProduct(Product product, int quantity){
        CartItem item = items.get(product.getProductId());
        if(item!=null){
            item.setQuantity(item.getQuantity()+quantity);
        } else {
            items.put(product.getProductId(), new CartItem(product,quantity));
        }
    }

    public void removeProduct(String productId){
        items.remove(productId);
    }

    public double calculateTotal(){
        double total=0;
        for(CartItem item : items.values()){
            total+=item.getProduct().getPrice();
        }
        return total;
    }

    public void showCart(){
        for(CartItem item : items.values()){
            System.out.println(item.getProduct().getProductName() + " X " + item.getQuantity() + " = $" + item.getProduct().getPrice());
        }
        System.out.println("Total : $" + calculateTotal());
    }

    public static void main(String[] args) {
        Product orange = new Product("1","Orange", 0.89);
        Product apple = new Product("2","Apple", 0.99);
        Product coffee = new Product("3","Coffee", 1.9);
        Product soap = new Product("4","Soap", 0.20);

        Cart cart = new Cart();
        cart.addProduct(apple,3);
        cart.addProduct(coffee,2);
        cart.addProduct(orange,5);
        cart.addProduct(soap,1);
        System.out.println("Before removing one product");
        cart.showCart();
        cart.removeProduct("1");
        System.out.println("After removing one product");
        cart.showCart();

    }

}
