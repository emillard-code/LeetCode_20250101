package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(maximumScoreAfterSplittingAString("011101"));
        System.out.println(maximumScoreAfterSplittingAString("00111"));
        System.out.println(maximumScoreAfterSplittingAString("1111"));

    }

    public static int maximumScoreAfterSplittingAString(String number) {

        int highestCount = 0;

        for (int a = 1; a < number.length(); a++) {

            String leftNumber = number.substring(0, a);
            String rightNumber = number.substring(a);

            int originalLeftLength = leftNumber.length();
            int zeroCount = originalLeftLength - leftNumber.replaceAll("0", "").length();

            int originalRightLength = rightNumber.length();
            int oneCount = originalRightLength - rightNumber.replaceAll("1", "").length();

            int totalCount = zeroCount + oneCount;

            if (totalCount > highestCount) {
                highestCount = totalCount;
            }

        }

        return highestCount;

    }

}
