import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        printNTimes(n);       
    }
    
    public static void printNTimes(int n){
        if(n==0) return;
        
        System.out.print("GFG ");
        printNTimes(n-1);
    }
}

// Print GFG n times
