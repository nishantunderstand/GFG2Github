class Solution {
    public ArrayList<Integer> primeFac(int N) {
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
    public ArrayList<Integer> getPrimeFactorsBruteForce(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                res.add(i);
            }
        }
        return res;
    }
    // Time Complexity: O(√N) | Space Complexity: O(1)
    public ArrayList<Integer> getPrimeFactorsOptimized(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) res.add(i);
                if (i != n / i && isPrime(n / i)) res.add(n / i);
            }
        }
        if (n > 1 && isPrime(n)) res.add(n); //<--
        return res;
    }
    // Time Complexity: O(N log log N) | Space Complexity: O(1)
    public ArrayList<Integer> getPrimeFactorsUsingSPF(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return res;
    }
    // Time Complexity: O(√N) | Space Complexity: O(1)
    public ArrayList<Integer> getPrimeFactorsUsingSPFMod(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1) res.add(n); //<--
        return res;
    }
    // Time Complexity: O(N log log N) | Space Complexity: O(N)
    public ArrayList<Integer> getPrimeFactorsUsingSieve(int n) {
        ArrayList<Integer> res = new ArrayList<>();
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
        return res;
    }
    // Time Complexity: O(N log log N) | Space Complexity: O(N)
    public ArrayList<Integer> getPrimeFactorsUsingSieveBoolean(int n) {
        ArrayList<Integer> res = new ArrayList<>();
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
        return res;
    }
}