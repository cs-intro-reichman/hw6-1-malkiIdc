import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java.
 * The program receives three command-line arguments: a string representing the
 * name
 * of the PPM file of a source image, and two integers that specify the width
 * and the
 * height of the scaled, target image. For example:
 * java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main(String[] args) {
		// 1. Get the arguments
		String fileName = args[0];
		int width = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);

		// 2. Read the source image
		Color[][] imageIn = Runigram.read(fileName);

		// 3. Scale the image
		Color[][] imageOut = Runigram.scaled(imageIn, width, height);

		// 4. Display the source image
		Runigram.setCanvas(imageIn);
		Runigram.display(imageIn);
		// Runigram.print(imageIn); // Uncomment for debugging small images

		// 5. Pause for 3 seconds (3000 milliseconds)
		StdDraw.pause(3000);

		// 6. Display the scaled image
		Runigram.setCanvas(imageOut);
		Runigram.display(imageOut);
		// Runigram.print(imageOut); // Uncomment for debugging small images
	}
}