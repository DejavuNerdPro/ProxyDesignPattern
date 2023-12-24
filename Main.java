public class Main {
    public static void main(String[] args) {
        // Using the proxy to access the real object
        RealObject proxy = new Proxy();
        proxy.request();
    }
}
