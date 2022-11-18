package ru.geekbrains.spring1.lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = context.getBean(Cart.class);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("press /end to exit");
            System.out.println("press /add to add product");
            System.out.println("press /remove to remove product");

            String cmd = scanner.nextLine();

            switch (cmd) {
                case ("/end"):
                    return;
                case ("/add1"):
                    cart.add(1l);
                    System.out.println(cart);
                    break;
                case ("/add2"):
                    cart.add(2l);
                    System.out.println(cart);
                    break;
                case ("/add3"):
                    cart.add(3l);
                    System.out.println(cart);
                    break;
                case ("/add4"):
                    cart.add(4l);
                    System.out.println(cart);
                    break;
                case ("/add5"):
                    cart.add(5l);
                    System.out.println(cart);
                    break;

                case ("/remove1"):
                    cart.remove(1l);
                    System.out.println(cart);
                    break;
                case ("/remove2"):
                    cart.remove(2l);
                    System.out.println(cart);
                    break;
                case ("/remove3"):
                    cart.remove(3l);
                    System.out.println(cart);
                    break;
                case ("/remove4"):
                    cart.remove(4l);
                    System.out.println(cart);
                    break;
                case ("/remove5"):
                    cart.remove(5l);
                    System.out.println(cart);
                    break;
            }
        }
    }
}
