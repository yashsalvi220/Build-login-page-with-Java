import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginFrame extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel jl1 = new JLabel("Username:");
    JLabel jl2 = new JLabel("Password:");
    JTextField jt1 = new JTextField();
    JPasswordField jt2 = new JPasswordField();
    JButton jb1 = new JButton("Login");
    JButton jb2 = new JButton("Reset password");
    JCheckBox jcb1 = new JCheckBox("Show password");

    LoginFrame(){
        setLayoutManager();
        setLocationandsize();
        addComponentsToContainer();
        addActionevent();
    }
    public void addActionevent(){
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jcb1.addActionListener(this);
    }
    public void addComponentsToContainer(){
        container.add(jl1);
        container.add(jl2);
        container.add(jt1);
        container.add(jt2);
        container.add(jb1);
        container.add(jb2);
        container.add(jcb1);
    }
    public void setLocationandsize(){
        jl1.setBounds(50,150,100,30);
        jt1.setBounds(150, 150, 150, 30);
        jl2.setBounds(50,220,100,30);
        jt2.setBounds(150,220,150,30);
        jb1.setBounds(50,300,100,30);
        jb1.setBackground(Color.green);
        jb2.setBounds(200,300,100,30);
        jb2.setBackground(Color.orange);
        jcb1.setBounds(50, 250, 100, 30);
        jcb1.setForeground(Color.blue);
    }
    public void setLayoutManager(){
        container.setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==jb1){
            String usertext;
            String passwordtext;
            usertext = jt1.getText();
            passwordtext = jt2.getText();
            if(usertext.equalsIgnoreCase("Aptech")&& passwordtext.equalsIgnoreCase("1234")){
                JOptionPane.showMessageDialog(this,"Login Successful");
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid username or password");
            }
        }
        if(e.getSource()==jb2){
            jt1.setText("");
            jt2.setText("");
        }
        if(e.getSource()==jcb1){
            if(jcb1.isSelected()){
                jt2.setEchoChar((char) 0);
            }
            else{
                jt2.setEchoChar('*');
            }

        }
    }
}
