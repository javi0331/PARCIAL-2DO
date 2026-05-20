package decorators;

import config.SystemConfiguration;
import reports.Report;

public class WatermarkDecorator extends ReportDecorator {

    private String watermarkText;

    public WatermarkDecorator(Report report, String watermarkText) {
        super(report);
        this.watermarkText = watermarkText;
    }

    @Override
    public String generateContent() {

        SystemConfiguration config =
                SystemConfiguration.getInstance();

        if (config.isShowWatermark()) {

            return super.generateContent()
                    + "\n[WATERMARK: "
                    + watermarkText + "]";
        }

        return super.generateContent();
    }
}