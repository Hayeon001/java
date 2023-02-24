package whilecontrol;

public class P95 {

	public static void main(String[] args) { 
		//합과 평균을 구하시오  
		// 짝수만
		
		int sum = 0;
		double avg = 0.0;
		
	    System.out.println("Start.."); 
	    int cnt = 0;
	    
	    int i =1;
	    while(i <= 100) { 
	    	if(i%2 ==0) {
	    		sum += i;
		    	cnt++;
	    	}
	    	
	    	i++;
	    }
	    
	    avg = (sum*1.0) / cnt;
	    System.out.printf("%d, %f \n", sum, avg);
	    System.out.println("End.."+cnt);

	}
}