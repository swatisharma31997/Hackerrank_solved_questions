 // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int s1_length = a.length();
        int s2_length = b.length();
        int total_length = s1_length+s2_length;
        int count =0, answer =0;
        char[] s1_array = a.toCharArray();
        char[] s2_array = b.toCharArray();
        if(s1_length > s2_length){
            for(int i=0;i<s1_length;i++){
                for(int j=0;j<s2_length;j++){
                    if(s1_array[i]==s2_array[j]){   
                        count++;
                         s2_array[j] =0;
                        break;
                    }
                 }
             }
            answer = s1_length - count;
        }
        else if(s1_length < s2_length){
            for(int i=0;i<s1_length;i++){
                for(int j=0;j<s2_length;j++){
                    if(s1_array[i]==s2_array[j]){   
                        count++;
                        s2_array[j] =0;
                        break;
                    }
                 }
             }
            answer = total_length -(2*count);
        }
        else {
            for(int i=0;i<s1_length;i++){
                for(int j=0;j<s2_length;j++){
                    if(s1_array[i]==s2_array[j]){   
                        count++;
                         s2_array[j] =0;
                        break;
                    }
                 }
             }
            answer = (s1_length-count)+(s2_length - count);
        }
        return(answer);

        }
