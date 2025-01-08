package org.atm;

public class ATM {

    private static final int DENOMINATION_FIVE = 5;
    private static final int DENOMINATION_TEN = 10;
    private static final int DENOMINATION_TWENTY = 20;
    private static final int DENOMINATION_FIFTY = 50;
    private static final int DENOMINATION_HUNDRED = 100;

    private static int fiveQuantity = 20;
    private static int tenQuantity = 10;
    private static int twentyQuantity = 5;
    private static int fiftyQuantity = 4;
    private static int hundredQuantity = 2;

    private static int atmBalance;

    public static void main(String[] args) {

        atmBalance();
        atmDeposit(1, 1, 1, 1, 1);
        atmDeposit(2, 2, 2, 2, 2);
        atmWithdrawal(1215);
        atmWithdrawal(200);
        atmDeposit(10, 10, 10, 10, 10);

    }

    private static void atmBalance() {
        atmBalance = DENOMINATION_FIVE * fiveQuantity + DENOMINATION_TEN * tenQuantity +
                DENOMINATION_TWENTY * twentyQuantity + DENOMINATION_FIFTY * fiftyQuantity +
                DENOMINATION_HUNDRED * hundredQuantity;
        System.out.println("ATM balance : " + atmBalance);
    }

    private static void atmDeposit(int fiveQ, int tenQ, int twentyQ, int fiftyQ, int hundredQ) {
        fiveQuantity = fiveQuantity + fiveQ;
        tenQuantity = tenQuantity + tenQ;
        twentyQuantity = twentyQuantity + twentyQ;
        fiftyQuantity = fiftyQuantity + fiftyQ;
        hundredQuantity = hundredQuantity + hundredQ;
        int deposit = DENOMINATION_FIVE * fiveQ + DENOMINATION_TEN * tenQ + DENOMINATION_TWENTY * twentyQ +
                DENOMINATION_FIFTY * fiftyQ + DENOMINATION_HUNDRED * hundredQ;
        System.out.println("The amount you deposited is : " + deposit);
        atmBalance();
    }

    private static void atmWithdrawal(int withdrawalAmount) {

        if (withdrawalAmount > atmBalance) {
            System.out.println("The amount of withdrawal exceeds the ATM balance. Try to input lower amount");
        } else {
            if (withdrawalAmount < DENOMINATION_FIVE) {
                System.out.println("The minimum amount to withdraw is " + DENOMINATION_FIVE + " rubles");
            } else {
                int withdrawRemains;

                withdrawRemains = hundredsWithdraw(withdrawalAmount);

                withdrawRemains = fiftiesWithdraw(withdrawRemains);

                withdrawRemains = twentiesWithdraw(withdrawRemains);

                withdrawRemains = tensWithdraw(withdrawRemains);

                fivesWithdraw(withdrawRemains);

                atmBalance();

            }
        }
    }

    private static void fivesWithdraw(int withdrawRemains) {
        int fiveQWithdraw;
        if (withdrawRemains / DENOMINATION_FIVE <= fiveQuantity) {
            fiveQWithdraw = withdrawRemains / DENOMINATION_FIVE;
            withdrawRemains = withdrawRemains - DENOMINATION_FIVE * fiveQWithdraw;
            fiveQuantity = fiveQuantity - fiveQWithdraw;
            System.out.println("5 rubles withdraw quantity : " + fiveQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        } else {
            fiveQWithdraw = fiveQuantity;
            fiveQuantity = 0;
            withdrawRemains = withdrawRemains - DENOMINATION_FIVE * fiveQWithdraw;
            System.out.println("5 rubles withdraw quantity : " + fiveQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        }
    }

    private static int tensWithdraw(int withdrawRemains) {
        int tenQWithdraw;
        if (withdrawRemains / DENOMINATION_TEN <= tenQuantity) {
            tenQWithdraw = withdrawRemains / DENOMINATION_TEN;
            withdrawRemains = withdrawRemains - DENOMINATION_TEN * tenQWithdraw;
            tenQuantity = tenQuantity - tenQWithdraw;
            System.out.println("10 rubles withdraw quantity : " + tenQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        } else {
            tenQWithdraw = tenQuantity;
            tenQuantity = 0;
            withdrawRemains = withdrawRemains - DENOMINATION_TEN * tenQWithdraw;
            System.out.println("10 rubles withdraw quantity : " + tenQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        }
        return withdrawRemains;
    }

    private static int twentiesWithdraw(int withdrawRemains) {
        int twentyQWithdraw;
        if (withdrawRemains / DENOMINATION_TWENTY <= twentyQuantity) {
            twentyQWithdraw = withdrawRemains / DENOMINATION_TWENTY;
            withdrawRemains = withdrawRemains - DENOMINATION_TWENTY * twentyQWithdraw;
            twentyQuantity = twentyQuantity - twentyQWithdraw;
            System.out.println("20 rubles withdraw quantity : " + twentyQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        } else {
            twentyQWithdraw = twentyQuantity;
            twentyQuantity = 0;
            withdrawRemains = withdrawRemains - DENOMINATION_TWENTY * twentyQWithdraw;
            System.out.println("20 rubles withdraw quantity : " + twentyQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        }
        return withdrawRemains;
    }

    private static int fiftiesWithdraw(int withdrawRemains) {
        int fiftyQWithdraw;
        if (withdrawRemains / DENOMINATION_FIFTY <= fiftyQuantity) {
            fiftyQWithdraw = withdrawRemains / DENOMINATION_FIFTY;
            withdrawRemains = withdrawRemains - DENOMINATION_FIFTY * fiftyQWithdraw;
            fiftyQuantity = fiftyQuantity - fiftyQWithdraw;
            System.out.println("50 rubles withdraw quantity : " + fiftyQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        } else {
            fiftyQWithdraw = fiftyQuantity;
            fiftyQuantity = 0;
            withdrawRemains = withdrawRemains - DENOMINATION_FIFTY * fiftyQWithdraw;
            System.out.println("50 rubles withdraw quantity : " + fiftyQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        }
        return withdrawRemains;
    }

    private static int hundredsWithdraw(int withdrawalAmount) {
        int withdrawRemains;
        int hundredQWithdraw;
        if (withdrawalAmount / DENOMINATION_HUNDRED <= hundredQuantity) {
            hundredQWithdraw = withdrawalAmount / DENOMINATION_HUNDRED;
            withdrawRemains = withdrawalAmount - DENOMINATION_HUNDRED * hundredQWithdraw;
            hundredQuantity = hundredQuantity - hundredQWithdraw;
            System.out.println("100 rubles withdraw quantity : " + hundredQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        } else {
            hundredQWithdraw = hundredQuantity;
            hundredQuantity = 0;
            withdrawRemains = withdrawalAmount - DENOMINATION_HUNDRED * hundredQWithdraw;
            System.out.println("100 rubles withdraw quantity : " + hundredQWithdraw);
            System.out.println("Withdrawal remains : " + withdrawRemains);
        }
        return withdrawRemains;
    }


}
