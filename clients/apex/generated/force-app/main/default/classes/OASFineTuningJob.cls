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

/**
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API.\n
 */
public class OASFineTuningJob implements OAS.MappedProperties {
    /**
     * The object identifier, which can be referenced in the API endpoints.
     * @return id
     */
    public String id { get; set; }

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @return createdAt
     */
    public Integer createdAt { get; set; }

    /**
     * Get error
     * @return error
     */
    public OASFineTuningJobError error { get; set; }

    /**
     * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     * @return fineTunedModel
     */
    public String fineTunedModel { get; set; }

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     * @return finishedAt
     */
    public Integer finishedAt { get; set; }

    /**
     * Get hyperparameters
     * @return hyperparameters
     */
    public OASFineTuningJobHyperparameters hyperparameters { get; set; }

    /**
     * The base model that is being fine-tuned.
     * @return model
     */
    public String model { get; set; }

    /**
     * The object type, which is always "fine_tuning.job".
     */
    public enum RObjectEnum {
        FINE_TUNING_JOB
    }

    /**
     * The object type, which is always "fine_tuning.job".
     * @return r_object
     */
    public RObjectEnum r_object { get; set; }

    /**
     * The organization that owns the fine-tuning job.
     * @return organizationId
     */
    public String organizationId { get; set; }

    /**
     * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return resultFiles
     */
    public List<String> resultFiles { get; set; }

    /**
     * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     */
    public enum StatusEnum {
        VALIDATING_FILES,
        QUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        CANCELLED
    }

    /**
     * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     * @return status
     */
    public StatusEnum status { get; set; }

    /**
     * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     * @return trainedTokens
     */
    public Integer trainedTokens { get; set; }

    /**
     * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return trainingFile
     */
    public String trainingFile { get; set; }

    /**
     * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return validationFile
     */
    public String validationFile { get; set; }

    /**
     * A list of integrations to enable for this fine-tuning job.
     * @return integrations
     */
    public List<OASFineTuningJobIntegrationsInner> integrations { get; set; }

    /**
     * The seed used for the fine-tuning job.
     * @return seed
     */
    public Integer seed { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'fine_tuned_model' => 'fineTunedModel',
        'finished_at' => 'finishedAt',
        'object' => 'r_object',
        'organization_id' => 'organizationId',
        'result_files' => 'resultFiles',
        'trained_tokens' => 'trainedTokens',
        'training_file' => 'trainingFile',
        'validation_file' => 'validationFile'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'fine_tuned_model' => 'fineTunedModel',
        'finished_at' => 'finishedAt',
        'object' => 'r_object',
        'organization_id' => 'organizationId',
        'result_files' => 'resultFiles',
        'trained_tokens' => 'trainedTokens',
        'training_file' => 'trainingFile',
        'validation_file' => 'validationFile'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'fine_tuned_model' => 'fineTunedModel',
        'finished_at' => 'finishedAt',
        'object' => 'r_object',
        'organization_id' => 'organizationId',
        'result_files' => 'resultFiles',
        'trained_tokens' => 'trainedTokens',
        'training_file' => 'trainingFile',
        'validation_file' => 'validationFile'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'fine_tuned_model' => 'fineTunedModel',
        'finished_at' => 'finishedAt',
        'object' => 'r_object',
        'organization_id' => 'organizationId',
        'result_files' => 'resultFiles',
        'trained_tokens' => 'trainedTokens',
        'training_file' => 'trainingFile',
        'validation_file' => 'validationFile'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'fine_tuned_model' => 'fineTunedModel',
        'finished_at' => 'finishedAt',
        'object' => 'r_object',
        'organization_id' => 'organizationId',
        'result_files' => 'resultFiles',
        'trained_tokens' => 'trainedTokens',
        'training_file' => 'trainingFile',
        'validation_file' => 'validationFile'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'fine_tuned_model' => 'fineTunedModel',
        'finished_at' => 'finishedAt',
        'object' => 'r_object',
        'organization_id' => 'organizationId',
        'result_files' => 'resultFiles',
        'trained_tokens' => 'trainedTokens',
        'training_file' => 'trainingFile',
        'validation_file' => 'validationFile'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'fine_tuned_model' => 'fineTunedModel',
        'finished_at' => 'finishedAt',
        'object' => 'r_object',
        'organization_id' => 'organizationId',
        'result_files' => 'resultFiles',
        'trained_tokens' => 'trainedTokens',
        'training_file' => 'trainingFile',
        'validation_file' => 'validationFile'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'fine_tuned_model' => 'fineTunedModel',
        'finished_at' => 'finishedAt',
        'object' => 'r_object',
        'organization_id' => 'organizationId',
        'result_files' => 'resultFiles',
        'trained_tokens' => 'trainedTokens',
        'training_file' => 'trainingFile',
        'validation_file' => 'validationFile'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'fine_tuned_model' => 'fineTunedModel',
        'finished_at' => 'finishedAt',
        'object' => 'r_object',
        'organization_id' => 'organizationId',
        'result_files' => 'resultFiles',
        'trained_tokens' => 'trainedTokens',
        'training_file' => 'trainingFile',
        'validation_file' => 'validationFile'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASFineTuningJob() {
        resultFiles = new List<String>();
        integrations = new List<OASFineTuningJobIntegrationsInner>();
    }

    public static OASFineTuningJob getExample() {
        OASFineTuningJob fineTuningJob = new OASFineTuningJob();
          fineTuningJob.id = '';
          fineTuningJob.createdAt = 0;
          fineTuningJob.error = OASFineTuningJobError.getExample();
          fineTuningJob.fineTunedModel = '';
          fineTuningJob.finishedAt = 0;
          fineTuningJob.hyperparameters = OASFineTuningJobHyperparameters.getExample();
          fineTuningJob.model = '';
          fineTuningJob.r_object = RObjectEnum.FINE_TUNING_JOB;
          fineTuningJob.organizationId = '';
          fineTuningJob.resultFiles = new List<String>{'file-abc123'};
          fineTuningJob.status = StatusEnum.VALIDATING_FILES;
          fineTuningJob.trainedTokens = 0;
          fineTuningJob.trainingFile = '';
          fineTuningJob.validationFile = '';
          fineTuningJob.integrations = new List<OASFineTuningJobIntegrationsInner>{OASFineTuningJobIntegrationsInner.getExample()};
          fineTuningJob.seed = 0;
        return fineTuningJob;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASFineTuningJob) {           
            OASFineTuningJob fineTuningJob = (OASFineTuningJob) obj;
            return this.id == fineTuningJob.id
                && this.createdAt == fineTuningJob.createdAt
                && this.error == fineTuningJob.error
                && this.fineTunedModel == fineTuningJob.fineTunedModel
                && this.finishedAt == fineTuningJob.finishedAt
                && this.hyperparameters == fineTuningJob.hyperparameters
                && this.model == fineTuningJob.model
                && this.r_object == fineTuningJob.r_object
                && this.organizationId == fineTuningJob.organizationId
                && this.resultFiles == fineTuningJob.resultFiles
                && this.status == fineTuningJob.status
                && this.trainedTokens == fineTuningJob.trainedTokens
                && this.trainingFile == fineTuningJob.trainingFile
                && this.validationFile == fineTuningJob.validationFile
                && this.integrations == fineTuningJob.integrations
                && this.seed == fineTuningJob.seed;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (createdAt == null ? 0 : System.hashCode(createdAt));
        hashCode = (17 * hashCode) + (error == null ? 0 : System.hashCode(error));
        hashCode = (17 * hashCode) + (fineTunedModel == null ? 0 : System.hashCode(fineTunedModel));
        hashCode = (17 * hashCode) + (finishedAt == null ? 0 : System.hashCode(finishedAt));
        hashCode = (17 * hashCode) + (hyperparameters == null ? 0 : System.hashCode(hyperparameters));
        hashCode = (17 * hashCode) + (model == null ? 0 : System.hashCode(model));
        hashCode = (17 * hashCode) + (r_object == null ? 0 : System.hashCode(r_object));
        hashCode = (17 * hashCode) + (organizationId == null ? 0 : System.hashCode(organizationId));
        hashCode = (17 * hashCode) + (resultFiles == null ? 0 : System.hashCode(resultFiles));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        hashCode = (17 * hashCode) + (trainedTokens == null ? 0 : System.hashCode(trainedTokens));
        hashCode = (17 * hashCode) + (trainingFile == null ? 0 : System.hashCode(trainingFile));
        hashCode = (17 * hashCode) + (validationFile == null ? 0 : System.hashCode(validationFile));
        hashCode = (17 * hashCode) + (integrations == null ? 0 : System.hashCode(integrations));
        hashCode = (17 * hashCode) + (seed == null ? 0 : System.hashCode(seed));
        return hashCode;
    }
}

