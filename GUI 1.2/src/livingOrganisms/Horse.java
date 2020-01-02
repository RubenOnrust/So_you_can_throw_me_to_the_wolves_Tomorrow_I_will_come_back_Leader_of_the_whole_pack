package livingOrganisms;

public class Horse extends Animal{
	//parameters exact numbers
		private static int initialPopulationSize=50;
		private static int r=3;
		private static double lambda;
		
		
		public  int getInitialPopulationSize() {
			return initialPopulationSize;
		}
		public void setInitialPopulationSize(int initialPopulationSize) {
			Horse.initialPopulationSize = initialPopulationSize;
		}
		public int getR() {
			return r;
		}
		public void setR(int r) {
			Horse.r = r;
		}
		public static double getLambda() {
			return lambda;
		}
		public static void setLambda(double lambda) {
			Horse.lambda = lambda;
		}
		
		public Horse() {
			
			// TODO Auto-generated constructor stub
		}
		

}
