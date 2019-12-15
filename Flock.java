import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Flock {
    private ArrayList<Bird> flock;
    private String[] names = {" James", " Aizel", " Paul", " Oleg", " Truph"};
    MyWindow w;

    public Flock(Window w){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        flock = new ArrayList<Bird>(n);

        /*while (true){
            int code = in.nextInt();
            if (code == 1){
                //String name = in.nextLine();
                flock.add(new Macaw());
            }
            else if(code == 2){
                flock.add(new Penguin());
            }
            else{
                break;
            }
        }*/

        for (int i = 0; i < n; i++){
            System.out.println("Choose a bird(1 - Macaw,2 - Penguin,3 - Vorobey)");
            int code = in.nextInt();
            if (code == 1){
                System.out.println("Write Macaw`s name");
                String name = in.next();
                flock.add(new Macaw());
                System.out.println("Macaw added");
            }else if (code == 2) {
                flock.add(new Penguin());
                System.out.println("Penguin added");
            }else if (code == 3){
                flock.add(new Vorobey());
                System.out.println("Vorobey added");
            }
            System.out.println();

        }
    }

    public Flock(int n, String random){
        flock = new ArrayList<Bird>(n);
        Scanner in = new Scanner(System.in);
        Random r = new Random();


        for (int i = 0; i < n; i++){
            System.out.println("Choose a bird(1 - Macaw,2 - Penguin,3 - Vorobey)");
            int code = in.nextInt();
            if (code == 1){
                String name = names[r.nextInt(names.length)];
                flock.add(new Macaw());
                System.out.println("Macaw added");
            }else if (code == 2) {
                flock.add(new Penguin());
                System.out.println("Penguin added");
            }else if (code == 3){
                flock.add(new Vorobey());
                System.out.println("Vorobey is here");
            }
            System.out.println();
        }

    }

    public void fly(){
        for(int i = 0; i < flock.size(); i++){
            flock.get(i).fly();
        }
    }

    public void draw (Graphics g){
        for (int i=0; i<flock.size(); i++){
            flock.get(i).draw(g);
        }
    }
}
