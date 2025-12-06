import java.util.Scanner;

public class DigitalProduct extends Product {
    private String fileFormat;
    private String fileName;

    public DigitalProduct() {
        super();
        fileFormat = "N/A";
        fileName = "N/A";
    }

    public DigitalProduct(String fileFormat, String fileName,
         String name, double price, String sku) throws IllegalArgumentException {
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

    @Override
    public String toString() {
        return super.toString() +  " file format: " + fileFormat +
         " filename: " + fileName;
    }

    @Override
    public void edit(Scanner sc) {
        super.edit(sc);

        System.out.println("New Filename:");
        String newFileName = sc.nextLine();
        if (!fileName.isEmpty()) {
            this.fileName = newFileName;
        }

        System.out.println("New File Format");
        String newFileFormat = sc.nextLine();
        if (!newFileFormat.isEmpty()) {
            this.fileFormat = newFileFormat;
        }
    }

}