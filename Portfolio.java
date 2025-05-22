import java.util.HashMap;

public class Portfolio {
private HashMap<String,Integer> stocks=new HashMap<>();
public void byStock(String stockName, int quantity) {
stocks.put(stockName,stocks.getOrDefault(stockName,0)+quantity);
System.out.println("Bought"+quantity+"of"+stockName);

}
public void sellStock(String stockName,int quantity) {
if(stocks.containsKey(stockName) && stocks.get(stockName)>=quantity ) {
stocks.put(stockName, stocks.get(stockName)-quantity);
System.out.println("sold"+ quantity+"of"+stockName);

}
else {
System.out.println("Not enough stock to sell");

}
}
public void viewPortfolio(HashMap<String,Stock>stockMarket) {
System.out.println("Your Portfolio");
for(String stockName:stocks.keySet()) {
int quantity= stocks.get(stockName);
double currentprice=stockMarket.get(stockName).getPrice();
System.out.println(stockName+" - " +quantity + " shares @ $"+currentprice );
}
}

}

