class MultipleInterface {
    interface Printer {
        void printData();
    }

    interface Scanner {
        void scanData();
    }

    static class AllInOneDevice implements Printer, Scanner {
        @Override
        public void printData() {
            System.out.println("Printing document...");
        }

        @Override
        public void scanData() {
            System.out.println("Scanning document...");
        }
    }

    public static void main(String[] args) {
        AllInOneDevice device = new AllInOneDevice();
        device.printData();
        device.scanData();
    }
}