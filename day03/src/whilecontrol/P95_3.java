package whilecontrol;

public class P95_3 {

	public static void main(String[] args) { 
		//합과 평균을 구하시오  
		// 짝수만
		//80까지만 돌아라
		
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
	    	//80까지 계산하고 80이면 고만돌아
	    	if(i == 80) { 
				break;
			}
	    	i++; //아직 80안됐다면 하나 더하고 다시 올라가
	    	
	    }
	    
	    avg = (sum*1.0) / cnt;
	    System.out.printf("%d, %f \n", sum, avg);
	    System.out.println("End.."+cnt);

	}
	}

