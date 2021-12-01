package Resources;

/**
 * The type Input pay load.
 */
public class InputPayLoad {

    /**
     * Add pay load string.
     *
     * @param a the a
     * @param b the b
     * @return the string
     */
    public static String addPayLoad(int a, int b){
         String payload = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\"" +
                 " xmlns:tem=\"http://tempuri.org/\">\n" +
                 "   <soap:Header/>\n" +
                 "   <soap:Body>\n" +
                 "      <tem:Add>\n" +
                 "         <tem:intA>"+a+"</tem:intA>\n" +
                 "         <tem:intB>"+b+"</tem:intB>\n" +
                 "      </tem:Add>\n" +
                 "   </soap:Body>\n" +
                 "</soap:Envelope>";

         return payload;
     }

}
