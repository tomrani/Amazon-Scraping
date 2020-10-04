package webscrapper;

import java.time.Duration;
import java.time.Instant;


public class WebScrapperMainApp {

	public static void main(String[] args) {
		Instant start = Instant.now();
		String profileId = "A60XNB876KYML";
		String location = null;
	//	location = AmazonWebScrapper.getCustomerLocationByProfileId(profileId);
		System.out.println("The location of the account id '" + profileId + "' is '" + location + "'.");
		Instant end = Instant.now();
		System.out.println("Duration time : " + Duration.between(start, end).getSeconds()+" seconds.");
	}

}
