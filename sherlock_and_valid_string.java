// Complete the isValid function below.
    static String isValid(String s) {
        int n = s.length();
        
        int[] count = new int[26];
        boolean flag = false;
        for(int i =0;i<n;i++){
            count[s.charAt(i)-'a']++;
        }
        Arrays.sort(count);
        int i=0;
        while(count[i]==0)
            i++;
        int min = count[i];
        int max = count[25];
        String res = "NO";
        if(min==max)
            res = "YES";
        else
            if(((max - min == 1) && (max > count[24])) ||
            (min == 1) && (count[i+1] == max))
            res = "YES";
        return res;
    }