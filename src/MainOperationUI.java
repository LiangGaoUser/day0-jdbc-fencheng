import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainOperationUI extends JFrame implements ActionListener {
    private JMenu jmenu;
    private JMenuBar jmenuBar;
    private JMenuItem jmenuItem1,jmenuItem2,jmenuItem3,jmenuItem4;
    public MainOperationUI(){
        this.setTitle("jdbc初步管理系统");
        setLocation(100,100);
        setSize(400,300);
        jmenu=new JMenu("用户管理");
        jmenuItem1=new JMenuItem("添加用户");
        jmenuItem2=new JMenuItem("删除用户");
        jmenuItem3=new JMenuItem("查询用户");
        jmenuItem4=new JMenuItem("修改密码");

        jmenuItem1.addActionListener(this);
        jmenuItem2.addActionListener(this);
        jmenuItem3.addActionListener(this);
        jmenuItem4.addActionListener(this);

        jmenu.add(jmenuItem1);
        jmenu.add(jmenuItem2);
        jmenu.add(jmenuItem3);
        jmenu.add(jmenuItem4);

        jmenuBar=new JMenuBar();
        jmenuBar.add(jmenu);
        setJMenuBar(jmenuBar);
        this.setVisible(true);
    }
    public static void main(String args[]){
        MainOperationUI mo=new MainOperationUI();
        EventQueue.invokeLater(() -> {
            MainOperationUI mo1 =new MainOperationUI();
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jmenuItem1){
            System.out.println("1");
        }
        else if(e.getSource()==jmenuItem2){
            System.out.println("2");
        }
        else if(e.getSource()==jmenuItem3){
            System.out.println("3");
        }
        else if(e.getSource()==jmenuItem4){
            System.out.println("4");
        }

    }
}

