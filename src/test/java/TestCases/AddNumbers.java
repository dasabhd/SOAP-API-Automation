package TestCases;

import Resources.InputPayLoad;
import Resources.StringToDOM;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * The type Add numbers.
 */
public class AddNumbers {

    /**
     * Add numbers.
     *
     * @throws IOException the io exception
     */
    @Test
    public void addNumbers() throws IOException {

        CloseableHttpClient client = HttpClients.createDefault();

        HttpPost request = new HttpPost("http://www.dneonline.com/calculator.asmx?WSDL");

        request.addHeader("Content-Type","text/xml");

        HttpEntity entity = new ByteArrayEntity(InputPayLoad.addPayLoad(24,76).
                getBytes(StandardCharsets.UTF_8));

        request.setEntity(entity);

        CloseableHttpResponse response = client.execute(request);

        int statusCode = response.getStatusLine().getStatusCode();

        Assert.assertEquals(200,statusCode);

        HttpEntity entity1 = response.getEntity();

        String content = EntityUtils.toString(entity1);

        StringToDOM xml = new StringToDOM();

        xml.stringToDOM(content);

    }

}
