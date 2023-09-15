
public class AparetmentPainter {
	public static void main(String[] args) {
		double paint = 400;
		double primer = 300;
		double paintGallon = 34.99;
		double primerGallon = 24.49;
		double ceilingHeight = 10;
		double longWalls = 32.75;
		double narrowWalls = 25.62;
		double windowWide = 14.4;
		double windowTall = 5.5;
		double doorWide = 3.25;
		double doorTall = 8;
		
		
		// calculations for the area and prices
		double windowArea = (windowWide * windowTall);
		double doorArea = (doorTall * doorWide);
		double wallArea = ceilingHeight * 2 * (longWalls + narrowWalls) - doorArea - windowArea;
		double ceilingArea = (longWalls * narrowWalls);
		double totalArea = (wallArea + ceilingArea) * 8;
		double paintAmount = Math.ceil(totalArea / paint);
		double primerAmount = Math.ceil(totalArea / primer);
		double paintCost = paintAmount * paintGallon;
		double primerCost = primerAmount * primerGallon;
		double totalCost = paintCost + primerCost;
		
		// Print statements 
		System.out.println("**********************************************************");
		System.out.printf("%-25s%14.2f\n", "Wall area per unit", wallArea );
		System.out.printf("%-25s%14.2f\n", "Ceiling area per unit", ceilingArea  );
		System.out.printf("%-25s%10.2f\n", "Total area to paint and prime", totalArea );
		System.out.printf("You must purchase %.0f gallons of paint for %.2f\n", paintAmount, paintCost);
		System.out.printf("You must purchase %.0f gallons of primer for %.2f\n", primerAmount, primerCost);
		System.out.printf("%-25s%8.2f\n", "Your total cost to paint and prime all units is", totalCost );
		System.out.println("**********************************************************");
		
	}
}
