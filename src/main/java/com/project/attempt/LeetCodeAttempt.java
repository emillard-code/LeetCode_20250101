package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(maximumScoreAfterSplittingAString("011101"));
        System.out.println(maximumScoreAfterSplittingAString("00111"));
        System.out.println(maximumScoreAfterSplittingAString("1111"));

    }

    // This method will return the maximum score of the string as per challenge instructions.
    public static int maximumScoreAfterSplittingAString(String number) {

        // This int will contain the highest score obtained so far as we try
        // splitting the string at various different indexes.
        int highestCount = 0;

        // At each index, we split the string and count the score as per challenge instructions.
        // We start at index 1 instead of 0 so that the left side will always have at least one digit.
        for (int a = 1; a < number.length(); a++) {

            String leftNumber = number.substring(0, a);
            String rightNumber = number.substring(a);

            // We count the number of 0s on the left side and 1s on the right side by using
            // the .replaceAll function and counting the difference in string size before and after.
            int originalLeftLength = leftNumber.length();
            int zeroCount = originalLeftLength - leftNumber.replaceAll("0", "").length();

            int originalRightLength = rightNumber.length();
            int oneCount = originalRightLength - rightNumber.replaceAll("1", "").length();

            int totalCount = zeroCount + oneCount;

            if (totalCount > highestCount) {
                highestCount = totalCount;
            }

        }

        // We return the highest possible count once the entire string length has
        // been iterated through and every possible split had been tried.
        return highestCount;

    }

}
