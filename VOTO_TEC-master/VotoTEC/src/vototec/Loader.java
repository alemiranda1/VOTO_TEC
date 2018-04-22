package vototec;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;



public class Loader {
        
    //Metodo para cargar las imagenes
    public static BufferedImage ImageLoader(String path){
        try {
                return ImageIO.read(Loader.class.getResource(path));
        } catch (IOException e) {
                e.printStackTrace();
        }
        return null;
    }
	
}
