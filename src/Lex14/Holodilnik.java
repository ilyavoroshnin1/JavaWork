package Lex14;

import java.util.HashMap;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int value) {
        if (products.containsKey(product)) {
            int valueNow = products.get(product);
            products.put(product, value + valueNow);
        } else {
            products.put(product, value);
        }

    }

    public void printAllProducts() {
        for (String product : products.keySet()) {
            System.out.println(product + " - " + products.get(product));
        }
    }

    public void getProduct(String product, int value){

    }
}
