import java.awt.*;
import java.util.Scanner;

public class grid {

    public grid(){

    }

    public static void gridSetup() {

        GridLayout battleshipGrid = new GridLayout(10, 10);

        Component battleshipComponent = new Component() {

            @Override
            public Point getLocation() {
                return super.getLocation();
            }

            public void setLocation(Point battleshipLocation) {
                super.setLocation(6, 7);
            }

            public void setSize(int width, int height) {
                super.setSize(3, 2);
            }
        };

        Component destroyerComponent = new Component() {
            @Override
            public Point getLocation() {
                return super.getLocation();
            }

            public void setLocation(Point destroyerLocation) {
                super.setLocation(2, 4);
            }

            public void setSize(int width, int height) {
                super.setSize(2, 2);
            }
        };

        battleshipGrid.addLayoutComponent("battleship", battleshipComponent);
        battleshipGrid.addLayoutComponent("destroyer", destroyerComponent);
    }
    public static void main(String[] args){


        gridSetup();

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the X coordinate you would like to guess?");
        int coordinateX = scan.nextInt();

        System.out.println("What is the Y coordinate you would like to guess?");
        int coordinateY = scan.nextInt();

        if (coordinateX >= 6 && coordinateX <=8 && coordinateY >= 7 && coordinateY <=8) {
            System.out.println("You have hit the Battleship.");
        } else if (coordinateX >= 2 && coordinateX <=3 && coordinateY >= 4 && coordinateY <=5) {
            System.out.println("You have hit the Destroyer.");
        } else {
            System.out.println("You have missed.");
        }

    }
}
