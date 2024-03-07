package com.example.produktapi.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
    private Product product;

    @BeforeEach //Salim
    public void setUp() {
        product = new Product();
    }
    @Test //Salim
    public void testSetPrice() {
        Double price = 10.0;
        product.setPrice(price);
        Assertions.assertEquals(price, product.getPrice());
    }
    @Test //Salim
    public void testGetPrice() {
        Double price = 20.0;
        product.setPrice(price);
        Double retrievedPrice = product.getPrice();
        Assertions.assertEquals(price, retrievedPrice);
    }
    @Test //Salim
    public void testSetDescription() {
        String description = "Test description";
        product.setDescription(description);
        Assertions.assertEquals(description, product.getDescription());
    }
    @Test //Salim
    public void testGetDescription() {
        String description = "Test description";
        product.setDescription(description);
        String retrievedDescription = product.getDescription();
        Assertions.assertEquals(description, retrievedDescription);
    }

    @Test //Turgay
    public void testSetId() {
        Integer id = 1;
        product.setId(id);
        Assertions.assertEquals(id, product.getId());
    }

    @Test //Turgay
    public void testGetId() {
        Integer id = 1;
        product.setId(id);
        Integer retrievedId = product.getId();
        Assertions.assertEquals(id, retrievedId);
    }

    @Test //Turgay
    public void testConstructor() {

        String title = "Test Title";
        Double price = 10.0;
        String category = "Test Category";
        String description = "Test Description";
        String image = "test_image.jpg";


        Product newProduct = new Product(title, price, category, description, image);


        Assertions.assertEquals(title, newProduct.getTitle());
        Assertions.assertEquals(price, newProduct.getPrice());
        Assertions.assertEquals(category, newProduct.getCategory());
        Assertions.assertEquals(description, newProduct.getDescription());
        Assertions.assertEquals(image, newProduct.getImage());
    }
}
