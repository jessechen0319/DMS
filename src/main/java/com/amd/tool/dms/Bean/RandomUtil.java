package com.amd.tool.dms.Bean;

import java.util.Random;

public class RandomUtil {
	
	public static final String ALLCHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	
	/** 
     * 返回一个定长的随机字符串(只包含大小写字母、数字) 
     *  
     * @return 随机字符串 
     */  
    public static String generateString() {  
        StringBuffer sb = new StringBuffer();  
        Random random = new Random();  
        for (int i = 0; i < 4; i++) {
            sb.append(ALLCHAR.charAt(random.nextInt(ALLCHAR.length())));
        }
        return sb.toString();
    }
    
    public static void main(String args[]) {
    	System.out.print(generateString());
    }
}
