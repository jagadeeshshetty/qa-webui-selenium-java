package com.jc.aim.algo;

public class FindNthPower {
    static long pow(int X, int N) {
        // Base case
        if (N == 0)
            return 1;

        // Trust the function provide X^(N-1) value. Until N becomes 0.
        long partialAns = pow(X, N - 1); // O(n)

        // Finding X^N can break as follows
        // X * X^(N-1) * X^(N-2) ... till X^0
        // Ex: 5^2
        // 5 * 5^1 * 5^0
        // 5 * 5 * 1
        // Result: 25
        return X * partialAns;
    }

    /**
     * This is a Java function that calculates the power of a number in an efficient
     * way using recursion.
     * <p>
     * 1. The function powEfficient takes two parameters: X (the base) and N (the
     * exponent).
     * <p>
     * 2. The function starts with a base case that checks if the exponent N is
     * equal to 0. If N is 0, it means the power of any number to the exponent 0 is
     * 1, so the function returns 1.
     * <p>
     * 3. If the base case is not satisfied (i.e., N is not 0), the function
     * recursively calls itself with the base X and the exponent divided by 2 (N /
     * 2). This recursive call is used to calculate X raised to the power of N/2.
     * The result of this calculation is stored in the variable tmp.
     * <p>
     * 4. After getting the result of X raised to the power of N/2, the code checks
     * if
     * the exponent N is odd or even. This is done by checking the remainder when N
     * is divided by 2 (N % 2). If the remainder is 1, it means N is odd.
     * <p>
     * 5. If N is odd, the code multiplies tmp (which represents X raised to the
     * power
     * of N/2) by itself (tmp * tmp) and then multiplies the result by the base X
     * (tmp * tmp * X). This step accounts for the odd power, where an additional
     * multiplication by X is required.
     * <p>
     * 6. If N is even, the code multiplies tmp by itself (tmp * tmp). This step
     * accounts for the even power, where no additional multiplication by the base X
     * is required.
     * <p>
     * 7. Finally, the calculated result is returned.
     * <p>
     * To summarize, the code recursively calculates the power of a number by
     * dividing the exponent by 2 and using the calculated value to efficiently
     * compute the result by squaring. If the exponent is odd, an additional
     * multiplication by the base is performed. This approach reduces the number of
     * multiplications needed to calculate the power, making it more efficient
     * compared to the straightforward iterative approach.
     *
     * @param X an integer representing the base value of the power function.
     * @param N The power to which X is raised.
     * @return the value of X raised to the power of N using an efficient recursive
     * algorithm.
     */
    static long powEfficient(int X, int N) {
        // Base case
        if (N == 0)
            return 1;

        // Trust the function which provide X^(N/2) value. Until N becomes 0.
        long tmp = powEfficient(X, N / 2);

        /**
         * If the power is odd, multiply with X.
         *
         * Let's provide a more accurate explanation of why an additional multiplication
         * by the base is required when the exponent is odd.
         *
         * When calculating the power of a number, the basic idea is to repeatedly
         * multiply the base (X) by itself for the given exponent (N). For example, if
         * we want to calculate X raised to the power of 5 (X^5), we would multiply X by
         * itself four times: X * X * X * X * X.
         *
         * In the given code, the function powEfficient utilizes a recursive approach to
         * efficiently compute the power. It breaks down the problem into smaller
         * subproblems by dividing the exponent in half at each step.
         *
         * Now, let's focus on the specific case when the exponent is odd. For instance,
         * suppose we want to calculate X raised to the power of 5 (X^5).
         *
         * The function first recursively calculates X raised to the power of 2 (X^2) by
         * calling powEfficient(X, N / 2).
         *
         * The result of X^2 is stored in the variable tmp.
         *
         * Since the exponent (N) is odd (5 is odd), we need to account for the
         * additional multiplication by the base X. This is because when we calculate X
         * raised to an odd power, we can split it into two parts: X raised to the power
         * of N/2 (in this case, 2) and an extra multiplication by X. So, the expression
         * becomes (X^2) * (X^2) * X.
         *
         * In the code, tmp * tmp calculates (X^2) * (X^2), which represents X raised to
         * the power of 4.
         *
         * Finally, we multiply tmp * tmp * X, which yields the desired result: (X^2) *
         * (X^2) * X = (X^4) * X = X^5.
         *
         * Therefore, when the exponent is odd, an additional multiplication by the base
         * (X) is required to obtain the correct result. This ensures that the exponent
         * is correctly incorporated into the calculation, and the final result reflects
         * the desired power of the base.
         */
        if (N % 2 == 1)
            return tmp * tmp * X;
        // If power is even.
        return tmp * tmp;
    }
}
