package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

/**
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. ")
public class FineTuningJob   {
  
  private String id;

  private Integer createdAt;

  private FineTuningJobError error;

  private String fineTunedModel;

  private Integer finishedAt;

  private FineTuningJobHyperparameters hyperparameters;

  private String model;


public enum ObjectEnum {

    @JsonProperty("fine_tuning.job") FINE_TUNING_JOB(String.valueOf("fine_tuning.job"));


    private String value;

    ObjectEnum(String v) {
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

  private ObjectEnum _object;

  private String organizationId;

  private List<String> resultFiles = new ArrayList<>();


public enum StatusEnum {

    @JsonProperty("validating_files") VALIDATING_FILES(String.valueOf("validating_files")), @JsonProperty("queued") QUEUED(String.valueOf("queued")), @JsonProperty("running") RUNNING(String.valueOf("running")), @JsonProperty("succeeded") SUCCEEDED(String.valueOf("succeeded")), @JsonProperty("failed") FAILED(String.valueOf("failed")), @JsonProperty("cancelled") CANCELLED(String.valueOf("cancelled"));


    private String value;

    StatusEnum(String v) {
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

  private StatusEnum status;

  private Integer trainedTokens;

  private String trainingFile;

  private String validationFile;

  private List<FineTuningJobIntegrationsInner> integrations;

  private Integer seed;

  private Integer estimatedFinish;

  private FineTuneMethod method;

  /**
   * The object identifier, which can be referenced in the API endpoints.
   **/
  public FineTuningJob id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object identifier, which can be referenced in the API endpoints.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was created.
   **/
  public FineTuningJob createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the fine-tuning job was created.")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  /**
   **/
  public FineTuningJob error(FineTuningJobError error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("error")
  @NotNull
  public FineTuningJobError getError() {
    return error;
  }
  public void setError(FineTuningJobError error) {
    this.error = error;
  }


  /**
   * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
   **/
  public FineTuningJob fineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.")
  @JsonProperty("fine_tuned_model")
  @NotNull
  public String getFineTunedModel() {
    return fineTunedModel;
  }
  public void setFineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }


  /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
   **/
  public FineTuningJob finishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.")
  @JsonProperty("finished_at")
  @NotNull
  public Integer getFinishedAt() {
    return finishedAt;
  }
  public void setFinishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
  }


  /**
   **/
  public FineTuningJob hyperparameters(FineTuningJobHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hyperparameters")
  @NotNull
  public FineTuningJobHyperparameters getHyperparameters() {
    return hyperparameters;
  }
  public void setHyperparameters(FineTuningJobHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }


  /**
   * The base model that is being fine-tuned.
   **/
  public FineTuningJob model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The base model that is being fine-tuned.")
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }


  /**
   * The object type, which is always \&quot;fine_tuning.job\&quot;.
   **/
  public FineTuningJob _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job\".")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  /**
   * The organization that owns the fine-tuning job.
   **/
  public FineTuningJob organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The organization that owns the fine-tuning job.")
  @JsonProperty("organization_id")
  @NotNull
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  /**
   * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
   **/
  public FineTuningJob resultFiles(List<String> resultFiles) {
    this.resultFiles = resultFiles;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).")
  @JsonProperty("result_files")
  @NotNull
  public List<String> getResultFiles() {
    return resultFiles;
  }
  public void setResultFiles(List<String> resultFiles) {
    this.resultFiles = resultFiles;
  }

  public FineTuningJob addResultFilesItem(String resultFilesItem) {
    if (this.resultFiles == null) {
      this.resultFiles = new ArrayList<>();
    }
    this.resultFiles.add(resultFilesItem);
    return this;
  }


  /**
   * The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
   **/
  public FineTuningJob status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.")
  @JsonProperty("status")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
   **/
  public FineTuningJob trainedTokens(Integer trainedTokens) {
    this.trainedTokens = trainedTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.")
  @JsonProperty("trained_tokens")
  @NotNull
  public Integer getTrainedTokens() {
    return trainedTokens;
  }
  public void setTrainedTokens(Integer trainedTokens) {
    this.trainedTokens = trainedTokens;
  }


  /**
   * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
   **/
  public FineTuningJob trainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).")
  @JsonProperty("training_file")
  @NotNull
  public String getTrainingFile() {
    return trainingFile;
  }
  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }


  /**
   * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
   **/
  public FineTuningJob validationFile(String validationFile) {
    this.validationFile = validationFile;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).")
  @JsonProperty("validation_file")
  @NotNull
  public String getValidationFile() {
    return validationFile;
  }
  public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
  }


  /**
   * A list of integrations to enable for this fine-tuning job.
   **/
  public FineTuningJob integrations(List<FineTuningJobIntegrationsInner> integrations) {
    this.integrations = integrations;
    return this;
  }

  
  @ApiModelProperty(value = "A list of integrations to enable for this fine-tuning job.")
  @JsonProperty("integrations")
 @Size(max=5)  public List<FineTuningJobIntegrationsInner> getIntegrations() {
    return integrations;
  }
  public void setIntegrations(List<FineTuningJobIntegrationsInner> integrations) {
    this.integrations = integrations;
  }

  public FineTuningJob addIntegrationsItem(FineTuningJobIntegrationsInner integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }


  /**
   * The seed used for the fine-tuning job.
   **/
  public FineTuningJob seed(Integer seed) {
    this.seed = seed;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The seed used for the fine-tuning job.")
  @JsonProperty("seed")
  @NotNull
  public Integer getSeed() {
    return seed;
  }
  public void setSeed(Integer seed) {
    this.seed = seed;
  }


  /**
   * The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
   **/
  public FineTuningJob estimatedFinish(Integer estimatedFinish) {
    this.estimatedFinish = estimatedFinish;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.")
  @JsonProperty("estimated_finish")
  public Integer getEstimatedFinish() {
    return estimatedFinish;
  }
  public void setEstimatedFinish(Integer estimatedFinish) {
    this.estimatedFinish = estimatedFinish;
  }


  /**
   **/
  public FineTuningJob method(FineTuneMethod method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("method")
  public FineTuneMethod getMethod() {
    return method;
  }
  public void setMethod(FineTuneMethod method) {
    this.method = method;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

