import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello %s its lovely to see you ",name) ;
    }
    
    public String dateAnnouncement() {
        Date currentTime = new Date();
        return String.format("it is currently %s", currentTime);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.contains("Alexis")){
            return "OH She'd certainly know better than I.";
        }
        else if (conversation.contains("Alfred")){
            return "At your service. As you wish, naturally";

        }
        return "Right. And with that I shall retire";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}