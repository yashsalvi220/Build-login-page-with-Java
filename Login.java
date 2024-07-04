import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        LoginFrame lf1 = new LoginFrame();
        lf1.setTitle("Login Form");
        lf1.setVisible(true);
        lf1.setBounds(10,10,370,600);
        lf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lf1.setResizable(false);
    }
}
