package com.amd.tool.dms.Bean;

import java.util.Random;

public class RandomUtil {
	
	public static final String ALLCHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	
	/** 
     * ����һ������������ַ���(ֻ������Сд��ĸ������) 
     *  
     * @return ����ַ��� 
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
