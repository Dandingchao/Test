/*
 * Ant Group
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package Utils;

/**
 * @author
 * @version StringUtil.java, v 0.1 2021年09月13日 11:56 上午
 */
public class StringUtil {
    public static boolean isNullOrBlank(String string){
        if (string==null){
            return true;
        }
        for (int i =0;i<string.length();i++){
            if (string.charAt(i)!=' '){
                return false;
            }
        }
        return true;
    }

    public static boolean equal(String a, String b){
        if (a==null && b==null){
            return true;
        }
        else if(a==null){
            return false;
        }else if (b==null){
            return false;
        }
        else if (a.equals(b)){
            return true;
        }
        return false;
    }


    public static String rmBlank(String string){
        if (isNullOrBlank(string)){
            return string;
        }
        int head =0;
        int tail =string.length()-1;
        while (string.charAt(head)==' ') {
            head++;
        }
        while (string.charAt(tail)==' ') {
            tail--;
        }
        return string.substring(head,tail+1);
    }

    /**
     * 字符串符合ABA
     * @param string
     * @return
     */
    public static boolean isABA(String string){
        if (StringUtil.isNullOrBlank(string)){
            return false;
        }
        String target = rmBlank(string);
        int head = 0;
        int tail = target.length()-1;
        while (tail >= head){
            if (target.charAt(head)==target.charAt(tail)){
                head++;
                tail--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}