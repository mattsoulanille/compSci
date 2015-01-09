import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  public void keepOnlyBlue()
  {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels) {
	  for (Pixel pixelObj : rowArray) {
	      pixelObj.setRed(0);
	      pixelObj.setGreen(0);
	  }
      }
  }

  public void negate()
  {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels) {
	  for (Pixel pixelObj : rowArray) {
	      pixelObj.setRed(255 - pixelObj.getRed());
	      pixelObj.setGreen(255 - pixelObj.getGreen());
	      pixelObj.setBlue(255 - pixelObj.getBlue());
	  }
      }
  }

  public void grayscale()
  {
      int average;
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels) {
	  for (Pixel pixelObj : rowArray) {
	      average = (int) (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
	      pixelObj.setRed(average);
	      pixelObj.setGreen(average);
	      pixelObj.setBlue(average);
	  }
      }
  }


  public void fixUnderWater()
  {
      int contrast = 4;
      int average;
      int change;
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels) {
	  for (Pixel pixelObj : rowArray) {
	      average = (int) (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
	      change = average * 3/10;
	      pixelObj.setRed(((pixelObj.getRed() + 2*change) - average) * contrast + average);
	      pixelObj.setGreen(((pixelObj.getGreen() - change) - average) * contrast + average);
	      pixelObj.setBlue(((pixelObj.getBlue() - change) - average) * contrast + average);
	  }
      }
  }


  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }

  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int y = 0; y < height / 2; y++)
    {
      for (int x = 0; x < pixels[0].length; x++)
      {
	topPixel = pixels[y][x];
        bottomPixel = pixels[height - 1 - y][x];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }

  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int y = 0; y < height / 2; y++)
    {
      for (int x = 0; x < pixels[0].length; x++)
      {
	topPixel = pixels[y][x];
        bottomPixel = pixels[height - 1 - y][x];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }

  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    double width = pixels[0].length;
    double height = pixels.length;
    double slope = -1 * height / width;
    double opposate = -1 * 1 / slope;
    for (int x = 0; x < pixels[0].length; x++)
    {
      for (int y = 0; y < slope * x * -1; y++)
      {
	bottomPixel = pixels[y][x];
        topPixel = pixels[y][x];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }

    
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
	count ++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
    // start is top left corner, end is bottom right corner
    public void mirrorBox(int[] start, int[] end, int side) {
	Pixel copyPixel = null;
	Pixel pastePixel = null;
	Pixel[][] pixels = this.getPixels2D();
	int[] mirrorLine = null;
	if (side == 0)
	    mirrorLine = new int[] {0, end[1]};
	if (side == 1)
	    mirrorLine = new int[] {start[0], 0};
	if (side == 2)
	    mirrorLine = new int[] {0, start[1]};
	if (side == 3)
	    mirrorLine = new int[] {end[0], 0};
	for (int y = start[0]; y <= end[0]; y++) {
	    for (int x = start[1]; x <= end[1]; x++) {
		copyPixel = pixels[y][x];
		pastePixel = pixels[Math.abs(2*mirrorLine[0] - y)][Math.abs(2*mirrorLine[1] - x)];
		pastePixel.setColor(copyPixel.getColor());
	    }
	}
    }
    public void mirrorArms() {
	int[] start1 = new int[] {155, 104};
	int[] end1 = new int[] {192, 169};
	mirrorBox(start1, end1, 3);
	int[] start2 = new int[] {170, 238};
	int[] end2 = new int[] {196, 294};
	mirrorBox(start2, end2, 3);
    }
    public void mirrorGull() {	
	int[] start1 = new int[] {232, 236};
	int[] end1 = new int[] {321, 341};
	mirrorBox(start1, end1, 0);
    }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
