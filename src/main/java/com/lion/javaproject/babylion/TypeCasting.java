package com.lion.javaproject.babylion;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println(1 + "1"); // 자동 형변환
        // 강제 형변환(명시적인) 데이터 유실이 생길 수 있음. 소수점 이하 사라짐.
        double dVal = 123.456;
        int iVal = (int)dVal;
        System.out.println(iVal);

        System.out.println(1 + Integer.parseInt("1"));
        //Float.parseFloat();
        //Double.parseDouble();
        // float  소수점 이하 일곱자리 까지 정확성
        // double 소수점 이하 열다섯자리 까지 정확성
        // BigDecimal << 더 많은 소수점
        String str1 = " 1.11111111 ";
        String str2 = " 2.11111111 ";
        double result = Double.parseDouble(str1) + Double.parseDouble(str2);
        System.out.println(result);

    }
}
