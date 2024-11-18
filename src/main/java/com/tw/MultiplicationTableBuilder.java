package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public String build(int startNum, int endNum) {
        if (!isInputValid(startNum, endNum)) {
            return null;
        } else {
            return printMultiplicationTable(startNum, endNum);
        }
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

    public static String generateMultiplicationLine(int num, int startNum) {
        StringBuilder sb = new StringBuilder();
        for (int j = startNum; j <= num; j++) {
            sb.append(j).append("*").append(num).append("=").append(num * j);
            if (j != num) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String printMultiplicationTable(int startNum, int endNum) {
        StringBuilder sb = new StringBuilder();
        for (int i = startNum; i <= endNum; i++) {
            sb.append(generateMultiplicationLine(i, startNum)).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
