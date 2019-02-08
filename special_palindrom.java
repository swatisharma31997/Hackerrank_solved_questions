// Complete the substrCount function below.
    static long substrCount(int n, String s) {
        s = s.toLowerCase();
        long count = 0;
        for(int i=0;i<n;i++) {
            //char ch = s.charAt(i);
            int j = i+1;
            while(j<n && s.charAt(j)==s.charAt(i)) {
                count++; j++;
            }
            if(j<n) {      
                int mid = j;    
                j++;
                int equals = mid-i; 
                while(j<n && j<=mid+equals && s.charAt(j) == s.charAt(i)) { 
                    j++;
                }
                if(j-1-mid==mid-i) {
                    count++;
                }
            }
        }
        return count+n;
    }
