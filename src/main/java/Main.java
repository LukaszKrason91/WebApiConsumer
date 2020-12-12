import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {


    public static void main(String[] args) {

        MathService mathService = new MathService();
        try {
            String math = mathService.randomMath();
            System.out.println(math);
        } catch (CustomException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

    }
}
