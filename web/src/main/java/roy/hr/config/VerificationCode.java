package roy.hr.config;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * @author: roy
 * @date: 2023/7/15 22:55
 * @description: 验证码
 */
public class VerificationCode {
    private   int width=100;
    private   int height=30;
    private   String[]  fontNames=new String[]{"宋体","楷体","隶书","微软雅黑"};
    private  Color bgColor=new Color(255,255,255);
    private Random random=new Random();
    private  String codes="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private  String text;

    /*
    * 获取随机颜色*/
    private   Color randomColor(){
        int red=random.nextInt(150);
        int blue=random.nextInt(150);
        int green=random.nextInt(150);
        return  new Color(red,green,blue);
    }
    /*
    * 随机字体*/
    private  Font randomFont(){
        String name=fontNames[random.nextInt(fontNames.length)];
        int style=random.nextInt(4);
        int size=random.nextInt(5)+24;
        return new Font(name,style,size);
    }
    /*
    * 随机字节*/
    private  char randomChar(){
        return  codes.charAt(random.nextInt(codes.length()));
    }
    private BufferedImage createImage() {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = (Graphics2D) image.getGraphics();
        g2.setColor(bgColor);// 设置验证码图片的背景颜色
        g2.fillRect(0, 0, width, height);
        return image;
    }

    public BufferedImage getImage(){
        BufferedImage image=createImage();
        Graphics2D graphics2D= (Graphics2D) image.getGraphics();
        StringBuffer buffer=new StringBuffer();
        for(int i=0;i<4;i++){
            String s=randomChar()+"";
            buffer.append(s);
            graphics2D.setColor(randomColor());
            graphics2D.setFont(randomFont());
            float x=i*width*1.0f/4;
            graphics2D.drawString(s,x,height-8);
        }
        this.text=text;
        drowLine(image);
        return  image;
    }

    private void drowLine(BufferedImage image) {
        Graphics2D graphics2D= (Graphics2D) image.getGraphics();
    int sum=5;
     for(int i=0;i<sum;i++){
         int x1 = random.nextInt(width);
         int y1 = random.nextInt(height);
         int x2 = random.nextInt(width);
         int y2 = random.nextInt(height);
         graphics2D.setColor(randomColor());
         graphics2D.setStroke(new BasicStroke(1.5f));
         graphics2D.drawLine(x1, y1, x2, y2);
     }
    }
    public String getText() {
        return text;
    }

    public static void output(BufferedImage image, OutputStream out) throws IOException {
        ImageIO.write(image, "JPEG", out);
    }


}
