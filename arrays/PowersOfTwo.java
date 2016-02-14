public class PowersOfTwo{

	public static void main(String[] args){
		double[] powersOfTwo = new double[]{1,2,4,8,16,32,64,128,256,512,1024,2048};
		double temp;
		long start = System.nanoTime();
		for(int i = 0;i<2000000;i++){
			temp = powersOfTwo[0];
			temp = powersOfTwo[1];
			temp = powersOfTwo[2];
			temp = powersOfTwo[3];
			temp = powersOfTwo[4];
			
			
			temp = powersOfTwo[5];
			temp = powersOfTwo[6];
			temp = powersOfTwo[7];
			temp = powersOfTwo[8];
			temp = powersOfTwo[9];
			temp = powersOfTwo[10];
		}
		long end = System.nanoTime();
		System.out.println("Lookup Table: " + (end-start) + " ns");
		
		start = System.nanoTime();
		for(int i = 0;i<2000000;i++){
			temp = Math.pow(2,0);	
			temp = Math.pow(2,1);
			temp = Math.pow(2,2);
			temp = Math.pow(2,3);
			temp = Math.pow(2,4);

			
			temp = Math.pow(2,5);
			temp = Math.pow(2,6);
			temp = Math.pow(2,7);
			temp = Math.pow(2,8);
			temp = Math.pow(2,9);
			temp = Math.pow(2,10);
		}
		end = System.nanoTime();
		System.out.println("Math.pow: " + (end-start) + " ns");
	}

}
