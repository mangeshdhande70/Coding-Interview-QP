
/**
 Problem Statement: Stock Buy and Sell for Maximum Profit
 📘 Description:

 You are given an array of integers where each element represents the price of a stock on a particular day.
 Your task is to determine the best day to buy and the best day to sell the stock to achieve the maximum possible profit.

 You may only complete one transaction — buy once and sell once.
 If no profit can be made, output “No Profit”.
 */
public class StockProfit {

    public static void main(String[] args) {

        int[] stockPrices = {10,30,30,50,30,35,50,70,90,100,10,90};
        calculateMaxProfitWithSellDayAndBuyDay(stockPrices);
    }

    public static void calculateMaxProfitWithSellDayAndBuyDay(int[] stockPrices){

        int minPrice = stockPrices[0];
        int maxProfit = 0;
        int buyDay = 1;
        int sellDay = 1;
        int minDay = 1;

        for (int i = 1; i < stockPrices.length ; i++) {
            if(stockPrices[i] < minPrice){
                minPrice = stockPrices[i];
                minDay = i + 1;
            }else {
                int profit = stockPrices[i] - minPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                    buyDay = minDay;
                    sellDay = i + 1;
                }
            }
        }

        if(maxProfit > 0) {
            System.out.println("Buy Day :: "+buyDay +" & Buy Price is :: "+stockPrices[buyDay - 1]);
            System.out.println("Sell Day :: "+sellDay +" & Sell Price is :: "+stockPrices[sellDay - 1]);
            System.out.println("Max Profit is :: " + maxProfit);
        }
        else {
            System.out.println("No Profit");
        }
    }
}
