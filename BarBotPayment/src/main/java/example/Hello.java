package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class Hello {

    public String handleRequest(RequestClass event, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("received : " + event.getMessage());

        String output = "Hello, " + event.getMessage() + "!";
        return output;
    }

}