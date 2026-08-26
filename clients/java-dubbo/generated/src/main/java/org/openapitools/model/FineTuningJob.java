package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FineTuneMethod;
import org.openapitools.model.FineTuningJobError;
import org.openapitools.model.FineTuningJobHyperparameters;
import org.openapitools.model.FineTuningJobIntegrationsInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
 */
public class FineTuningJob implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The object identifier, which can be referenced in the API endpoints.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was created.
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("error")
  private FineTuningJobError error;

  /**
   * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
   */
  @JsonProperty("fine_tuned_model")
  private String fineTunedModel;

  /**
   * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
   */
  @JsonProperty("finished_at")
  private Integer finishedAt;

  @JsonProperty("hyperparameters")
  private FineTuningJobHyperparameters hyperparameters;

  /**
   * The base model that is being fine-tuned.
   */
  @JsonProperty("model")
  private String model;

  /**
   * The object type, which is always \&quot;fine_tuning.job\&quot;.
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The organization that owns the fine-tuning job.
   */
  @JsonProperty("organization_id")
  private String organizationId;

  /**
   * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
   */
  @JsonProperty("result_files")
  private List<String> resultFiles = new ArrayList<>();

  /**
   * The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
   */
  @JsonProperty("status")
  private String status;

  /**
   * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
   */
  @JsonProperty("trained_tokens")
  private Integer trainedTokens;

  /**
   * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
   */
  @JsonProperty("training_file")
  private String trainingFile;

  /**
   * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
   */
  @JsonProperty("validation_file")
  private String validationFile;

  /**
   * A list of integrations to enable for this fine-tuning job.
   */
  @JsonProperty("integrations")
  private List<FineTuningJobIntegrationsInner> integrations;

  /**
   * The seed used for the fine-tuning job.
   */
  @JsonProperty("seed")
  private Integer seed;

  /**
   * The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
   */
  @JsonProperty("estimated_finish")
  private Integer estimatedFinish;

  @JsonProperty("method")
  private FineTuneMethod method;

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
   * 
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
   * 
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
   * The object type, which is always \&quot;fine_tuning.job\&quot;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
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
   * The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
   * 
   * @return method
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
