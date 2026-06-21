class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int first = 0;
        int second = 0;
        
        ArrayList<Integer> res = new ArrayList<>();
        // Iterate Over Both Array
        while(first<a.length && second <b.length){
            // Skip Duplicate Logic
            if(first>0 && a[first]==a[first-1]){
                first++;
                continue;
            }
            
            if(second>0 && b[second]==b[second-1]){
                second++;
                continue;
            }
            
            if(a[first]<b[second]){
                res.add(a[first]);
                first++;
            }else if(a[first]>b[second]){
                res.add(b[second]);
                second++;
            }else{
                res.add(a[first]);
                first++;
                second++;
            }
        }
        
        // Remaining Elements
        while(first<a.length){
            if(first==0 || a[first]!=a[first-1]){
                res.add(a[first]);
            }
            first++;
        }
        
        while(second<b.length){
            if(second==0 || b[second]!=b[second-1]){
                res.add(b[second]);
            }
            second++;
        }
        
        
        return res;
        
    }
}


// Union of 2 Sorted Arrays