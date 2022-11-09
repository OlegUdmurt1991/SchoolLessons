package rucode;

public class les49 {
    public static String normalizeUrl(String url) {
        if (url.startsWith("https://")) {
            return url;



        } else {
            return "https://" + url ;



        }

    }

    public static void main(String[] args) {
        System.out.println("j");
    }}