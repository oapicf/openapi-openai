package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FineTuningJobError;
import org.openapitools.model.FineTuningJobHyperparameters;
import org.openapitools.model.FineTuningJobIntegrationsInner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 */
@ApiModel(description="The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. ")

public class FineTuningJob  {
  
 /**
  * The object identifier, which can be referenced in the API endpoints.
  */
  @ApiModelProperty(required = true, value = "The object identifier, which can be referenced in the API endpoints.")

  private String id;

 /**
  * The Unix timestamp (in seconds) for when the fine-tuning job was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the fine-tuning job was created.")

  private Integer createdAt;

  @ApiModelProperty(required = true, value = "")

  private FineTuningJobError error;

 /**
  * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
  */
  @ApiModelProperty(required = true, value = "The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.")

  private String fineTunedModel;

 /**
  * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.")

  private Integer finishedAt;

  @ApiModelProperty(required = true, value = "")

  private FineTuningJobHyperparameters hyperparameters;

 /**
  * The base model that is being fine-tuned.
  */
  @ApiModelProperty(required = true, value = "The base model that is being fine-tuned.")

  private String model;

public enum ObjectEnum {

FINE_TUNING_JOB(String.valueOf("fine_tuning.job"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The object type, which is always \"fine_tuning.job\".
  */
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job\".")

  private ObjectEnum _object;

 /**
  * The organization that owns the fine-tuning job.
  */
  @ApiModelProperty(required = true, value = "The organization that owns the fine-tuning job.")

  private String organizationId;

 /**
  * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
  */
  @ApiModelProperty(required = true, value = "The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).")

  private List<String> resultFiles = new ArrayList<>();

public enum StatusEnum {

VALIDATING_FILES(String.valueOf("validating_files")), QUEUED(String.valueOf("queued")), RUNNING(String.valueOf("running")), SUCCEEDED(String.valueOf("succeeded")), FAILED(String.valueOf("failed")), CANCELLED(String.valueOf("cancelled"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  */
  @ApiModelProperty(required = true, value = "The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.")

  private StatusEnum status;

 /**
  * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
  */
  @ApiModelProperty(required = true, value = "The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.")

  private Integer trainedTokens;

 /**
  * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
  */
  @ApiModelProperty(required = true, value = "The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).")

  private String trainingFile;

 /**
  * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
  */
  @ApiModelProperty(required = true, value = "The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).")

  private String validationFile;

 /**
  * A list of integrations to enable for this fine-tuning job.
  */
  @ApiModelProperty(value = "A list of integrations to enable for this fine-tuning job.")

  private List<FineTuningJobIntegrationsInner> integrations;

 /**
  * The seed used for the fine-tuning job.
  */
  @ApiModelProperty(required = true, value = "The seed used for the fine-tuning job.")

  private Integer seed;
 /**
   * The object identifier, which can be referenced in the API endpoints.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FineTuningJob id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public FineTuningJob createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public FineTuningJobError getError() {
    return error;
  }

  public void setError(FineTuningJobError error) {
    this.error = error;
  }

  public FineTuningJob error(FineTuningJobError error) {
    this.error = error;
    return this;
  }

 /**
   * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
   * @return fineTunedModel
  **/
  @JsonProperty("fine_tuned_model")
  public String getFineTunedModel() {
    return fineTunedModel;
  }

  public void setFineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }

  public FineTuningJob fineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
   * @return finishedAt
  **/
  @JsonProperty("finished_at")
  public Integer getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
  }

  public FineTuningJob finishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

 /**
   * Get hyperparameters
   * @return hyperparameters
  **/
  @JsonProperty("hyperparameters")
  public FineTuningJobHyperparameters getHyperparameters() {
    return hyperparameters;
  }

  public void setHyperparameters(FineTuningJobHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

  public FineTuningJob hyperparameters(FineTuningJobHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

 /**
   * The base model that is being fine-tuned.
   * @return model
  **/
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public FineTuningJob model(String model) {
    this.model = model;
    return this;
  }

 /**
   * The object type, which is always \&quot;fine_tuning.job\&quot;.
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public FineTuningJob _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The organization that owns the fine-tuning job.
   * @return organizationId
  **/
  @JsonProperty("organization_id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public FineTuningJob organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

 /**
   * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
   * @return resultFiles
  **/
  @JsonProperty("result_files")
  public List<String> getResultFiles() {
    return resultFiles;
  }

  public void setResultFiles(List<String> resultFiles) {
    this.resultFiles = resultFiles;
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
   * The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public FineTuningJob status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
   * @return trainedTokens
  **/
  @JsonProperty("trained_tokens")
  public Integer getTrainedTokens() {
    return trainedTokens;
  }

  public void setTrainedTokens(Integer trainedTokens) {
    this.trainedTokens = trainedTokens;
  }

  public FineTuningJob trainedTokens(Integer trainedTokens) {
    this.trainedTokens = trainedTokens;
    return this;
  }

 /**
   * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
   * @return trainingFile
  **/
  @JsonProperty("training_file")
  public String getTrainingFile() {
    return trainingFile;
  }

  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

  public FineTuningJob trainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
    return this;
  }

 /**
   * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
   * @return validationFile
  **/
  @JsonProperty("validation_file")
  public String getValidationFile() {
    return validationFile;
  }

  public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
  }

  public FineTuningJob validationFile(String validationFile) {
    this.validationFile = validationFile;
    return this;
  }

 /**
   * A list of integrations to enable for this fine-tuning job.
   * @return integrations
  **/
  @JsonProperty("integrations")
  public List<FineTuningJobIntegrationsInner> getIntegrations() {
    return integrations;
  }

  public void setIntegrations(List<FineTuningJobIntegrationsInner> integrations) {
    this.integrations = integrations;
  }

  public FineTuningJob integrations(List<FineTuningJobIntegrationsInner> integrations) {
    this.integrations = integrations;
    return this;
  }

  public FineTuningJob addIntegrationsItem(FineTuningJobIntegrationsInner integrationsItem) {
    this.integrations.add(integrationsItem);
    return this;
  }

 /**
   * The seed used for the fine-tuning job.
   * @return seed
  **/
  @JsonProperty("seed")
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(Integer seed) {
    this.seed = seed;
  }

  public FineTuningJob seed(Integer seed) {
    this.seed = seed;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

