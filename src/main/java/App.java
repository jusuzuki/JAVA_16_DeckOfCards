import java.util.ArrayList;
// import java.util.Random;
// import java.io.*;
//
// import java.util.Map;
// import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // String layout = "templates/layout.vtl";
        //
        // get("/", (request, response) -> {
        //     Map<String, Object> model = new HashMap<String, Object>();
        //     model.put("template", "templates/home.vtl");
        //     return new ModelAndView(model, layout);
        // }, new VelocityTemplateEngine());

        Deck myDeck = new Deck();
        System.out.println(myDeck.displayDeck());
        // myDeck.shuffle();
        // System.out.println(myDeck.displayDeck());
        System.out.println();
        ArrayList<Card> hand = myDeck.deal(5);
        System.out.println(myDeck.displayHand(hand));
        System.out.println();
        System.out.println(myDeck.displayDeck());

    }
}
