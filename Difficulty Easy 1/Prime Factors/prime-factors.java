//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution {
    public int[] AllPrimeFactors(int N) {
        //return getPrimeFactorsBruteForce(N);
        //return getPrimeFactorsOptimized(N);
        //return getPrimeFactorsUsingSPF(N);
        //return getPrimeFactorsUsingSPFMod(N);
        //return getPrimeFactorsUsingSieve(N);
        return getPrimeFactorsUsingSieveBoolean(N);

    }

    // Time Complexity: O(√N) | Space Complexity: O(1)
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Time Complexity: O(N) | Space Complexity: O(N)
    private int[] listToArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    // Time Complexity: O(N log N) | Space Complexity: O(1)
    public int[] getPrimeFactorsBruteForce(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                res.add(i);
            }
        }
        return listToArray(res);
    }

    // Time Complexity: O(√N) | Space Complexity: O(1)
    public int[] getPrimeFactorsOptimized(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) res.add(i);
                if (i != n / i && isPrime(n / i)) res.add(n / i);
            }
        }
        if (n > 1 && isPrime(n)) res.add(n); //<--
        return listToArray(res);
    }

    // Time Complexity: O(N log log N) | Space Complexity: O(1)
    public int[] getPrimeFactorsUsingSPF(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return listToArray(res);
    }

    // Time Complexity: O(√N) | Space Complexity: O(1)
    public int[] getPrimeFactorsUsingSPFMod(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1) res.add(n); //<--
        return listToArray(res);
    }

    // Time Complexity: O(N log log N) | Space Complexity: O(N)
    public int[] getPrimeFactorsUsingSieve(int n) {
        List<Integer> res = new ArrayList<>();
        int[] spf = new int[n + 1];
        for (int i = 2; i <= n; i++) spf[i] = i;

        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) { 
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }

        while (n != 1) {
            if (!res.contains(spf[n])) res.add(spf[n]);
            n /= spf[n];
        }
        return listToArray(res);
    }

    // Time Complexity: O(N log log N) | Space Complexity: O(N)
    public int[] getPrimeFactorsUsingSieveBoolean(int n) {
        List<Integer> res = new ArrayList<>();
        boolean[] isPrime = new boolean[n + 1];
        int[] spf = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) { 
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }

        while (n != 1) {
            if (!res.contains(spf[n])) res.add(spf[n]);
            n /= spf[n];
        }

        return listToArray(res);
    }
}