package com.example.produktapi.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

    @Test //Jaime
    @DisplayName("Test get title")

    public void testGetTitle(){
        String title = "testTitle";
        product.setTitle(title);

        String getTitle = product.getTitle();
        Assertions.assertEquals(title, getTitle);

    }

    @Test //Jaime
    @DisplayName("Test get image")

    public void testGetImage(){
        String image = "testImage";
        product.setImage(image);

        String getImage = product.getImage();
        Assertions.assertEquals(image, getImage);

    }

    @Test //Jaime
    @DisplayName("Test set title")

    public void testSetTitle(){
        String title = "testTitle";
        product.setTitle(title);

        Assertions.assertEquals(title, product.getTitle());

    }

    @Test //Jaime
    @DisplayName("Test set image")

    public void testSetImage(){
        String image = "testImage";
        product.setImage(image);

        Assertions.assertEquals(image, product.getImage() );
    }


}
