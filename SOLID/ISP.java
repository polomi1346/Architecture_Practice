package SOLID;

// Small, focused interfaces
interface Printable {
    void printDocument();
}

interface Scannable {
    void scanDocument();
}

interface Faxable {
    void faxDocument();
}

// Simple printer only prints
public class ISP {

    public static class SimplePrinter implements Printable {
        @Override
        public void printDocument() {
            System.out.println("Sending document to the printer ...");
        }
    }

    public static void main(String[] args) {
        Printable printer = new SimplePrinter();
        printer.printDocument();
    }
}
