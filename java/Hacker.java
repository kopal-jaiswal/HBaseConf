public class Hacker {
	public static void main(String[] args) {
		int A[] = {3,2,1};
		System.out.println(last_element(A));
		
	}
	static int last_element(int A[]) {
		for(int j=0; j<A.length-1; j++) {
			for(int i=0;i<A.length-1-j; i++) {
				A[i] = A[i]+A[i+1];
			}
			//System.out.println(A[0]+" "+A[1]+" "+A[2]+" "+A[3]+" "+A[4]);
			System.out.println(A[0]+" "+A[1]+" "+A[2]);

			
		}
		return A[0];
		
	}
	
	

}
