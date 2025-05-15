import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JFrame {
    private JPanel RootPanel;
    private JButton logInButton;
    private JButton registerButton;

    Main () {
        setContentPane(RootPanel);
        setTitle("Game Rent");
        setSize(800,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
        Games.Start();
    }

}