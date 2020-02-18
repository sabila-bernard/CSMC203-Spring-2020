import java.util.Scanner;
public class SphereVolume {
	
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Sphere Volume Calculator");
		System.out.print("Please enter the diameter of sphere in centimeters: ");
		double userDiameter = user.nextDouble();
		double radius = userDiameter/2.0;
		double volumeSphere = (4.0/3.0)* Math.PI * Math.pow(radius, 3.0);
		System.out.println("The volume of the sphere is: "+ volumeSphere);
	}

}
