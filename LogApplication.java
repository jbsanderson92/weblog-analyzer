
/**
 * Write a description of class LogApplication here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LogApplication
{
    public static void main(String[] args) {
        log("Creating random logfile...");
        LogfileCreator fileCreator = new LogfileCreator();
        if (fileCreator.createFile("penis.txt", 64)) {
            log("file created, instantiating LogAnalyzer...");
            LogAnalyzer analyzer = new LogAnalyzer("penis.txt");
            log("analyzer created");
        } else {
            logErr("failed to create file.");
        }
        
    }
    
    private static void log(String msg) {
        System.out.println(msg);
    }

    private static void logErr(String err) {
        System.err.println(err);
    }
}
