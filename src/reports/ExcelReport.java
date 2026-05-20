package reports;

public class ExcelReport implements Report {

    @Override
    public String generateContent() {
        return "Generating Excel report...";
    }
}