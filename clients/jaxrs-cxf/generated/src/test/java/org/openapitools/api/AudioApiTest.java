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

import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import java.io.File;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API tests for AudioApi
 */
public class AudioApiTest {


    private AudioApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://api.openai.com/v1", AudioApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Generates audio from the input text.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSpeechTest() {
        CreateSpeechRequest createSpeechRequest = null;
        //File response = api.createSpeech(createSpeechRequest);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Transcribes audio into the input language.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTranscriptionTest() {
        File _file = null;
        CreateTranscriptionRequestModel model = null;
        String language = null;
        String prompt = null;
        String responseFormat = null;
        BigDecimal temperature = null;
        List<String> timestampGranularities = null;
        //CreateTranscription200Response response = api.createTranscription(_file, model, language, prompt, responseFormat, temperature, timestampGranularities);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Translates audio into English.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTranslationTest() {
        File _file = null;
        CreateTranscriptionRequestModel model = null;
        String prompt = null;
        String responseFormat = null;
        BigDecimal temperature = null;
        //CreateTranslation200Response response = api.createTranslation(_file, model, prompt, responseFormat, temperature);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}
