/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("Cthulhu.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  // public static void testCollage()
//   {
//     Picture canvas = new Picture("640x480.jpg");
//     canvas.createCollage();
//     canvas.explore();
//   }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
    
    public static void testKeepOnlyBlue() {
      Picture ploop=new Picture("beach.jpg");
      ploop.explore();
      ploop.keepOnlyBlue();
      ploop.explore();
    }
    public static void testNegate() {
      Picture ploop=new Picture("Cthulhu.jpg");
      ploop.explore();
      ploop.negate();
      ploop.explore();
    }
    public static void testGrayScale() {
      Picture ploop=new Picture("Cthulhu.jpg");
      ploop.explore();
      ploop.grayScale();
      ploop.explore();
    }
    public static void testFixUnderwater() {
      Picture ploop=new Picture("water.jpg");
      ploop.explore();
      ploop.fixUnderwater();
      ploop.explore();
    }
  public static void main(String[] args)
  {
    /*
    Uncomment a call here to run a test and
    comment out the ones you don't want to run.
    */
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayScale();
    testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}