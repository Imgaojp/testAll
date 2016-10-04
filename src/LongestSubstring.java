/**
 * Created by i on 2016/9/11.
 */
public class LongestSubstring {
        public static int lengthOfLongestSubstring(String s) {
            int len=s.length();
            int max=0;
            int length[]=new int[len];
            for(int i=0;i<s.length();i++){
                for(int j=i+1;j<s.length();j++){
                        if(s.charAt(i)==s.charAt(j)){
                            length[i]=j-i;
                            break;
                        }

                }
            }
            max=length[0];
            for(int i=0;i<s.length()-1;i++){
                max=length[i+1]>max?length[i+1]:max;
            }
            return max;
        }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
