class Power {

    public static double power(double x, int n){
        long N = n; //to avoid overflow
        double result = 1;

        //Corner cases
        if(N == 0) return 1;
        if(N == 1) return x;
        if(x == 0 || x == 1) return x;

        if(N < 0){ 
            x = 1/x;
            N = -N;
        }

        while(N > 0){
            if(N % 2 == 1){
                result *= x;
            }
            x *= x;
            N = N/2;
        }
        return result;
    }

    public static void main(String args[]){
        double x = 0;
        int n = 3;

        System.out.println(power(x, n));
    }
}