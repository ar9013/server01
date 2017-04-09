/**
 * Created by ar9013 on 4/9/17.
 */
import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        get("/hello", (request, response) -> "Hello Friend!");
    }
}
