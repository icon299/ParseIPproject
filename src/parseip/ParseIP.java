/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parseip;

<<<<<<< HEAD

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> 28c0b6c5fa914d26f5db90f12a5081806584ad01

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author d.sinyatkin
 */

public class ParseIP {

    public Map<String,String> getPairWithIP(String inStr){

        String patS = "(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})\\s+(.+)"; //паттерн для поиска строки с IP ()

        Map<String,String> mapIP = StringUtil.extractPairIntoMap(inStr, patS);
        
        printHashMap(mapIP);

        return mapIP;
     }

public static void printHashMap(Map<String,String> mymap){
      System.out.println("Map contains:");
      for (String key :  mymap.keySet())
        System.out.println(key + ":" + mymap.get(key));
      System.out.println("HashMap size is: " + mymap.size());
    }
////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        ParseIP app = new ParseIP();
        Map<String,String> mapIParams = new HashMap<String,String>();

        String inputParams = ""
                + "Finding IPMI Devices ...\n" +
             "  192.168.1.101          IPMI\n" +
             "  192.168.1.110          IPMI\n" +
             "  192.168.1.200          IPMI 2.0 SIM(WA) IPMI+KVM\n" +
             "3 IPMI device(s) found. Use \"found\" to list found devices";

        mapIParams = app.getPairWithIP(inputParams);
//        System.out.println("HashMap contains:");
        //printHashMap(mapIParams);


    }
///////////////////////////////////////////////////////////////////////////////
}
