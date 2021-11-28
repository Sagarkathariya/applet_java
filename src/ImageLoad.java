import java.applet.*;
import java.awt.*;

public class ImageLoad extends Applet{
Image picture;
    public void paint (Graphics g){
        picture =getImage(getDocumentBase(),"img.jpg");
        g.drawImage(picture, 60, 100, this);
    }
}