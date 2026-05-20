import config.SystemConfiguration;
import decorators.FooterDateDecorator;
import decorators.HeaderDecorator;
import decorators.WatermarkDecorator;
import factory.ReportFactory;
import java.util.Scanner;
import reports.Report;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SystemConfiguration config =
                SystemConfiguration.getInstance();

        config.setOutputDirectory("/generatedReports");
        config.setDefaultFormat("PDF");

        System.out.println("       REPORT SYSTEM");

        System.out.println("Choose report type:");
        System.out.println("PDF / EXCEL / HTML");

            String type = scanner.nextLine().toUpperCase(); 

                if (!type.equals("PDF")
                    && !type.equals("EXCEL")
                && !type.equals("HTML")) {

        System.out.println("Invalid report type");
        return;
}

        Report report = ReportFactory.createReport(type);

        System.out.println("\nEnter report title:");
        String title = scanner.nextLine();

        System.out.println("\nAdd custom header? (y/n)");
        String headerOption = scanner.nextLine();

        if (headerOption.equalsIgnoreCase("y")) {

            System.out.println("Enter header text:");
            String headerText = scanner.nextLine();

            report = new HeaderDecorator(report, headerText);
        }

        System.out.println("\nEnable watermark? (y/n)");
        String watermarkOption = scanner.nextLine();

        if (watermarkOption.equalsIgnoreCase("y")) {

            config.setShowWatermark(true);

            System.out.println("Enter watermark text:");
            String watermarkText = scanner.nextLine();

            report = new WatermarkDecorator(report, watermarkText);

        } else {
            config.setShowWatermark(false);
        }

        System.out.println("\nAdd footer with date? (y/n)");
        String footerOption = scanner.nextLine();

        if (footerOption.equalsIgnoreCase("y")) {

            report = new FooterDateDecorator(report);
        }

        System.out.println("\n=================================");
        System.out.println("         FINAL REPORT");
        System.out.println("=================================");

        System.out.println("TITLE: " + title);
        System.out.println(report.generateContent());

        System.out.println("\n=================================");
        System.out.println("      SYSTEM CONFIGURATION");
        System.out.println("=================================");

        System.out.println("Output directory: "
                + config.getOutputDirectory());

        System.out.println("Default format: "
                + config.getDefaultFormat());

        System.out.println("Watermark enabled: "
                + config.isShowWatermark());

        scanner.close();
    }
}