package Abstraction;

public class Main {
    public static void main(String[] args) {
        var browser = new Browser();
        browser.navigate("...");

/*      need to only access to navigate function because of that we made other functions private
        reduce the coupling, so we don't have access to unnecessary functions */
    }
}
