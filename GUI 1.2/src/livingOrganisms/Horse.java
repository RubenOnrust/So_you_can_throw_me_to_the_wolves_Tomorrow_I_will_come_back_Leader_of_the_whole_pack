package livingOrganisms;

public class Horse extends Animal{
	//paramers exact numbers
		private static int initialPopulationSize=50;
		private static int r=3;
		
		
		
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
		
		
		public Horse() {
			
			// TODO Auto-generated constructor stub
		}
		

}
