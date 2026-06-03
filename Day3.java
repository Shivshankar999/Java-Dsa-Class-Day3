public class Day3 {
    public static int reverseInt(int n){
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
    public static void findPaindrome(int n){
        int ori=n;
        
        int rev=reverseInt(n);

        if(ori==rev){
            System.err.println("Yes its palindome Number");
        }
        else{
            System.err.println("No its palindome Number");
        }
    }

    public static void armStrongNumber(int n){
        int ori=n;

        int cnt=0;
        while (n != 0) {
            int rem = n % 10;
            cnt++;
            n = n / 10;
        }

        n=ori;
        int sum=0;

        while (n != 0) {
            int rem = n % 10;
            sum+=Math.pow(rem, cnt);
            n = n / 10;
        }

        if(ori==sum){
            System.err.println("Yes it is armStrong Number");
        }
        else{
            System.err.println("No it is not a armStrong Number");
        }
    }
    public static void main(String[] args) {
        // palindome number
        int n=121;
        findPaindrome(n);

        // armStrong Number(for 3 and 4 and more length digit)
        int n=1634;
        armStrongNumber(n);
        
        // do while
        int i=1;
        do{
            System.err.println("hello java");
            i++;
        }
        while(i<=5);

        // nested loop -> pattern printing

        // * * * *
        // * * * *
        // * * * *
        // * * * *

        int n=4;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*"+" ");
            }
            System.err.println();
        }

        // * * * *
        // * * *
        // * *
        // * 
        
        int n=4;
        for(int i=0; i<n; i++){
        for(int j=0; j<n-i; j++){
        System.out.print("*"+" ");
        }
        System.err.println();
        }
        
        // *
        // * *
        // * * *
        // * * * *

        int n=4;
        for(int i=0; i<n; i++){
        for(int j=0; j<=i; j++){
        System.out.print("*"+" ");
        }
        System.err.println();
        }

    }
}
