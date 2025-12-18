import java.awt.Color;

/**
 * Demonstrates the morphing operation featured by Runigram.java.
 * The program recieves two command-line arguments: a string representing the
 * name
 * of the PPM file of a source image, and the number of morphing steps (an
 * integer).
 * For example:
 * java Editor4 ironman.ppm 50
 * This action transforms the colored Ironman image into a black and white
 * version.
 */
public class Editor4 {

    public static void main(String[] args) {
        // 1. Get the arguments
        String sourceFile = args[0];
        int n = Integer.parseInt(args[1]);

        // 2. Read the source image
        Color[][] sourceImage = Runigram.read(sourceFile);

        // 3. Create the target image (the grayscale version of the source)
        Color[][] targetImage = Runigram.grayScaled(sourceImage);

        // 4. Set the canvas to the size of the source image
        Runigram.setCanvas(sourceImage);

        // 5. Morph the source into the target
        Runigram.morph(sourceImage, targetImage, n);
    }
}