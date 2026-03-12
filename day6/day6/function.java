class Function {

    static int factorial(int n){
        
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        return fact;
    }

    static boolean checkPrime(int n){
        
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }System.out.println();
        }
        return;
    }

    public static void main(String[] args) {
        //Types of return value-same as datatype and
        //collection framework;
        
        int ans=factorial(5);
        System.out.println(ans);

        System.out.println(checkPrime(13));
        pattern(5);

    }
}
