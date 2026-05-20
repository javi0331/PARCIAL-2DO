package decorators;

import reports.Report;

import java.time.LocalDate;

public class FooterDateDecorator extends ReportDecorator {

    public FooterDateDecorator(Report report) {
        super(report);
    }

    @Override
    public String generateContent() {

        return super.generateContent()
                + "\nDate: "
                + LocalDate.now();
    }
}