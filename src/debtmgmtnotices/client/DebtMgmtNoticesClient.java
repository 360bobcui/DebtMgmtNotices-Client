/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debtmgmtnotices.client;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bob
 */
public class DebtMgmtNoticesClient {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Runtime rt = Runtime.getRuntime();
        System.out.println(DebtMgmtNoticesClient.class.getResource("DebtMgmtNoticesClient.class"));
       // String path = "C:\\";
        String path = DebtMgmtNoticesClient.class.getResource("DebtMgmtNoticesClient.class").toString();
        path = path.replaceAll("file:/", "");
        String[] data = path.split("/DebtMgmtNoticesClient.class");
        path = data[0];
        //String[] cmdArray = new String[]{"cmd.exe", "/C", "\"start; cd " + path + "\"" };
        
        // rename ATHENA-DMPO as lib.  Leave source and lib in the same directory where ATHENAClient.jar is
        String[] cmdArray = new String[]{"cmd.exe", "/C", "\"start; java -jar lib\\DebtMgmtNotices.jar\""};
        System.out.println(Arrays.toString(cmdArray));
        try {
            rt.exec(cmdArray);
            //rt.exec(new String[]{"cmd.exe", "/C", "\"start; cd " + path + ";java -jar ATHENA-DMPO.jar \"" });
            //  rt.exec(new String[]{".exe", " ATHENA-DMPO.jar 1000"});
//        Process pr = rt.exec("cmd/c Desktop");
//        pr = rt.exec("java -jar ATHENA-DMPO.jar");       
        } catch (IOException ex) {
            Logger.getLogger(DebtMgmtNoticesClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
