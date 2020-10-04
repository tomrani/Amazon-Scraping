package webscrapper;

import org.apache.log4j.Logger;

import com.parallel.scrapping.WorkerThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class ScrapingThreadPool {
	private static Logger LOGGER = Logger.getLogger(ScrapingThreadPool.class);
    static final String inputFilename =  "D://Musical_Instruments_5.json";

    public static void main(String[] args) {

LOGGER.info("Start: "+new Date());
        ExecutorService executor = Executors.newFixedThreadPool(8);
        File file = new File(inputFilename);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
            	String filename=args[0].substring((args[0].lastIndexOf("/")-1), args[0].lastIndexOf("."));
                Runnable worker = new WorkerThread(scanner.nextLine(), filename);
                executor.execute(worker);
            }
            executor.shutdown();
            while (!executor.isTerminated()) {
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
       LOGGER.info("end: "+new Date());
        System.exit(0);
        }
    }
    
}
