import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame implements ActionListener {
    private JTextField jtf1,jtf2;
    private JLabel jl1,jl2;
    private JButton jb1,jb2;

    private JPanel contentPane;
    private JMenu jmenu;
    private JMenuBar jmenuBar;
    private JMenuItem jmenuItem1,jmenuItem2,jmenuItem3,jmenuItem4;
    public LoginUI(){
        this.setTitle("jdbc初步管理系统登录界面");
        setLocation(100,100);
        setSize(400,300);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);


        jb1=new JButton("确定");
        jb1.setBounds(50,200,60,40);
        jb2=new JButton("清空");
        jb2.setBounds(150,200,60,40);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        contentPane.add(jb1);
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        contentPane.add(jb2);

        jl1=new JLabel("用户名");
        jl1.setBounds(10,10,50,50);
        jl2=new JLabel("密码");
        jl2.setBounds(100,60,50,50);
        contentPane.add(jl1);
        contentPane.add(jl2);

        jtf1=new JTextField();
        jtf1.setBounds(20,10,50,50);
        jtf2=new JTextField();
        jtf2.setBounds(100,60,50,50);
        contentPane.add(jtf1);
        contentPane.add(jtf2);
        //setContentPane(contentPane);





        this.setVisible(true);
    }
    public static void main(String args[]){

        EventQueue.invokeLater(() -> {
            LoginUI lu=new LoginUI();
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}

