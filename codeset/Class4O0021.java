import javax.management.MBeanServer;

public class Class4O0021 {
    private final MBeanServer mBeanServer;

    public Class4O0021(MBeanServer mBeanServer) {
        this.mBeanServer = mBeanServer;
    }

    public String func4O0021() {
        try {
            String serverType = mBeanServer != null ? mBeanServer.getClass().getSimpleName() : "null";
            String serverName = mBeanServer != null ? mBeanServer.getClass().getName() : "null";
            String defaultDomain = mBeanServer != null ? mBeanServer.getDefaultDomain() : "null";

            return "MBeanServer: " + serverType + ", FullName: " + serverName + ", DefaultDomain: " + defaultDomain;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}