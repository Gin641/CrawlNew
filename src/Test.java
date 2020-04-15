import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static void main(String[] args) {
        URL url;
        CrawlNews crawlNews;
        try {
            crawlNews = new CrawlNews();
            url = new URL("https://dantri.com.vn/the-thao.htm");
            crawlNews.CrawlNews(url);
        } catch (MalformedURLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
