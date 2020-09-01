package com.zhijiu.taxmodule.vo;

/***
 * @classname Test
 * @description
 * @author wjx
 * @date 2020/9/1 10:51
 */
public class Test {
    public static void main(String[] args){
        int count =  27;
        decimalToBinary(count);
        decimalToOctal(count);
        decimalToHexa(count);

        String binary = "1011";
        binaryToDecimal(binary);

        String octal = "37";
        octalToDecimal(octal);

        String hexa = "2A";
        hexaToDecimal(hexa);
    }

    /**
     * 十进制转二进制
     * @param count
     * @return
     */
    public static String decimalToBinary(int count){
        String binary = "";
        while (count>=2){
            binary = count % 2 + binary;
            count = count/2;
        }
        binary = count + binary;
        System.out.println(binary);
        return binary;
    }

    /**
     * 十进制转八进制
     * @param count
     * @return
     */
    public static String decimalToOctal(int count){
        String octal = "";
        while (count>=8){
            octal = count % 8 + octal;
            count = count/8;
        }
        octal = count + octal;
        System.out.println(octal);
        return octal;
    }

    /**
     * 十进制转十六进制
     * @param count
     * @return
     */
    public static String decimalToHexa(int count){
        String hexadecimal = "";
        while (count>=16){
            int divide = count % 16;
            if(divide>9){
                divide = divide + 55;
            }
            hexadecimal = (char)divide + hexadecimal;
            count = count/16;
        }
        hexadecimal = count + hexadecimal;
        System.out.println(hexadecimal);
        return hexadecimal;
    }

    /**
     * 二进制转十进制
     * @param binary
     * @return
     */
    public static int binaryToDecimal(String binary){
        int decimal = 0;
        for(int i = 0; i < binary.length(); i++){
            int temp = Integer.parseInt(String.valueOf(binary.charAt(i)));
            if(temp>=2){
                throw new RuntimeException("数字错误");
            }
            decimal +=  temp * Math.pow(2, binary.length()-i-1);
        }
        System.out.println(decimal);
        return decimal;
    }

    /**
     * 八进制转十进制
     * @param octal
     * @return
     */
    public static int octalToDecimal(String octal){
        int decimal = 0;
        for(int i = 0; i < octal.length(); i++){
            int temp = Integer.parseInt(String.valueOf(octal.charAt(i)));
            if(temp>=8){
                throw new RuntimeException("数字错误");
            }
            decimal +=  temp * Math.pow(8, octal.length()-i-1);
        }
        System.out.println(decimal);
        return decimal;
    }

    /**
     * 十六进制转十进制
     * @param hexa
     * @return
     */
    public static int hexaToDecimal(String hexa){
        int decimal = 0;
        for(int i = 0; i < hexa.length(); i++){
            char m = hexa.charAt(i);
            int temp = 0;
            if(m >=48 && m<= 57){
                temp = ((int)m) - 48;
            }else if(m >= 65 && m <=90 ){
                temp = ((int)m) -55;
            }else{
                throw new RuntimeException("数字错误");
            }
            if(temp>=16){
                throw new RuntimeException("数字错误");
            }
            decimal +=  temp * Math.pow(16, hexa.length()-i-1);
        }
        System.out.println(decimal);
        return decimal;
    }
}