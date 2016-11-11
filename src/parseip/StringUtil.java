package parseip;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
  /*
  */
  /**
   * replace {{placeholders}} to their values
   * 
   * @param template string with placeholders
   * @param params placeholder key, placeholder value
   * @return replace result
   */
  public static String usePlaceholders(String template, String ... params) {
    if (params != null && template != null) {
      for (int i=0; i < params.length-1; i+=2) {
        template = template.replaceAll("\\{\\{"+params[i].trim()+"\\}\\}", params[i+1]);
      }
    }
    return template;
  }
  
  /**
   * Extracts part of a string passed
   * @param text - whole text
   * @param regexp - regular expression. text matched inside group markers () will be returned
   * @param groupNo - regexp group index to return (if there's more then one)
   * @return 
   */
  public static String extract(String text, String regexp, int groupNo) {

    Pattern pattern = Pattern.compile(regexp);
    Matcher matcher = pattern.matcher(text);
    if (matcher.find()) {
      return matcher.group(groupNo);
    }
    return null;
  }

  public static Map<String,String> extractPairIntoMap(String text, String regexp) {

    Map<String,String> matcherMap = new HashMap<String,String>();

    Pattern pattern = Pattern.compile(regexp);
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      matcherMap.put(matcher.group(1),matcher.group(2));
    }

    return matcherMap;
  }

}
