import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;



public class facedetector {

	public static void main(String args[])
	{
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		CascadeClassifier facedetector=new CascadeClassifier();
		facedetector.load("haarcascade_frontalface_alt.xml");
		
		Mat image=Imgcodecs.imread("D:\\divyesh_mirror.jpg");
		
		MatOfRect facedetections=new MatOfRect();
		facedetector.detectMultiScale(image, facedetections);
		
		for(Rect rect:facedetections.toArray())
		{
			Imgproc.rectangle(image, new Point(rect.x, rect.y),new Point(rect.x+rect.width,rect.y+rect.height),new Scalar(0, 255, 0));
		
		}
		
		String filename="output.jpg";
		Imgcodecs.imwrite("D:\\"+filename, image);
	}
}
