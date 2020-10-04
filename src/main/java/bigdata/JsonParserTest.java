package bigdata;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JsonParserTest {
/*
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationConfig.Feature.DEFAULT_VIEW_INCLUSION, false);

        String inputFilename = "/Users/MaherAzzabi/Documents/selenium-webclient/resources/Musical_Instruments_5.json";
        String outputFilename = "/Users/MaherAzzabi/Documents/selenium-webclient/resources/out_Musical_Instruments_5.json";
        String jsonObject;
        String region = "";
        WebDriver driver = new ChromeDriver();
        try {
            FileReader fileReader = new FileReader(inputFilename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            PrintWriter printWriter = new PrintWriter(outputFilename);
            int reviewNumber = 0;
            ConsumerReview consumerReview;
            while ((jsonObject = bufferedReader.readLine()) != null) {
                consumerReview = objectMapper.readValue(jsonObject, ConsumerReview.class);
                String baseUrl = "http://www.amazon.com/gp/cdp/member-reviews/" + consumerReview.getReviewerID();
                driver.get(baseUrl);
                try {
                    region = driver.findElement(By.xpath("//*[@id=\"customer-profile-bio\"]/div/div[1]/div/div/div/span"))
                            .getText();
                    int fin = 0;
                    fin = region.indexOf("|");
                    if (fin != -1) {
                        region = region.substring(fin + 2, region.length());
                    }
                    consumerReview.setRegion(region);
                    printWriter.println(objectMapper.writerWithView(JsonOutputView.class).writeValueAsString(consumerReview));
                } catch (org.openqa.selenium.NoSuchElementException e) {
                    e.printStackTrace();
                }
                printWriter.flush();
                reviewNumber++;
                region = "";
            }
            fileReader.close();
            bufferedReader.close();
            printWriter.close();
            System.out.println("Total reviews : " + reviewNumber);
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + inputFilename + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + inputFilename + "'");
        }

    }
*/
}
