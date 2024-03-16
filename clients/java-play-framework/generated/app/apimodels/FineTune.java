package apimodels;

import apimodels.FineTuneEvent;
import apimodels.OpenAIFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FineTune
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FineTune   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("object")
  @NotNull

  private String _object;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("updated_at")
  @NotNull

  private Integer updatedAt;

  @JsonProperty("model")
  @NotNull

  private String model;

  @JsonProperty("fine_tuned_model")
  @NotNull

  private String fineTunedModel;

  @JsonProperty("organization_id")
  @NotNull

  private String organizationId;

  @JsonProperty("status")
  @NotNull

  private String status;

  @JsonProperty("hyperparams")
  @NotNull

  private Object hyperparams;

  @JsonProperty("training_files")
  @NotNull
@Valid

  private List<@Valid OpenAIFile> trainingFiles = new ArrayList<>();

  @JsonProperty("validation_files")
  @NotNull
@Valid

  private List<@Valid OpenAIFile> validationFiles = new ArrayList<>();

  @JsonProperty("result_files")
  @NotNull
@Valid

  private List<@Valid OpenAIFile> resultFiles = new ArrayList<>();

  @JsonProperty("events")
  @Valid

  private List<@Valid FineTuneEvent> events = null;

  public FineTune id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FineTune _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public FineTune createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public FineTune updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  public FineTune model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public FineTune fineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
    return this;
  }

   /**
   * Get fineTunedModel
   * @return fineTunedModel
  **/
  public String getFineTunedModel() {
    return fineTunedModel;
  }

  public void setFineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }

  public FineTune organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public FineTune status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FineTune hyperparams(Object hyperparams) {
    this.hyperparams = hyperparams;
    return this;
  }

   /**
   * Get hyperparams
   * @return hyperparams
  **/
  public Object getHyperparams() {
    return hyperparams;
  }

  public void setHyperparams(Object hyperparams) {
    this.hyperparams = hyperparams;
  }

  public FineTune trainingFiles(List<@Valid OpenAIFile> trainingFiles) {
    this.trainingFiles = trainingFiles;
    return this;
  }

  public FineTune addTrainingFilesItem(OpenAIFile trainingFilesItem) {
    if (this.trainingFiles == null) {
      this.trainingFiles = new ArrayList<>();
    }
    this.trainingFiles.add(trainingFilesItem);
    return this;
  }

   /**
   * Get trainingFiles
   * @return trainingFiles
  **/
  public List<@Valid OpenAIFile> getTrainingFiles() {
    return trainingFiles;
  }

  public void setTrainingFiles(List<@Valid OpenAIFile> trainingFiles) {
    this.trainingFiles = trainingFiles;
  }

  public FineTune validationFiles(List<@Valid OpenAIFile> validationFiles) {
    this.validationFiles = validationFiles;
    return this;
  }

  public FineTune addValidationFilesItem(OpenAIFile validationFilesItem) {
    if (this.validationFiles == null) {
      this.validationFiles = new ArrayList<>();
    }
    this.validationFiles.add(validationFilesItem);
    return this;
  }

   /**
   * Get validationFiles
   * @return validationFiles
  **/
  public List<@Valid OpenAIFile> getValidationFiles() {
    return validationFiles;
  }

  public void setValidationFiles(List<@Valid OpenAIFile> validationFiles) {
    this.validationFiles = validationFiles;
  }

  public FineTune resultFiles(List<@Valid OpenAIFile> resultFiles) {
    this.resultFiles = resultFiles;
    return this;
  }

  public FineTune addResultFilesItem(OpenAIFile resultFilesItem) {
    if (this.resultFiles == null) {
      this.resultFiles = new ArrayList<>();
    }
    this.resultFiles.add(resultFilesItem);
    return this;
  }

   /**
   * Get resultFiles
   * @return resultFiles
  **/
  public List<@Valid OpenAIFile> getResultFiles() {
    return resultFiles;
  }

  public void setResultFiles(List<@Valid OpenAIFile> resultFiles) {
    this.resultFiles = resultFiles;
  }

  public FineTune events(List<@Valid FineTuneEvent> events) {
    this.events = events;
    return this;
  }

  public FineTune addEventsItem(FineTuneEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  public List<@Valid FineTuneEvent> getEvents() {
    return events;
  }

  public void setEvents(List<@Valid FineTuneEvent> events) {
    this.events = events;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTune fineTune = (FineTune) o;
    return Objects.equals(id, fineTune.id) &&
        Objects.equals(_object, fineTune._object) &&
        Objects.equals(createdAt, fineTune.createdAt) &&
        Objects.equals(updatedAt, fineTune.updatedAt) &&
        Objects.equals(model, fineTune.model) &&
        Objects.equals(fineTunedModel, fineTune.fineTunedModel) &&
        Objects.equals(organizationId, fineTune.organizationId) &&
        Objects.equals(status, fineTune.status) &&
        Objects.equals(hyperparams, fineTune.hyperparams) &&
        Objects.equals(trainingFiles, fineTune.trainingFiles) &&
        Objects.equals(validationFiles, fineTune.validationFiles) &&
        Objects.equals(resultFiles, fineTune.resultFiles) &&
        Objects.equals(events, fineTune.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, updatedAt, model, fineTunedModel, organizationId, status, hyperparams, trainingFiles, validationFiles, resultFiles, events);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTune {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    fineTunedModel: ").append(toIndentedString(fineTunedModel)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hyperparams: ").append(toIndentedString(hyperparams)).append("\n");
    sb.append("    trainingFiles: ").append(toIndentedString(trainingFiles)).append("\n");
    sb.append("    validationFiles: ").append(toIndentedString(validationFiles)).append("\n");
    sb.append("    resultFiles: ").append(toIndentedString(resultFiles)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

