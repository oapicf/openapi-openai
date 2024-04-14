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

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;
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
 * API tests for FineTuningApi
 */
public class FineTuningApiTest {


    private FineTuningApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://api.openai.com/v1", FineTuningApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Immediately cancel a fine-tune job. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelFineTuningJobTest() {
        String fineTuningJobId = null;
        //FineTuningJob response = api.cancelFineTuningJob(fineTuningJobId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFineTuningJobTest() {
        CreateFineTuningJobRequest createFineTuningJobRequest = null;
        //FineTuningJob response = api.createFineTuningJob(createFineTuningJobRequest);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Get status updates for a fine-tuning job. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFineTuningEventsTest() {
        String fineTuningJobId = null;
        String after = null;
        Integer limit = null;
        //ListFineTuningJobEventsResponse response = api.listFineTuningEvents(fineTuningJobId, after, limit);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * List checkpoints for a fine-tuning job. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFineTuningJobCheckpointsTest() {
        String fineTuningJobId = null;
        String after = null;
        Integer limit = null;
        //ListFineTuningJobCheckpointsResponse response = api.listFineTuningJobCheckpoints(fineTuningJobId, after, limit);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * List your organization&#39;s fine-tuning jobs 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPaginatedFineTuningJobsTest() {
        String after = null;
        Integer limit = null;
        //ListPaginatedFineTuningJobsResponse response = api.listPaginatedFineTuningJobs(after, limit);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFineTuningJobTest() {
        String fineTuningJobId = null;
        //FineTuningJob response = api.retrieveFineTuningJob(fineTuningJobId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}
