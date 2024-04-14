package apimodels;

import apimodels.FineTuningJobError;
import apimodels.FineTuningJobHyperparameters;
import apimodels.FineTuningJobIntegrationsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FineTuningJob   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("error")
  @NotNull
@Valid

  private FineTuningJobError error;

  @JsonProperty("fine_tuned_model")
  @NotNull

  private String fineTunedModel;

  @JsonProperty("finished_at")
  @NotNull

  private Integer finishedAt;

  @JsonProperty("hyperparameters")
  @NotNull
@Valid

  private FineTuningJobHyperparameters hyperparameters;

  @JsonProperty("model")
  @NotNull

  private String model;

  /**
   * The object type, which is always \"fine_tuning.job\".
   */
  public enum ObjectEnum {
    FINE_TUNING_JOB("fine_tuning.job");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  @JsonProperty("organization_id")
  @NotNull

  private String organizationId;

  @JsonProperty("result_files")
  @NotNull

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

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("status")
  @NotNull

  private StatusEnum status;

  @JsonProperty("trained_tokens")
  @NotNull

  private Integer trainedTokens;

  @JsonProperty("training_file")
  @NotNull

  private String trainingFile;

  @JsonProperty("validation_file")
  @NotNull

  private String validationFile;

  @JsonProperty("integrations")
  @Size(max=5)
@Valid

  private List<FineTuningJobIntegrationsInner> integrations = null;

  @JsonProperty("seed")
  @NotNull

  private Integer seed;

  public FineTuningJob id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The object identifier, which can be referenced in the API endpoints.
   * @return id
  **/
  public String getId() {
    return id;
  }

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
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

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
  **/
  public FineTuningJobError getError() {
    return error;
  }

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
  **/
  public String getFineTunedModel() {
    return fineTunedModel;
  }

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
  **/
  public Integer getFinishedAt() {
    return finishedAt;
  }

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
  **/
  public FineTuningJobHyperparameters getHyperparameters() {
    return hyperparameters;
  }

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
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public FineTuningJob _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always \"fine_tuning.job\".
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

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
  **/
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public FineTuningJob resultFiles(List<String> resultFiles) {
    this.resultFiles = resultFiles;
    return this;
  }

  public FineTuningJob addResultFilesItem(String resultFilesItem) {
    if (this.resultFiles == null) {
      this.resultFiles = new ArrayList<>();
    }
    this.resultFiles.add(resultFilesItem);
    return this;
  }

   /**
   * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
   * @return resultFiles
  **/
  public List<String> getResultFiles() {
    return resultFiles;
  }

  public void setResultFiles(List<String> resultFiles) {
    this.resultFiles = resultFiles;
  }

  public FineTuningJob status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

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
  **/
  public Integer getTrainedTokens() {
    return trainedTokens;
  }

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
  **/
  public String getTrainingFile() {
    return trainingFile;
  }

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
  **/
  public String getValidationFile() {
    return validationFile;
  }

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
  **/
  public List<FineTuningJobIntegrationsInner> getIntegrations() {
    return integrations;
  }

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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

