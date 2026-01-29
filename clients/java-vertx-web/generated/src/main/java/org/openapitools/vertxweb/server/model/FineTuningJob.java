package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.FineTuningJobError;
import org.openapitools.vertxweb.server.model.FineTuningJobHyperparameters;
import org.openapitools.vertxweb.server.model.FineTuningJobIntegrationsInner;

/**
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuningJob   {
  
  private String id;
  private Integer createdAt;
  private FineTuningJobError error;
  private String fineTunedModel;
  private Integer finishedAt;
  private FineTuningJobHyperparameters hyperparameters;
  private String model;


  public enum ObjectEnum {
    FINE_TUNING_JOB("fine_tuning.job");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private String organizationId;
  private List<String> resultFiles = new ArrayList<>();


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

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status;
  private Integer trainedTokens;
  private String trainingFile;
  private String validationFile;
  private List<FineTuningJobIntegrationsInner> integrations;
  private Integer seed;

  public FineTuningJob () {

  }

  public FineTuningJob (String id, Integer createdAt, FineTuningJobError error, String fineTunedModel, Integer finishedAt, FineTuningJobHyperparameters hyperparameters, String model, ObjectEnum _object, String organizationId, List<String> resultFiles, StatusEnum status, Integer trainedTokens, String trainingFile, String validationFile, List<FineTuningJobIntegrationsInner> integrations, Integer seed) {
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
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("error")
  public FineTuningJobError getError() {
    return error;
  }
  public void setError(FineTuningJobError error) {
    this.error = error;
  }

    
  @JsonProperty("fine_tuned_model")
  public String getFineTunedModel() {
    return fineTunedModel;
  }
  public void setFineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }

    
  @JsonProperty("finished_at")
  public Integer getFinishedAt() {
    return finishedAt;
  }
  public void setFinishedAt(Integer finishedAt) {
    this.finishedAt = finishedAt;
  }

    
  @JsonProperty("hyperparameters")
  public FineTuningJobHyperparameters getHyperparameters() {
    return hyperparameters;
  }
  public void setHyperparameters(FineTuningJobHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("organization_id")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

    
  @JsonProperty("result_files")
  public List<String> getResultFiles() {
    return resultFiles;
  }
  public void setResultFiles(List<String> resultFiles) {
    this.resultFiles = resultFiles;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("trained_tokens")
  public Integer getTrainedTokens() {
    return trainedTokens;
  }
  public void setTrainedTokens(Integer trainedTokens) {
    this.trainedTokens = trainedTokens;
  }

    
  @JsonProperty("training_file")
  public String getTrainingFile() {
    return trainingFile;
  }
  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

    
  @JsonProperty("validation_file")
  public String getValidationFile() {
    return validationFile;
  }
  public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
  }

    
  @JsonProperty("integrations")
  public List<FineTuningJobIntegrationsInner> getIntegrations() {
    return integrations;
  }
  public void setIntegrations(List<FineTuningJobIntegrationsInner> integrations) {
    this.integrations = integrations;
  }

    
  @JsonProperty("seed")
  public Integer getSeed() {
    return seed;
  }
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
    return Objects.equals(id, fineTuningJob.id) &&
        Objects.equals(createdAt, fineTuningJob.createdAt) &&
        Objects.equals(error, fineTuningJob.error) &&
        Objects.equals(fineTunedModel, fineTuningJob.fineTunedModel) &&
        Objects.equals(finishedAt, fineTuningJob.finishedAt) &&
        Objects.equals(hyperparameters, fineTuningJob.hyperparameters) &&
        Objects.equals(model, fineTuningJob.model) &&
        Objects.equals(_object, fineTuningJob._object) &&
        Objects.equals(organizationId, fineTuningJob.organizationId) &&
        Objects.equals(resultFiles, fineTuningJob.resultFiles) &&
        Objects.equals(status, fineTuningJob.status) &&
        Objects.equals(trainedTokens, fineTuningJob.trainedTokens) &&
        Objects.equals(trainingFile, fineTuningJob.trainingFile) &&
        Objects.equals(validationFile, fineTuningJob.validationFile) &&
        Objects.equals(integrations, fineTuningJob.integrations) &&
        Objects.equals(seed, fineTuningJob.seed);
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
