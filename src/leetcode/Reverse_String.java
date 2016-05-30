package leetcode;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class Reverse_String
{
    //反转字符串
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    //方法二
    /*public String reverseString(String s){
        if(s == null || s.length() == 0)
            return "";
        char[] cs = s.toCharArray();
        int begin = 0, end = s.length() - 1;
        while(begin <= end){
            char c = cs[begin];
            cs[begin] = cs[end];
            cs[end] = c;
            begin++;
            end--;
        }

        return new String(cs);
    }*/
}
