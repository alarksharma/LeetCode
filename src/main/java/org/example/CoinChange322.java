package org.example;

public class CoinChange322 {
    int minCoin=-1;
    public int coinChange(int[] coins, int amount) {
        coinChange(coins,amount,0 );
        return minCoin;
    }

    public void coinChange(int[] coins, int amount,int coinNum) {
        if(amount==0){
            if(minCoin==-1){
                minCoin=coinNum;
            }
            minCoin=Math.min(minCoin,coinNum);
            return ;
        }
        else if (amount<0) {
            return ;
        }
        for(int i=0;i<coins.length;i++){
            coinChange(coins,amount-coins[i],coinNum+1 );
        }
    }
}
