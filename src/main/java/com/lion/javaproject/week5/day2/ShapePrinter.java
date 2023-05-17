package com.lion.javaproject.week5.day2;
    public abstract class ShapePrinter {
        public abstract String makeALine(int i);
//    {
//        return "*".repeat(i);
//    }

        public void repeat(int h) {
            for (int i = 1; i < h; i++) {
                System.out.println(makeALine(i));
            }
        }
        public static void main(String[] args) {
//        ShapePrinter rtp = new ShapePrinter();
//        rtp.repeat(5);
        }
    }