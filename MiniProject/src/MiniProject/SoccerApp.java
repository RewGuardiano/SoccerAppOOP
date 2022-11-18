package MiniProject;

import jdk.jfr.Category;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SoccerApp extends JFrame {
    private JPanel MainPanel;
    private JLabel JLSoccerBookings;

    public SoccerApp(){
        setTitle("Soccer Booking System");
        setSize(450,300);
        setContentPane(MainPanel);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("football.png"))).getImage());




        /*createManageCatMenu();
        createUpdateFixturesMenu();
        createProcessSalesMenu();

        menuBar.add(CategoryMenu);
        menuBar.add(FixturesMenu);
        menuBar.add(SalesMenu);*/
    }


    public static void main(String[] args) {

        SoccerApp GUI = new SoccerApp();

    }



    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
