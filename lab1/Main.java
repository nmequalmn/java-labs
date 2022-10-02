public class Main{
 
    public static void main(String[] args){
        int[] h = new int[11];
        for(int i = 0; i < 11; ++i){
            h[i]=i+6;
            
        }
        float[] x = new float[17];
        for(int i = 0; i < 17; ++i){
            x[i] = ((float)Math.random())*18-15;
            
        }
        
        double [][] a = new double[11][17];
        for (int i = 0; i < 11; i++){
            for (int j  = 0; j < 17; j++){
                if(h[i]==9){
                    a[i][j]= Math.atan(Math.cos( Math.sin(x[j]) * (0.25D - Math.tan(x[j])) ));
                }
                else if (h[i] == 6 || h[i] == 11 || h[i] == 12 || h[i] == 13 || h[i] == 15){
                    a[i][j] = Math.atan(1.0D / ( Math.exp( 4* Math.pow(Math.abs(x[j])/5, 4) ) ) );
                }
                else{
                    a[i][j]= Math.pow(Math.exp( Math.cos( Math.pow(x[j]/2.0D,x[j]) ) - 0.5D), Math.exp(Math.asin(1.0D/Math.exp(Math.abs(x[j])))) );
                }
            }
        }
 
        for (int i = 0; i < 11; i++){
            for (int j  = 0; j < 17; j++){
                System.out.printf("%.2f ", a[i][j]);
            }
            System.out.printf("%n");
        }
    }
 
}