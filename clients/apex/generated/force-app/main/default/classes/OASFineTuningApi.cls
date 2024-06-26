/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

public class OASFineTuningApi {
    OASClient client;

    public OASFineTuningApi(OASClient client) {
        this.client = client;
    }

    public OASFineTuningApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * Immediately cancel a fine-tune job.\n
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.\n (required)
     * @return OASFineTuningJob
     * @throws OAS.ApiException if fails to make API call
     */
    public OASFineTuningJob cancelFineTuningJob(Map<String, Object> params) {
        client.assertNotNull(params.get('fineTuningJobId'), 'fineTuningJobId');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASFineTuningJob) client.invoke(
            'POST', '/fine_tuning/jobs/{fine_tuning_job_id}/cancel', '',
            query, form,
            new Map<String, Object>{
                'fine_tuning_job_id' => (String) params.get('fineTuningJobId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'ApiKeyAuth' },
            OASFineTuningJob.class
        );
    }
    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.\n\nResponse includes details of the enqueued job including job status and the name of the fine-tuned models once complete.\n\n[Learn more about fine-tuning](/docs/guides/fine-tuning)\n
     * 
     * @param oaSCreateFineTuningJobRequest  (required)
     * @return OASFineTuningJob
     * @throws OAS.ApiException if fails to make API call
     */
    public OASFineTuningJob createFineTuningJob(Map<String, Object> params) {
        client.assertNotNull(params.get('oaSCreateFineTuningJobRequest'), 'oaSCreateFineTuningJobRequest');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASFineTuningJob) client.invoke(
            'POST', '/fine_tuning/jobs',
            (OASCreateFineTuningJobRequest) params.get('oaSCreateFineTuningJobRequest'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'ApiKeyAuth' },
            OASFineTuningJob.class
        );
    }
    /**
     * Get status updates for a fine-tuning job.\n
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.\n (required)
     * @param after Identifier for the last event from the previous pagination request. (optional)
     * @param r_limit Number of events to retrieve. (optional, default to 20)
     * @return OASListFineTuningJobEventsResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASListFineTuningJobEventsResponse listFineTuningEvents(Map<String, Object> params) {
        client.assertNotNull(params.get('fineTuningJobId'), 'fineTuningJobId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('after', (String) params.get('after')));
        query.addAll(client.makeParam('limit', (Integer) params.get('r_limit')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASListFineTuningJobEventsResponse) client.invoke(
            'GET', '/fine_tuning/jobs/{fine_tuning_job_id}/events', '',
            query, form,
            new Map<String, Object>{
                'fine_tuning_job_id' => (String) params.get('fineTuningJobId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'ApiKeyAuth' },
            OASListFineTuningJobEventsResponse.class
        );
    }
    /**
     * List checkpoints for a fine-tuning job.\n
     * 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.\n (required)
     * @param after Identifier for the last checkpoint ID from the previous pagination request. (optional)
     * @param r_limit Number of checkpoints to retrieve. (optional, default to 10)
     * @return OASListFineTuningJobCheckpointsRespo
     * @throws OAS.ApiException if fails to make API call
     */
    public OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpoints(Map<String, Object> params) {
        client.assertNotNull(params.get('fineTuningJobId'), 'fineTuningJobId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('after', (String) params.get('after')));
        query.addAll(client.makeParam('limit', (Integer) params.get('r_limit')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASListFineTuningJobCheckpointsRespo) client.invoke(
            'GET', '/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints', '',
            query, form,
            new Map<String, Object>{
                'fine_tuning_job_id' => (String) params.get('fineTuningJobId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'ApiKeyAuth' },
            OASListFineTuningJobCheckpointsRespo.class
        );
    }
    /**
     * List your organization\&#39;s fine-tuning jobs\n
     * 
     * @param after Identifier for the last job from the previous pagination request. (optional)
     * @param r_limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
     * @return OASListPaginatedFineTuningJobsRespon
     * @throws OAS.ApiException if fails to make API call
     */
    public OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobs(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('after', (String) params.get('after')));
        query.addAll(client.makeParam('limit', (Integer) params.get('r_limit')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASListPaginatedFineTuningJobsRespon) client.invoke(
            'GET', '/fine_tuning/jobs', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'ApiKeyAuth' },
            OASListPaginatedFineTuningJobsRespon.class
        );
    }
    /**
     * Get info about a fine-tuning job.\n\n[Learn more about fine-tuning](/docs/guides/fine-tuning)\n
     * 
     * @param fineTuningJobId The ID of the fine-tuning job.\n (required)
     * @return OASFineTuningJob
     * @throws OAS.ApiException if fails to make API call
     */
    public OASFineTuningJob retrieveFineTuningJob(Map<String, Object> params) {
        client.assertNotNull(params.get('fineTuningJobId'), 'fineTuningJobId');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASFineTuningJob) client.invoke(
            'GET', '/fine_tuning/jobs/{fine_tuning_job_id}', '',
            query, form,
            new Map<String, Object>{
                'fine_tuning_job_id' => (String) params.get('fineTuningJobId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'ApiKeyAuth' },
            OASFineTuningJob.class
        );
    }
}
