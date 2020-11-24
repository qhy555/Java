import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea jtextArea_A= new JTextArea();
    JTextArea jtextArea_B= new JTextArea();
    //构造方法
    public App() {
        jtextArea_A.setBounds(100,100,200,200);
       jtextArea_A.setBackground(Color.cyan);
        myPanel.add(jtextArea_A);
        jtextArea_B.setBounds(100,400,200,200);
        jtextArea_B.setBackground(Color.orange);
        myPanel.add(jtextArea_B);

        jtextArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    if (jtextArea_A.getText().equals("覃红运")){
                        jtextArea_B.setText("输入成功");
                    }else {
                        jtextArea_B.setText("输入错误");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    jtextArea_B.setText("");
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
