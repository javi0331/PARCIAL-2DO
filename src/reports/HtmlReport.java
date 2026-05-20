package reports;

public class HtmlReport implements Report {

    @Override
    public String generateContent() {
        return "Generating HTML report...";
    }
}