package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }

    public static boolean isEndNumLargerThanStartNum(int startNum, int endNum) {
        return endNum > startNum;
    }

    public static boolean isInRange(int startNum, int endNum) {
        return (startNum >= 1 && startNum <= 1000) && (endNum >= 1 && endNum <= 1000);
    }

    public static boolean isInputValid(int startNum, int endNum) {
        return isEndNumLargerThanStartNum(startNum, endNum) && isInRange(startNum, endNum);
    }
}
