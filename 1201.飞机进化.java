
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_p=new JLabel();
    JLabel label_back=new JLabel();

    int x=200;
    int y=200;
    int w=128;
    int h=128;
    //构造方法
    public App() {
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以

        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_LEFT){
                    x-=10;
                    label_p.setBounds(x,y,w,h);
                }
                if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                    x+=10;
                    label_p.setBounds(x,y,w,h);
                }
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    y-=10;
                    label_p.setBounds(x,y,w,h);
                }
                if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    y+=10;
                    label_p.setBounds(x,y,w,h);
                }
            }

        });
    }
    //显示窗体方法
    void go(){
        java.net.URL img = App.class.getResource("img/plane0.png");
        label_p.setIcon(new ImageIcon(img));
        label_p.setBounds(0,0,w,h);

        label_p.setText("");
        label_p.setBounds(200,200,128,128);
        myPanel.add(label_p);
        label_back.setText("");
        label_back.setBounds(200,200,128,128);
        myPanel.add(label_back);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,900);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
