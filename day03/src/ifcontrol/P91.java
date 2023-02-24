package ifcontrol;

public class P91 {

	public static void main(String[] args) {
		 int a = 10; 
		 int b = 20; 
		 int c = 15;
		 
		 //세 수의 최대값과 최소값을 구하시오
		 //방법1
		 int max = 0;
		 int min = 0;
		 
		 if (a > b) {
			 max = a;
			 min = b;
			 if(a < c) {
				 max = c;
			} else {
				if(b > c) {
					min = c;
				}
			}
		 } else {
			max = b;
			min = a;
			if(b < c) {
				max = c;
			} else {
				if(a > c) {
					min = c;
				}
			}
		 }
		 
		 //방법2		 
		 // a>b) ? ((a>c)? a:c): (b>c)?b:c;
		 //  <        <            <     


		 /*
		 max = (a>b) ? ((b>c) ? a : (a>c)? a) : ()
					   (                    ) : ()
		
		
		 a>b>c    a>b b>c     1    a,c 
		 a>c>b        b<c a>c 2    a,b
		 b>a>c            a<c 5    b,c
		 b>c>a    a<b b>c a>c 3    b,a
		 c>a>b    		  a<c 4    c,b
		 c>b>a        b<c     6    c,a  
             
		 */
		 
		 
		//방법3 
		
		 /*
		 * if(a>b) { max = Math.max(a,c); min = Math.min(b,c); } else { max =
		 * Math.max(b,c); min = Math.min(a,c); }
		 */
		 
		 
		//숫자4개도 해보기
		 
		 
		System.out.printf("MAX : %d, MIN : %d", max, min);
	}

}
