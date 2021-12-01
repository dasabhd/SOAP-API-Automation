package Resources;

import java.io.FileWriter;
import java.io.IOException;

/**
 * The type String to dom.
 */
public class StringToDOM {

    /**
     * String to dom.
     *
     * @param response the response
     * @throws IOException the io exception
     */
    public void stringToDOM(String response) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\dasab\\IdeaProjects" +
                "\\SOAPAPI\\src\\test\\java\\Responses\\response.xml");

        fw.write(response);

        fw.close();

    }

}
