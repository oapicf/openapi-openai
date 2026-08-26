package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.FineTuneMethod;
import org.openapitools.server.model.FineTuningJobError;
import org.openapitools.server.model.FineTuningJobHyperparameters;
import org.openapitools.server.model.FineTuningJobIntegrationsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 */
public class FineTuningJob   {

    private String id;
    private Integer createdAt;
    private FineTuningJobError error;
    private String fineTunedModel;
    private Integer finishedAt;
    private FineTuningJobHyperparameters hyperparameters;
    private String model;

    /**
    * The object type, which is always \"fine_tuning.job\".
    */
    public enum ObjectEnum {
        FINE_TUNING_JOB("fine_tuning.job");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;
    private String organizationId;
    private List<String> resultFiles = new ArrayList<>();

    /**
    * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
    */
    public enum StatusEnum {
        VALIDATING_FILES("validating_files"),
        QUEUED("queued"),
        RUNNING("running"),
        SUCCEEDED("succeeded"),
        FAILED("failed"),
        CANCELLED("cancelled");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private StatusEnum status;
    private Integer trainedTokens;
    private String trainingFile;
    private String validationFile;
    private List<FineTuningJobIntegrationsInner> integrations;
    private Integer seed;
    private Integer estimatedFinish;
    private FineTuneMethod method;

    /**
     * Default constructor.
     */
    public FineTuningJob() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuningJob.
     *
     * @param id The object identifier, which can be referenced in the API endpoints.
     * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @param error error
     * @param fineTunedModel The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     * @param finishedAt The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     * @param hyperparameters hyperparameters
     * @param model The base model that is being fine-tuned.
     * @param _object The object type, which is always \&quot;fine_tuning.job\&quot;.
     * @param organizationId The organization that owns the fine-tuning job.
     * @param resultFiles The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @param status The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
     * @param trainedTokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     * @param trainingFile The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @param validationFile The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @param integrations A list of integrations to enable for this fine-tuning job.
     * @param seed The seed used for the fine-tuning job.
     * @param estimatedFinish The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
     * @param method method
     */
    public FineTuningJob(
        String id, 
        Integer createdAt, 
        FineTuningJobError error, 
        String fineTunedModel, 
        Integer finishedAt, 
        FineTuningJobHyperparameters hyperparameters, 
        String model, 
        ObjectEnum _object, 
        String organizationId, 
        List<String> resultFiles, 
        StatusEnum status, 
        Integer trainedTokens, 
        String trainingFile, 
        String validationFile, 
        List<FineTuningJobIntegrationsInner> integrations, 
        Integer seed, 
        Integer estimatedFinish, 
        FineTuneMethod method
    ) {
        this.id = id;
        this.createdAt = createdAt;
        this.error = error;
        this.fineTunedModel = fineTunedModel;
        this.finishedAt = finishedAt;
        this.hyperparameters = hyperparameters;
        this.model = model;
        this._object = _object;
        this.organizationId = organizationId;
        this.resultFiles = resultFiles;
        this.status = status;
        this.trainedTokens = trainedTokens;
        this.trainingFile = trainingFile;
        this.validationFile = validationFile;
        this.integrations = integrations;
        this.seed = seed;
        this.estimatedFinish = estimatedFinish;
        this.method = method;
    }



    /**
     * The object identifier, which can be referenced in the API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get error
     * @return error
     */
    public FineTuningJobError getError() {
        return error;
    }

    public void setError(FineTuningJobError error) {
        this.error = error;
    }

    /**
     * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     * @return fineTunedModel
     */
    public String getFineTunedModel() {
        return fineTunedModel;
    }

    public void setFineTunedModel(String fineTunedModel) {
        this.fineTunedModel = fineTunedModel;
    }

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     * @return finishedAt
     */
    public Integer getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Integer finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * Get hyperparameters
     * @return hyperparameters
     */
    public FineTuningJobHyperparameters getHyperparameters() {
        return hyperparameters;
    }

    public void setHyperparameters(FineTuningJobHyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
    }

    /**
     * The base model that is being fine-tuned.
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The object type, which is always \"fine_tuning.job\".
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The organization that owns the fine-tuning job.
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return resultFiles
     */
    public List<String> getResultFiles() {
        return resultFiles;
    }

    public void setResultFiles(List<String> resultFiles) {
        this.resultFiles = resultFiles;
    }

    /**
     * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     * @return trainedTokens
     */
    public Integer getTrainedTokens() {
        return trainedTokens;
    }

    public void setTrainedTokens(Integer trainedTokens) {
        this.trainedTokens = trainedTokens;
    }

    /**
     * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return trainingFile
     */
    public String getTrainingFile() {
        return trainingFile;
    }

    public void setTrainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
    }

    /**
     * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return validationFile
     */
    public String getValidationFile() {
        return validationFile;
    }

    public void setValidationFile(String validationFile) {
        this.validationFile = validationFile;
    }

    /**
     * A list of integrations to enable for this fine-tuning job.
     * @return integrations
     */
    public List<FineTuningJobIntegrationsInner> getIntegrations() {
        return integrations;
    }

    public void setIntegrations(List<FineTuningJobIntegrationsInner> integrations) {
        this.integrations = integrations;
    }

    /**
     * The seed used for the fine-tuning job.
     * @return seed
     */
    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
     * @return estimatedFinish
     */
    public Integer getEstimatedFinish() {
        return estimatedFinish;
    }

    public void setEstimatedFinish(Integer estimatedFinish) {
        this.estimatedFinish = estimatedFinish;
    }

    /**
     * Get method
     * @return method
     */
    public FineTuneMethod getMethod() {
        return method;
    }

    public void setMethod(FineTuneMethod method) {
        this.method = method;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuningJob {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    fineTunedModel: ").append(toIndentedString(fineTunedModel)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    hyperparameters: ").append(toIndentedString(hyperparameters)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    resultFiles: ").append(toIndentedString(resultFiles)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    trainedTokens: ").append(toIndentedString(trainedTokens)).append("\n");
        sb.append("    trainingFile: ").append(toIndentedString(trainingFile)).append("\n");
        sb.append("    validationFile: ").append(toIndentedString(validationFile)).append("\n");
        sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
        sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
        sb.append("    estimatedFinish: ").append(toIndentedString(estimatedFinish)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

