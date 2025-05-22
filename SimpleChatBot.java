

import java.util.Scanner;

public class SimpleChatBot {
public static String getResponse(String input) {
input =input.toLowerCase();
if(input.contains("hello")||input.contains("hi")) {
return "Hello! How can I Help you today";

}
else if(input.contains(" how are you")) {
return " iam just a program, but iam doing well";
}
else if(input.contains("name")) {
return "Iam chatbot,your friendly assistant";
}
else if(input.contains("bye")) {
return " Bye! have a Great Day";
}
else if(input.contains("thanks")||input.contains("Thank you")) {
return "Your are welcome!";

}
else {
return "Sorry. I dont understand thay.Can you rephrase?";
}

}
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println(" Hello! Iam chatbot.Type 'bye' to exist");
while(true) {
System.out.print("you");
String userInput=scanner.nextLine();
if(userInput.equalsIgnoreCase("bye")) {
System.out.println("chatbot"+getResponse(userInput));
break;
}
System.out.println("charbot"+getResponse(userInput));

}
scanner.close();
}

   
}
