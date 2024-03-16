package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTuneEvent;
import org.openapitools.model.OpenAIFile;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FineTune
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-16T01:13:12.257183065Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTune {

  private String id;

  private String _object;

  private Integer createdAt;

  private Integer updatedAt;

  private String model;

  private JsonNullable<String> fineTunedModel = JsonNullable.<String>undefined();

  private String organizationId;

  private String status;

  private Object hyperparams;

  @Valid
  private List<@Valid OpenAIFile> trainingFiles = new ArrayList<>();

  @Valid
  private List<@Valid OpenAIFile> validationFiles = new ArrayList<>();

  @Valid
  private List<@Valid OpenAIFile> resultFiles = new ArrayList<>();

  @Valid
  private List<@Valid FineTuneEvent> events;

  public FineTune() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FineTune(String id, String _object, Integer createdAt, Integer updatedAt, String model, String fineTunedModel, String organizationId, String status, Object hyperparams, List<@Valid OpenAIFile> trainingFiles, List<@Valid OpenAIFile> validationFiles, List<@Valid OpenAIFile> resultFiles) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.model = model;
    this.fineTunedModel = JsonNullable.of(fineTunedModel);
    this.organizationId = organizationId;
    this.status = status;
    this.hyperparams = hyperparams;
    this.trainingFiles = trainingFiles;
    this.validationFiles = validationFiles;
    this.resultFiles = resultFiles;
  }

  public FineTune id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
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
  */
  @NotNull 
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
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
  */
  @NotNull 
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_at")
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
  */
  @NotNull 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public FineTune fineTunedModel(String fineTunedModel) {
    this.fineTunedModel = JsonNullable.of(fineTunedModel);
    return this;
  }

  /**
   * Get fineTunedModel
   * @return fineTunedModel
  */
  @NotNull 
  @Schema(name = "fine_tuned_model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fine_tuned_model")
  public JsonNullable<String> getFineTunedModel() {
    return fineTunedModel;
  }

  public void setFineTunedModel(JsonNullable<String> fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }

  public FineTune organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId
   * @return organizationId
  */
  @NotNull 
  @Schema(name = "organization_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("organization_id")
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
  */
  @NotNull 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
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
  */
  @NotNull 
  @Schema(name = "hyperparams", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hyperparams")
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
  */
  @NotNull @Valid 
  @Schema(name = "training_files", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("training_files")
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
  */
  @NotNull @Valid 
  @Schema(name = "validation_files", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validation_files")
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
  */
  @NotNull @Valid 
  @Schema(name = "result_files", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("result_files")
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
  */
  @Valid 
  @Schema(name = "events", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("events")
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
    return Objects.equals(this.id, fineTune.id) &&
        Objects.equals(this._object, fineTune._object) &&
        Objects.equals(this.createdAt, fineTune.createdAt) &&
        Objects.equals(this.updatedAt, fineTune.updatedAt) &&
        Objects.equals(this.model, fineTune.model) &&
        Objects.equals(this.fineTunedModel, fineTune.fineTunedModel) &&
        Objects.equals(this.organizationId, fineTune.organizationId) &&
        Objects.equals(this.status, fineTune.status) &&
        Objects.equals(this.hyperparams, fineTune.hyperparams) &&
        Objects.equals(this.trainingFiles, fineTune.trainingFiles) &&
        Objects.equals(this.validationFiles, fineTune.validationFiles) &&
        Objects.equals(this.resultFiles, fineTune.resultFiles) &&
        Objects.equals(this.events, fineTune.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, updatedAt, model, fineTunedModel, organizationId, status, hyperparams, trainingFiles, validationFiles, resultFiles, events);
  }

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

