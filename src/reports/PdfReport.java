package reports;

public class PdfReport implements Report {

    @Override
    public String generateContent() {
        return "Generating PDF report...";
    }
}