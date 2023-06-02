import java.awt.*;
public class TESTawt {

 
    TESTawt(){
 
 Frame fm = new Frame();
 Button btn  =new Button("Hello World");
 Label lb = new Label("Welcom to java");
 fm.add(btn);
 fm.add(lb);
 fm.setSize(300,300);
 fm.setLayout(new FlowLayout());
 fm.setVisible(true);
 fm.setBackground(Color.blue);
 }
 public static void main(String[] args) {
    TESTawt a = new TESTawt();
 }
}




