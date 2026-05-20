package decorators;

import reports.Report;

public abstract class ReportDecorator implements Report {

    protected Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    @Override
    public String generateContent() {
        return report.generateContent();
    }
}