public class DigitalProduct extends Product {
    private String fileFormat;
    private String fileName;

    public DigitalProduct() {
        super();
        fileFormat = "N/A";
        fileName = "N/A";
    }

    public DigitalProduct(String fileFormat, String fileName, String name, double price, String sku) throws IllegalArgumentException {
        super(name, price, sku);
        this.fileFormat = fileFormat;
        this.fileName = fileName;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }



}