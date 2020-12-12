import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MathService {

    public String randomMath() throws CustomException {
        String uri = "http://numbersapi.com/random/math";
        try {
            URL url = new URL(uri);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder stringBuilder = new StringBuilder();

            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
            }
            in.close();

            if (stringBuilder.toString() == "") {
                throw new CustomException("Ciekawostak matematyczna nie została wylosowana");
            }

            return stringBuilder.toString();

        } catch (MalformedURLException e) {
            throw new CustomException("jakis blad");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
