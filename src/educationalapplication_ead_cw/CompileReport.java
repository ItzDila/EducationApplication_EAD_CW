package educationalapplication_ead_cw;

import net.sf.jasperreports.engine.JasperCompileManager;

public class CompileReport {
    public void setReport(){
        try {
            String sourceFileName = "src/educationalapplication_ead_cw/Reports/StudentReport.jrxml";
            String destFileName = "src/educationalapplication_ead_cw/Reports/StudentReport.jasper";

            JasperCompileManager.compileReportToFile(sourceFileName, destFileName);
            System.out.println("Report compiled successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}