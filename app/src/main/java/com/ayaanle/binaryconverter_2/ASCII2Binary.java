package com.ayaanle.binaryconverter_2;

import java.nio.charset.StandardCharsets;

public class ASCII2Binary {
    private static void getBits(StringBuilder s_builder , byte b){
        for(int i = 0;i < 8;i++){
            s_builder.append((b & 128) == 0 ? 0 : 1);
            b <<=1;

        }

    }
    public static String to_Binary(String s){
        byte [] bytes = s.getBytes(StandardCharsets.US_ASCII);
        StringBuilder sb = new StringBuilder();
        for(byte b : bytes){
            getBits(sb , b);
        }
        return sb.toString().trim();

    }

}
