package Mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Mouseapp {
    private JPanel mypanel=new JPanel();//窗体对象
    private JLabel mouse_img=new JLabel();//图片对象
    private JLabel num=new JLabel();//分数
    private JLabel time=new JLabel();//倒计时对象
    private JLabel bg_img=new JLabel();//背景图片对象
    int number=0;
    private String path="mouse.jpg";
    int n=5;

    public Mouseapp(){
        mouse_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                mouse_img.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),100,100);
                number++;
                num.setText("分数："+number);
                num.setForeground(Color.red);
                num.setBounds(100,20,100,100);
                n=5;
            }
            public void mouseReleased(MouseEvent e){
                super.mouseReleased(e);
                java.net.URL imgURL1= Mouseapp.class.getResource("mouse.jpg");
                mouse_img.setIcon(new ImageIcon(imgURL1));
            }
        });
    }
    void go() throws InterruptedException {

        java.net.URL imgURL1= Mouseapp.class.getResource(path);
        mouse_img.setIcon(new ImageIcon(imgURL1));
        mypanel.setLayout(null);
        mouse_img.setBounds(90,10,100,100);
        num.setBounds(0,0,100,100);
        time.setBounds(100,60,300,100);
        java.net.URL bg= Mouseapp.class.getResource("bg.jpg");
        bg_img.setIcon(new ImageIcon(bg));
        bg_img.setBounds(0,0,new ImageIcon(bg).getIconWidth(),new ImageIcon(bg).getIconHeight());
        mypanel.add(mouse_img);
        mypanel.add(time);
        mypanel.add(num);
        mypanel.setLayout(null);
        mypanel.add(bg_img);

        JFrame frame = new JFrame("打地鼠");
        frame.setContentPane(mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,new ImageIcon(bg).getIconWidth(),new ImageIcon(bg).getIconHeight());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        while (n>0){
            //更新界面，显示倒计时
            String text=String.valueOf(n);
            n=n-1;
            time.setText("游戏倒计时："+text);
            time.setForeground(Color.red);
            Thread.sleep(1000*1);
            if (n<=0){
                time.setText("游戏结束！！！");
                JOptionPane.showMessageDialog(time, "游戏结束", "标题",JOptionPane.WARNING_MESSAGE);
                System.exit(0);
                break;
            }
        }

    }
    public static void main(String[] args) throws InterruptedException {
        new Mouseapp().go();
    }
}



