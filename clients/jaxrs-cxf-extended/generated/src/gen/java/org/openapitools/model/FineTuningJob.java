package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FineTuneMethod;
import org.openapitools.model.FineTuningJobError;
import org.openapitools.model.FineTuningJobHyperparameters;
import org.openapitools.model.FineTuningJobIntegrationsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
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
  @Valid
  private FineTuningJobHyperparameters hyperparameters;

 /**
  * The base model that is being fine-tuned.
  */
  @ApiModelProperty(required = true, value = "The base model that is being fine-tuned.")
  private String model;

public enum ObjectEnum {

    @JsonProperty("fine_tuning.job") FINE_TUNING_JOB(String.valueOf("fine_tuning.job"));

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

    @JsonProperty("validating_files") VALIDATING_FILES(String.valueOf("validating_files")),
    @JsonProperty("queued") QUEUED(String.valueOf("queued")),
    @JsonProperty("running") RUNNING(String.valueOf("running")),
    @JsonProperty("succeeded") SUCCEEDED(String.valueOf("succeeded")),
    @JsonProperty("failed") FAILED(String.valueOf("failed")),
    @JsonProperty("cancelled") CANCELLED(String.valueOf("cancelled"));

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
  @Valid
  private List<FineTuningJobIntegrationsInner> integrations;

 /**
  * The seed used for the fine-tuning job.
  */
  @ApiModelProperty(required = true, value = "The seed used for the fine-tuning job.")
  private Integer seed;

 /**
  * The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.")
  private Integer estimatedFinish;

  @ApiModelProperty(value = "")
  @Valid
  private FineTuneMethod method;
 /**
  * The object identifier, which can be referenced in the API endpoints.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public FineTuningJob id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the fine-tuning job was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public FineTuningJob createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get error
  * @return error
  */
  @JsonProperty("error")
  @NotNull
  public FineTuningJobError getError() {
    return error;
  }

  /**
   * Sets the <code>error</code> property.
   */
 public void setError(FineTuningJobError error) {
    this.error = error;
  }

  /**
   * Sets the <code>error</code> property.
   */
  public FineTuningJob error(FineTuningJobError error) {
    this.error = error;
    return this;
  }

 /**
  * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
  * @return fineTunedModel
  */
  @JsonProperty("fine_tuned_model")
  @NotNull
  public String getFineTunedModel() {
    return fineTunedModel;
  }

  /**
   * Sets the <code>fineTunedModel</code> property.
   */
 public void setFineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }

  /**
   * Sets the <code>fineTunedModel</code> property.
   */
  public FineTuningJob fineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
  * @return finishedAt
  */
  @JsonProperty("finished_at")
  @NotNull
  public Integer getFinishedAt() {
    return finishedAt;
  }

  /**
   * Sets the <code>finishedAt</code> property.
   */
 public void setFinishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
  }

  /**
   * Sets the <code>finishedAt</code> property.
   */
  public FineTuningJob finishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

 /**
  * Get hyperparameters
  * @return hyperparameters
  */
  @JsonProperty("hyperparameters")
  @NotNull
  public FineTuningJobHyperparameters getHyperparameters() {
    return hyperparameters;
  }

  /**
   * Sets the <code>hyperparameters</code> property.
   */
 public void setHyperparameters(FineTuningJobHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

  /**
   * Sets the <code>hyperparameters</code> property.
   */
  public FineTuningJob hyperparameters(FineTuningJobHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

 /**
  * The base model that is being fine-tuned.
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public FineTuningJob model(String model) {
    this.model = model;
    return this;
  }

 /**
  * The object type, which is always \&quot;fine_tuning.job\&quot;.
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public FineTuningJob _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The organization that owns the fine-tuning job.
  * @return organizationId
  */
  @JsonProperty("organization_id")
  @NotNull
  public String getOrganizationId() {
    return organizationId;
  }

  /**
   * Sets the <code>organizationId</code> property.
   */
 public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   * Sets the <code>organizationId</code> property.
   */
  public FineTuningJob organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

 /**
  * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
  * @return resultFiles
  */
  @JsonProperty("result_files")
  @NotNull
  public List<String> getResultFiles() {
    return resultFiles;
  }

  /**
   * Sets the <code>resultFiles</code> property.
   */
 public void setResultFiles(List<String> resultFiles) {
    this.resultFiles = resultFiles;
  }

  /**
   * Sets the <code>resultFiles</code> property.
   */
  public FineTuningJob resultFiles(List<String> resultFiles) {
    this.resultFiles = resultFiles;
    return this;
  }

  /**
   * Adds a new item to the <code>resultFiles</code> list.
   */
  public FineTuningJob addResultFilesItem(String resultFilesItem) {
    this.resultFiles.add(resultFilesItem);
    return this;
  }

 /**
  * The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public FineTuningJob status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
  * @return trainedTokens
  */
  @JsonProperty("trained_tokens")
  @NotNull
  public Integer getTrainedTokens() {
    return trainedTokens;
  }

  /**
   * Sets the <code>trainedTokens</code> property.
   */
 public void setTrainedTokens(Integer trainedTokens) {
    this.trainedTokens = trainedTokens;
  }

  /**
   * Sets the <code>trainedTokens</code> property.
   */
  public FineTuningJob trainedTokens(Integer trainedTokens) {
    this.trainedTokens = trainedTokens;
    return this;
  }

 /**
  * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
  * @return trainingFile
  */
  @JsonProperty("training_file")
  @NotNull
  public String getTrainingFile() {
    return trainingFile;
  }

  /**
   * Sets the <code>trainingFile</code> property.
   */
 public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

  /**
   * Sets the <code>trainingFile</code> property.
   */
  public FineTuningJob trainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
    return this;
  }

 /**
  * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
  * @return validationFile
  */
  @JsonProperty("validation_file")
  @NotNull
  public String getValidationFile() {
    return validationFile;
  }

  /**
   * Sets the <code>validationFile</code> property.
   */
 public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
  }

  /**
   * Sets the <code>validationFile</code> property.
   */
  public FineTuningJob validationFile(String validationFile) {
    this.validationFile = validationFile;
    return this;
  }

 /**
  * A list of integrations to enable for this fine-tuning job.
  * @return integrations
  */
  @JsonProperty("integrations")
 @Size(max=5)  public List<FineTuningJobIntegrationsInner> getIntegrations() {
    return integrations;
  }

  /**
   * Sets the <code>integrations</code> property.
   */
 public void setIntegrations(List<FineTuningJobIntegrationsInner> integrations) {
    this.integrations = integrations;
  }

  /**
   * Sets the <code>integrations</code> property.
   */
  public FineTuningJob integrations(List<FineTuningJobIntegrationsInner> integrations) {
    this.integrations = integrations;
    return this;
  }

  /**
   * Adds a new item to the <code>integrations</code> list.
   */
  public FineTuningJob addIntegrationsItem(FineTuningJobIntegrationsInner integrationsItem) {
    this.integrations.add(integrationsItem);
    return this;
  }

 /**
  * The seed used for the fine-tuning job.
  * @return seed
  */
  @JsonProperty("seed")
  @NotNull
  public Integer getSeed() {
    return seed;
  }

  /**
   * Sets the <code>seed</code> property.
   */
 public void setSeed(Integer seed) {
    this.seed = seed;
  }

  /**
   * Sets the <code>seed</code> property.
   */
  public FineTuningJob seed(Integer seed) {
    this.seed = seed;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
  * @return estimatedFinish
  */
  @JsonProperty("estimated_finish")
  public Integer getEstimatedFinish() {
    return estimatedFinish;
  }

  /**
   * Sets the <code>estimatedFinish</code> property.
   */
 public void setEstimatedFinish(Integer estimatedFinish) {
    this.estimatedFinish = estimatedFinish;
  }

  /**
   * Sets the <code>estimatedFinish</code> property.
   */
  public FineTuningJob estimatedFinish(Integer estimatedFinish) {
    this.estimatedFinish = estimatedFinish;
    return this;
  }

 /**
  * Get method
  * @return method
  */
  @JsonProperty("method")
  public FineTuneMethod getMethod() {
    return method;
  }

  /**
   * Sets the <code>method</code> property.
   */
 public void setMethod(FineTuneMethod method) {
    this.method = method;
  }

  /**
   * Sets the <code>method</code> property.
   */
  public FineTuningJob method(FineTuneMethod method) {
    this.method = method;
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
        Objects.equals(this.seed, fineTuningJob.seed) &&
        Objects.equals(this.estimatedFinish, fineTuningJob.estimatedFinish) &&
        Objects.equals(this.method, fineTuningJob.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, error, fineTunedModel, finishedAt, hyperparameters, model, _object, organizationId, resultFiles, status, trainedTokens, trainingFile, validationFile, integrations, seed, estimatedFinish, method);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

