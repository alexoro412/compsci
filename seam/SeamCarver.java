import java.awt.*;
import java.awt.color.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
public class SeamCarver{

	public BufferedImage readImage(String path){
		BufferedImage img = null;
		try{
			img = ImageIO.read(new File(path));
		}catch(IOException e){
			e.printStackTrace();
		}
		return img;
	}

	public BufferedImage grayOut(BufferedImage img){
		ColorConvertOp colorConvert = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
		colorConvert.filter(img, img);
		return img;
	}

	public void writeImage(BufferedImage img, String path, String extension){
		try{
			BufferedImage bi = img;
			File outputfile = new File(path);
			ImageIO.write(bi, extension, outputfile);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args){
		SeamCarver sc = new SeamCarver();
		String imagePath = "/Users/alexoro/Desktop/tower.png";
		String grayPath = "/Users/alexoro/Desktop/tower-gray.png";
		BufferedImage rawImage = sc.readImage(imagePath);
		BufferedImage grayedImage = sc.grayOut(rawImage);
		sc.writeImage(grayedImage,grayPath, "png");
	}

}
