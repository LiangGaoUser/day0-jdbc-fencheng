
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class mainUI extends JFrame {

    private JPanel contentPane;
    private JTextField textField_user;
    private JTextField textField_password;
    private JLabel Label_user;
    //private String user;
    //private String password;

    //private Depoprivate DepotManage dm=new DepotManage();//tManage dm=new DepotManage();
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    mainUI frame = new mainUI();
                    ImageIcon bg = new ImageIcon("C:\\Users\\梁高\\Pictures\\game\\新建文件夹 (2)\\bg.jpg");
                    JLabel label = new JLabel(bg);
                    label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
                    frame.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
                    JPanel jp=(JPanel)frame.getContentPane();
                    jp.setOpaque(false);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public mainUI() {
        this.setTitle("仓库管理系统");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        this.addWindowListener(new WindowAdapter()//
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                // TODO Auto-generated method stub

                if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(mainUI.this, "是否退出？", "询问", JOptionPane.YES_NO_OPTION))
                {
                    //WindowsAndMenu.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    mainUI.this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
                else
                {
                    mainUI.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });//

        JButton Btn_clear = new JButton("\u6E05\u7A7A");
        Btn_clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        Btn_clear.setBounds(159, 166, 113, 27);
        contentPane.add(Btn_clear);

        JButton Btn_login = new JButton("\u767B\u5F55");



        Btn_login.setBounds(23, 166, 113, 27);
        contentPane.add(Btn_login);

        JButton Btn_exit = new JButton("\u9000\u51FA");
        Btn_exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        Btn_exit.setBounds(295, 166, 113, 27);
        contentPane.add(Btn_exit);

        textField_user = new JTextField();
        textField_user.setBounds(141, 48, 182, 24);
        contentPane.add(textField_user);
        textField_user.setColumns(10);

        textField_password = new JTextField();
        textField_password.setBounds(141, 108, 182, 24);
        contentPane.add(textField_password);
        textField_password.setColumns(10);

        Label_user = new JLabel("\u8D26\u6237");
        Label_user.setBounds(42, 51, 72, 18);
        contentPane.add(Label_user);

        JLabel Label_password = new JLabel("\u5BC6\u7801");
        Label_password.setBounds(42, 111, 72, 18);
        contentPane.add(Label_password);
    }
}
