/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API tests for CompletionsApi.
 */
public class CompletionsApiTest {

    private CompletionsApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://api.openai.com/v1", CompletionsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Creates a completion for the provided prompt and parameters.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createCompletionTest() throws Exception {
        // TODO: assign appropriate parameter values
        CreateCompletionRequest createCompletionRequest = null;

        // TODO: delete this line and uncomment the next
        // CreateCompletionResponse response = api.createCompletion(createCompletionRequest);
        // TODO: complete test assertions
    }
    
}
