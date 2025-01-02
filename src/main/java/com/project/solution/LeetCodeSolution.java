package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        System.out.println(maximumScoreAfterSplittingAString("011101"));
        System.out.println(maximumScoreAfterSplittingAString("00111"));
        System.out.println(maximumScoreAfterSplittingAString("1111"));

    }

    public static int maximumScoreAfterSplittingAString(String number) {

        int solution = 0;

        for (int i = 0; i < number.length() - 1; i++) {

            int current = 0;

            for (int j = 0; j <= i; j++) {
                if (number.charAt(j) == '0') { current++; }
            }

            for (int j = i + 1; j < number.length(); j++) {
                if (number.charAt(j) == '1') { current++; }
            }

            solution = Math.max(solution, current);

        }

        return solution;

    }

}
