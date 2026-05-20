package factory;

import reports.ExcelReport;
import reports.HtmlReport;
import reports.PdfReport;
import reports.Report;

public class ReportFactory {

    public static Report createReport(String type) {

        switch (type.toUpperCase()) {

            case "PDF":
                return new PdfReport();

            case "EXCEL":
                return new ExcelReport();

            case "HTML":
                return new HtmlReport();

            default:
                throw new IllegalArgumentException("Invalid report type.");
        }
    }
}