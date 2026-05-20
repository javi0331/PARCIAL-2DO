package config;

public class SystemConfiguration {

    private static SystemConfiguration instance;

    private String outputDirectory;
    private String defaultFormat;
    private boolean showWatermark;

    private SystemConfiguration() {

        outputDirectory = "/reports";
        defaultFormat = "PDF";
        showWatermark = true;
    }

    public static SystemConfiguration getInstance() {

        if (instance == null) {
            instance = new SystemConfiguration();
        }

        return instance;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public String getDefaultFormat() {
        return defaultFormat;
    }

    public void setDefaultFormat(String defaultFormat) {
        this.defaultFormat = defaultFormat;
    }

    public boolean isShowWatermark() {
        return showWatermark;
    }

    public void setShowWatermark(boolean showWatermark) {
        this.showWatermark = showWatermark;
    }
}