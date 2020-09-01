package com.zhijiu.taxmodule.vo;

/***
 * @classname Test
 * @description
 * @author wjx
 * @date 2020/9/1 8:56
 */
public class Solution {
    public int reverse(int x) {
        boolean z = true;
        if(x<0){
            z=false;
            x = -x;
        }
        int len = String.valueOf(x).length();
        long a = 0;
        for(int i=len-1; i>=0; i--){
            long pow1 = pow(10, i);
            long temp = pow(10, len-1-i);
            long o = (x/pow1)*temp;
            if(o/temp != x/pow1){
                return 0;
            }
            a = a + o;
            x -= ((x/pow1)*pow1);
        }
        if(a < pow(-2, 31) || a > pow(2, 31) -1){
            return 0;
        }
        if(!z){
            a=-a;
        }
        return (int)a;
    }
    public long pow(int a, int b){
        long m = 1;
        for(int i=0; i<b; i++){
            m*=a;
        }
        return m;
    }
}
