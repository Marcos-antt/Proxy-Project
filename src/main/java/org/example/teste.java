package org.example;

import java.awt.*;

public class teste {
    public static void main(String[] args) {

        Image image = new ImageProxy("test_image.jpg");


        ((ImageProxy) image).display();


        ((ImageProxy) image).display();
    }
}