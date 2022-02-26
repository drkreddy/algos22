// package sliding;

import java.util.HashMap;
import java.util.Map;

public class LongSubStrWithDistinctKChar {
    public static void main(String[] args) {
        
        String str="araaaci";
        int k=2;
        System.out.println(GetLongestSubStr(str, k));
        
    }

    private static Integer GetLongestSubStr(String str, int k) {
        int start=0,end,longest=0;

        Map<Character,Integer> m=new HashMap<>();
        for (end=0;end<str.length();end++){
            Character c=str.charAt(end);
            Integer val  =m.get(c);
            if (null==val){
                m.put(c,1);
            }else{
                m.put(c,val+1);
            }


            if(m.keySet().size()<=k){
                if(longest<end-start+1){
                    longest=end-start+1;
                }

            }else{
                Character sc=str.charAt(start);

               Integer sVal= m.get(sc);
                sVal--;
                if(sVal==0){
                    m.remove(sc);
                }
                start++;

            }
        }
        return longest;
    }
}
