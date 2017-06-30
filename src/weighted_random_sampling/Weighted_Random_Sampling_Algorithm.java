package weighted_random_sampling;
import java.util.Random;


public class Weighted_Random_Sampling_Algorithm {
	

	public void Weighted_Random_select(int times, double[] weights){
		
		System.out.println("Test:");			
		
		System.out.println("Red weight:    "+ weights[0]);
		System.out.println("Blue weight:   "+ weights[1]);
		System.out.println("Yellow weight: "+ weights[2]);

		
		System.out.println("===================");
		        
		int[] count = new int[3];	
        for(int i = 0; i < times; i++) {
        	double random = new Random().nextDouble();
            double countWeight = 0;
	        for (int index = 0; index < weights.length; index++) {
	            countWeight += weights[index];
	            if (countWeight >= random){
	                count[index]++;
	                break;
	            }
	        }
        }
        
        System.out.println("Red count:    "+ count[0] + ",    " +100*count[0]/(double)times+"%");
		System.out.println("Blue count:   "+ count[1] + ",    " +100*count[1]/(double)times+"%");
		System.out.println("Yellow count: "+ count[2] + ",    " +100*count[2]/(double)times+"%");
	}
	
	public static void main(String[] args) {
		
		Weighted_Random_Sampling_Algorithm w = new Weighted_Random_Sampling_Algorithm();
		
		double[] weights = {0.20,0.30,0.50};
		
		w.Weighted_Random_select(10000, weights);

	}
	
	 

}
