import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class CreateBattleshipGrid {

    static GridLayout battleshipGrid = new GridLayout(10, 10);

    static JPanel battleshipPanel = new JPanel(battleshipGrid);

    public static void main(String[] args){

        Scanner scanX = new Scanner(System.in);

        Scanner scanY = new Scanner(System.in);

        System.out.println("What is the X coordinate you would like to guess?");
         battleshipPanel.getLocation().x = scanX.nextInt();

        System.out.println("What is the Y coordinate you would like to guess?");
        battleshipPanel.getLocation().x = scanY.nextInt();

        if (scanX.equals(battleshipPanel.getLocation().x) && scanY.equals(battleshipPanel.getLocation().y)) {
            System.out.println("You have hit the Battleship.");
        } else if (scanX.equals(battleshipPanel.getLocation()) && scanY.equals(battleshipPanel.getLocation())) {
            System.out.println("You have hit the Destroyer.");
        } else {
            System.out.println("You have missed.");
        }
    }

    public void createBattleship() {

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
        battleshipPanel.add(battleshipComponent);
    }

    public void createDestroyer() {

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

        battleshipPanel.add(destroyerComponent);
    }
}
