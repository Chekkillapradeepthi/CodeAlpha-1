import java.util.HashMap;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
HashMap<String, Stock>stockMarket=new HashMap<>();
stockMarket.put("AAPL",new Stock("AAPL",150.0));
stockMarket.put("GOOGL", new Stock("GOOGL",2800.0));
stockMarket.put("TSLA",new Stock("TSLA",720.0));
Portfolio myPortfolio=new Portfolio();
Scanner sc=new Scanner(System.in);
int choice;
do {
System.out.println("\n--- Stock Trading PlatForm----");
System.out.println("1.View Stock Prices");
System.out.println("2.Buy Stock");
System.out.println("3.Sell Stock");
System.out.println("4.View Portfolio");
System.out.println("0.Exist");
System.out.print("Enetr choice");
choice=sc.nextInt();
switch(choice) {
case 1:System.out.println(" Available Stocks");
for(String name:stockMarket.keySet()) {
Stock s= stockMarket.get(name);
System.out.println(s.getName()+"-$"+s.getPrice());


}
break;
case 2: System.out.print("Enter stockName to buy");
String buyName=sc.next();
if(stockMarket.containsKey(buyName)) {
System.out.print("Enter quantity:");
int qty=sc.nextInt();
myPortfolio.sellStock(buyName,qty);
}
else {
System.out.println("Stock not found");
}
break;
case 3:System.out.print("Enter stockName to sell");
String sellName=sc.next();
if(stockMarket.containsKey(sellName)) {
System.out.print("Enter quantity:");
int qty=sc.nextInt();
myPortfolio.byStock(sellName,qty);
}
else {
System.out.println("Stock not found");
}
break;
case 4: myPortfolio.viewPortfolio(stockMarket);
break;
case 0:System.out.println("Exiting");
break;
default:
System.out.println("Invalid option");
}

}
while(choice!=0);
sc.close();
}
}

