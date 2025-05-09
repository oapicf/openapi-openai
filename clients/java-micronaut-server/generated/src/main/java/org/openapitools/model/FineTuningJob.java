/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FineTuningJobError;
import org.openapitools.model.FineTuningJobHyperparameters;
import org.openapitools.model.FineTuningJobIntegrationsInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
 */
@Schema(name = "FineTuningJob", description = "The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. ")
@JsonPropertyOrder({
  FineTuningJob.JSON_PROPERTY_ID,
  FineTuningJob.JSON_PROPERTY_CREATED_AT,
  FineTuningJob.JSON_PROPERTY_ERROR,
  FineTuningJob.JSON_PROPERTY_FINE_TUNED_MODEL,
  FineTuningJob.JSON_PROPERTY_FINISHED_AT,
  FineTuningJob.JSON_PROPERTY_HYPERPARAMETERS,
  FineTuningJob.JSON_PROPERTY_MODEL,
  FineTuningJob.JSON_PROPERTY_OBJECT,
  FineTuningJob.JSON_PROPERTY_ORGANIZATION_ID,
  FineTuningJob.JSON_PROPERTY_RESULT_FILES,
  FineTuningJob.JSON_PROPERTY_STATUS,
  FineTuningJob.JSON_PROPERTY_TRAINED_TOKENS,
  FineTuningJob.JSON_PROPERTY_TRAINING_FILE,
  FineTuningJob.JSON_PROPERTY_VALIDATION_FILE,
  FineTuningJob.JSON_PROPERTY_INTEGRATIONS,
  FineTuningJob.JSON_PROPERTY_SEED
})
@JsonTypeName("FineTuningJob")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class FineTuningJob {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private Integer createdAt;

    public static final String JSON_PROPERTY_ERROR = "error";
    private FineTuningJobError error;

    public static final String JSON_PROPERTY_FINE_TUNED_MODEL = "fine_tuned_model";
    private String fineTunedModel;

    public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
    private Integer finishedAt;

    public static final String JSON_PROPERTY_HYPERPARAMETERS = "hyperparameters";
    private FineTuningJobHyperparameters hyperparameters;

    public static final String JSON_PROPERTY_MODEL = "model";
    private String model;

    /**
     * The object type, which is always \&quot;fine_tuning.job\&quot;.
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
        public static ObjectEnum fromValue(String value) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_OBJECT = "object";
    private ObjectEnum _object;

    public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
    private String organizationId;

    public static final String JSON_PROPERTY_RESULT_FILES = "result_files";
    private List<String> resultFiles = new ArrayList<>();

    /**
     * The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    public static final String JSON_PROPERTY_TRAINED_TOKENS = "trained_tokens";
    private Integer trainedTokens;

    public static final String JSON_PROPERTY_TRAINING_FILE = "training_file";
    private String trainingFile;

    public static final String JSON_PROPERTY_VALIDATION_FILE = "validation_file";
    private String validationFile;

    public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
    private List<FineTuningJobIntegrationsInner> integrations = null;

    public static final String JSON_PROPERTY_SEED = "seed";
    private Integer seed;

    public FineTuningJob(String id, Integer createdAt, FineTuningJobError error, String fineTunedModel, Integer finishedAt, FineTuningJobHyperparameters hyperparameters, String model, ObjectEnum _object, String organizationId, List<String> resultFiles, StatusEnum status, Integer trainedTokens, String trainingFile, String validationFile, Integer seed) {
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
        this.seed = seed;
    }

    public FineTuningJob id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The object identifier, which can be referenced in the API endpoints.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The object identifier, which can be referenced in the API endpoints.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public FineTuningJob createdAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the fine-tuning job was created.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public FineTuningJob error(FineTuningJobError error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     * @return error
     */
    @Valid
    @Nullable
    @Schema(name = "error", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ERROR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public FineTuningJobError getError() {
        return error;
    }

    @JsonProperty(JSON_PROPERTY_ERROR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setError(FineTuningJobError error) {
        this.error = error;
    }

    public FineTuningJob fineTunedModel(String fineTunedModel) {
        this.fineTunedModel = fineTunedModel;
        return this;
    }

    /**
     * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     * @return fineTunedModel
     */
    @Nullable
    @Schema(name = "fine_tuned_model", description = "The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_FINE_TUNED_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getFineTunedModel() {
        return fineTunedModel;
    }

    @JsonProperty(JSON_PROPERTY_FINE_TUNED_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFineTunedModel(String fineTunedModel) {
        this.fineTunedModel = fineTunedModel;
    }

    public FineTuningJob finishedAt(Integer finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     * @return finishedAt
     */
    @Nullable
    @Schema(name = "finished_at", description = "The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_FINISHED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getFinishedAt() {
        return finishedAt;
    }

    @JsonProperty(JSON_PROPERTY_FINISHED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFinishedAt(Integer finishedAt) {
        this.finishedAt = finishedAt;
    }

    public FineTuningJob hyperparameters(FineTuningJobHyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
        return this;
    }

    /**
     * Get hyperparameters
     * @return hyperparameters
     */
    @Valid
    @NotNull
    @Schema(name = "hyperparameters", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_HYPERPARAMETERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public FineTuningJobHyperparameters getHyperparameters() {
        return hyperparameters;
    }

    @JsonProperty(JSON_PROPERTY_HYPERPARAMETERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHyperparameters(FineTuningJobHyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
    }

    public FineTuningJob model(String model) {
        this.model = model;
        return this;
    }

    /**
     * The base model that is being fine-tuned.
     * @return model
     */
    @NotNull
    @Schema(name = "model", description = "The base model that is being fine-tuned.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getModel() {
        return model;
    }

    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setModel(String model) {
        this.model = model;
    }

    public FineTuningJob _object(ObjectEnum _object) {
        this._object = _object;
        return this;
    }

    /**
     * The object type, which is always \&quot;fine_tuning.job\&quot;.
     * @return _object
     */
    @NotNull
    @Schema(name = "object", description = "The object type, which is always \"fine_tuning.job\".", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ObjectEnum getObject() {
        return _object;
    }

    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    public FineTuningJob organizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * The organization that owns the fine-tuning job.
     * @return organizationId
     */
    @NotNull
    @Schema(name = "organization_id", description = "The organization that owns the fine-tuning job.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOrganizationId() {
        return organizationId;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public FineTuningJob resultFiles(List<String> resultFiles) {
        this.resultFiles = resultFiles;
        return this;
    }

    public FineTuningJob addResultFilesItem(String resultFilesItem) {
        this.resultFiles.add(resultFilesItem);
        return this;
    }

    /**
     * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return resultFiles
     */
    @NotNull
    @Schema(name = "result_files", description = "The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_RESULT_FILES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getResultFiles() {
        return resultFiles;
    }

    @JsonProperty(JSON_PROPERTY_RESULT_FILES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setResultFiles(List<String> resultFiles) {
        this.resultFiles = resultFiles;
    }

    public FineTuningJob status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
     * @return status
     */
    @NotNull
    @Schema(name = "status", description = "The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public FineTuningJob trainedTokens(Integer trainedTokens) {
        this.trainedTokens = trainedTokens;
        return this;
    }

    /**
     * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     * @return trainedTokens
     */
    @Nullable
    @Schema(name = "trained_tokens", description = "The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TRAINED_TOKENS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getTrainedTokens() {
        return trainedTokens;
    }

    @JsonProperty(JSON_PROPERTY_TRAINED_TOKENS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTrainedTokens(Integer trainedTokens) {
        this.trainedTokens = trainedTokens;
    }

    public FineTuningJob trainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
        return this;
    }

    /**
     * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return trainingFile
     */
    @NotNull
    @Schema(name = "training_file", description = "The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TRAINING_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTrainingFile() {
        return trainingFile;
    }

    @JsonProperty(JSON_PROPERTY_TRAINING_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTrainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
    }

    public FineTuningJob validationFile(String validationFile) {
        this.validationFile = validationFile;
        return this;
    }

    /**
     * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return validationFile
     */
    @Nullable
    @Schema(name = "validation_file", description = "The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_VALIDATION_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getValidationFile() {
        return validationFile;
    }

    @JsonProperty(JSON_PROPERTY_VALIDATION_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValidationFile(String validationFile) {
        this.validationFile = validationFile;
    }

    public FineTuningJob integrations(List<FineTuningJobIntegrationsInner> integrations) {
        this.integrations = integrations;
        return this;
    }

    public FineTuningJob addIntegrationsItem(FineTuningJobIntegrationsInner integrationsItem) {
        if (this.integrations == null) {
            this.integrations = new ArrayList<>();
        }
        this.integrations.add(integrationsItem);
        return this;
    }

    /**
     * A list of integrations to enable for this fine-tuning job.
     * @return integrations
     */
    @Nullable
    @Size(max=5)
    @Schema(name = "integrations", description = "A list of integrations to enable for this fine-tuning job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<FineTuningJobIntegrationsInner> getIntegrations() {
        return integrations;
    }

    @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIntegrations(List<FineTuningJobIntegrationsInner> integrations) {
        this.integrations = integrations;
    }

    public FineTuningJob seed(Integer seed) {
        this.seed = seed;
        return this;
    }

    /**
     * The seed used for the fine-tuning job.
     * @return seed
     */
    @NotNull
    @Schema(name = "seed", description = "The seed used for the fine-tuning job.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SEED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getSeed() {
        return seed;
    }

    @JsonProperty(JSON_PROPERTY_SEED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FineTuningJob fineTuningJob = (FineTuningJob) o;
        return Objects.equals(this.id, fineTuningJob.id) &&
            Objects.equals(this.createdAt, fineTuningJob.createdAt) &&
            Objects.equals(this.error, fineTuningJob.error) &&
            Objects.equals(this.fineTunedModel, fineTuningJob.fineTunedModel) &&
            Objects.equals(this.finishedAt, fineTuningJob.finishedAt) &&
            Objects.equals(this.hyperparameters, fineTuningJob.hyperparameters) &&
            Objects.equals(this.model, fineTuningJob.model) &&
            Objects.equals(this._object, fineTuningJob._object) &&
            Objects.equals(this.organizationId, fineTuningJob.organizationId) &&
            Objects.equals(this.resultFiles, fineTuningJob.resultFiles) &&
            Objects.equals(this.status, fineTuningJob.status) &&
            Objects.equals(this.trainedTokens, fineTuningJob.trainedTokens) &&
            Objects.equals(this.trainingFile, fineTuningJob.trainingFile) &&
            Objects.equals(this.validationFile, fineTuningJob.validationFile) &&
            Objects.equals(this.integrations, fineTuningJob.integrations) &&
            Objects.equals(this.seed, fineTuningJob.seed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, error, fineTunedModel, finishedAt, hyperparameters, model, _object, organizationId, resultFiles, status, trainedTokens, trainingFile, validationFile, integrations, seed);
    }

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
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

