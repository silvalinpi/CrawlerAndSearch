import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.url.WebURL;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Crawler {
    static Queue<WebURL> queue = new LinkedList<WebURL>();

    // Get a few urls, and then download web page by http request
    static Page Download(){
        // TODO: reference to fetch to download webpages
        WebURL url = queue.poll();
        // call http request to get the web page
        return null;
    }

    // Extract URLs in page content
    static List<WebURL> ExtractUrl(Page page){
        // TODO: reference to parser to extractor urls from the web content
        return null;
    }

    List<WebURL> Filter(List<WebURL> urls){
        // TODO: filter out duplicated urls
        // single machine: HashMap of hashed web content
        // multi-thread: thread-safe hashmap
        // database + bloomfilter
        return null;
    }

    void AppendToQueue(List<WebURL> urls){
        queue.addAll(urls);
    }

    public static void main(String[] args) throws Exception {
        queue.add(null);
        while(!queue.isEmpty()) {
            Page page = Download();
            List<WebURL> urls = ExtractUrl(page);
            // Filter+AppendToQueue
        }
    }

    // Step1. for each step, just call another function to proceed
    // Step2. send message through spring cloud stream
    // StreamListener
    /* Example:
       @StreamListener(Waiter.NEW_ORDERS) // topic "new_order" de consumer
       @SendTo(Waiter.FINISHED_ORDERS) // topic "finished_order" de producer
    */
    // Step3. change to multi-thread
    // Step4. add database to store web pages for search engine
    // Step5. add periodic job to refresh crawler pages
}
