package com.lion.javaproject.week4;

import java.io.IOException;

public class HelloPrinter {
    // 파일에도 저장 하고 싶고
    // 콘솔에도 출력 하고 싶다
    printer2 printer;

    public HelloPrinter(printer2 printer) {
        this.printer = printer;
    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter()); // 인스턴스 생성
        hp.repeatMessage(5, "Hello"); // 호출
    }
}


