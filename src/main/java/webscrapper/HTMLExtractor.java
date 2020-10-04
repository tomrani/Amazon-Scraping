package webscrapper;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class HTMLExtractor {

	public static String getHTMLContentFromURL(String url) {
		String html = null;
		WebClient webClient = new WebClient();
		webClient.getOptions().setJavaScriptEnabled(false);
		try {
			HtmlPage htmlPage = webClient.getPage(url);
			html = htmlPage.asXml();
			webClient.close();
		} catch (FailingHttpStatusCodeException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return html;
	}

}
