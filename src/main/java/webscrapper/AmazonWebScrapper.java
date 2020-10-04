package webscrapper;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmazonWebScrapper {

	private final  String PROFILE_BASE_URL = "http://www.amazon.com/gp/cdp/member-reviews/";

	public  String getCustomerLocationByProfileId(String profileId) {
		
		String location = null;
		String profileURL = PROFILE_BASE_URL + profileId;
		String htmlContent = HTMLExtractor.getHTMLContentFromURL(profileURL);
		Pattern pattern = Pattern.compile("\\Q\"occupationLocationList\":[\\E(.*)\\Q]\\E");
		Matcher matcher = pattern.matcher(htmlContent);
		if (matcher.find()) {
			location = matcher.group(1);
			Pattern subPattern = Pattern.compile("\".*?\"");
			Matcher subMatcher = subPattern.matcher(location);
			if (subMatcher.find()) {
				location = subMatcher.group(0);
				location = location.substring(1, location.length() - 1);
			} else {
				location = "";
			}
		}
		return location;
	}

}
