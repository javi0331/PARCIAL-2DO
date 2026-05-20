package decorators;

import reports.Report;

public class HeaderDecorator extends ReportDecorator {

    private String headerText;

    public HeaderDecorator(Report report, String headerText) {
        super(report);
        this.headerText = headerText;
    }

    @Override
    public String generateContent() {

        return "=== " + headerText + " ===\n"
                + super.generateContent();
    }
}