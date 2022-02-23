/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.service;

import beans.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ProductService {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1000, "f230fh0g3", "Arroz", "Product Description", "bamboo-watch.jpg", 65,
                "Kg", 24, 5));
        products.add(new Product(1001, "nvklal433", "Frijol", "Product Description", "black-watch.jpg", 72,
                "Kg", 61, 4));
        products.add(new Product(1002, "zz21cz3c1", "Atun", "Product Description", "blue-band.jpg", 79,
                "Lata 500 gr", 2,  3));
        products.add(new Product(1003, "244wgerg2", "Azucar", "Product Description", "blue-t-shirt.jpg", 29,
                "Kg", 25,  5));
        products.add(new Product(1004, "h456wer53", "Jitomate", "Product Description", "bracelet.jpg", 15,
                "Kg", 73,  4));
        products.add(new Product(1005, "av2231fwg", "Sopa", "Product Description", "brown-purse.jpg", 120,
                "Kg", 0, 4));
        products.add(new Product(1006, "bib36pfvm", "Cebolla", "Product Description", "chakra-bracelet.jpg", 32,
                "Kg", 5,  3));
        products.add(new Product(1007, "mbvjkgip5", "Agua", "Product Description", "galaxy-earrings.jpg", 34,
                "Botella 500 ml", 23,  5));
        products.add(new Product(1008, "vbb124btr", "Chile Verde", "Product Description", "game-controller.jpg", 99,
                "Kg", 2,  4));
      
        

    }
public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Product> getProducts(int size) {

        if (size > products.size()) {
            Random rand = new Random();

            List<Product> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(products.size());
                randomList.add(products.get(randomIndex));
            }

            return randomList;
        }

        else {
            return new ArrayList<>(products.subList(0, size));
        }

    }

    public List<Product> getClonedProducts(int size) {
        List<Product> results = new ArrayList<>();
        List<Product> originals = getProducts(size);
        for (Product original : originals) {
            results.add(original.clone());
        }
        return results;
    }
}
