

import java.util.Scanner;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       /* Bird a = new Bird();
        a.fly();
        Macaw b = new Macaw();
          b.fly();
          Macaw c = new Macaw;
          c.fly();
          b.speak();
          c.speak();
          c.name = "Гоша Рубчинский";
          c.speak();
          System.out.println(b.getName());

          b.setName("Флекс");
          b.speak();
          Penguin d = new Penguin();
          d.fly();
          b.hello(c);

        Macaw m1 = new Macaw(" Paul");
        Macaw m2 = new Macaw(" James");
        m1 = m2;
        m2.setName(" James");
        m1.speak();

        Bird[] a = new Macaw[3];
        a[0] = new Macaw(" Chris");
        a[1] = new Penguin();
        a[2] = new Macaw(" Angelo");

        for (int i = 0; i <a.length; i++) {
            a[i].fly();
        }

        JFrame w = new JFrame ("Окно");
        w.setSize(200,400);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    */
        MyWindow w = new MyWindow();  // создание окна
        Flock f = new Flock(w); // создание  экземпляра класса flock



    }
}