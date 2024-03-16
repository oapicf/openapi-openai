package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTuneEvent;
import org.openapitools.model.OpenAIFile;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("FineTune")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTune   {
  private @Valid String id;
  private @Valid String _object;
  private @Valid Integer createdAt;
  private @Valid Integer updatedAt;
  private @Valid String model;
  private @Valid String fineTunedModel;
  private @Valid String organizationId;
  private @Valid String status;
  private @Valid Object hyperparams;
  private @Valid List<@Valid OpenAIFile> trainingFiles = new ArrayList<>();
  private @Valid List<@Valid OpenAIFile> validationFiles = new ArrayList<>();
  private @Valid List<@Valid OpenAIFile> resultFiles = new ArrayList<>();
  private @Valid List<@Valid FineTuneEvent> events;

  /**
   **/
  public FineTune id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public FineTune _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  public FineTune createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public FineTune updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("updated_at")
  @NotNull
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updated_at")
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  public FineTune model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }

  @JsonProperty("model")
  public void setModel(String model) {
    this.model = model;
  }

  /**
   **/
  public FineTune fineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("fine_tuned_model")
  @NotNull
  public String getFineTunedModel() {
    return fineTunedModel;
  }

  @JsonProperty("fine_tuned_model")
  public void setFineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }

  /**
   **/
  public FineTune organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("organization_id")
  @NotNull
  public String getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("organization_id")
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   **/
  public FineTune status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  public FineTune hyperparams(Object hyperparams) {
    this.hyperparams = hyperparams;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hyperparams")
  @NotNull
  public Object getHyperparams() {
    return hyperparams;
  }

  @JsonProperty("hyperparams")
  public void setHyperparams(Object hyperparams) {
    this.hyperparams = hyperparams;
  }

  /**
   **/
  public FineTune trainingFiles(List<@Valid OpenAIFile> trainingFiles) {
    this.trainingFiles = trainingFiles;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("training_files")
  @NotNull
  public List<OpenAIFile> getTrainingFiles() {
    return trainingFiles;
  }

  @JsonProperty("training_files")
  public void setTrainingFiles(List<@Valid OpenAIFile> trainingFiles) {
    this.trainingFiles = trainingFiles;
  }

  public FineTune addTrainingFilesItem(OpenAIFile trainingFilesItem) {
    if (this.trainingFiles == null) {
      this.trainingFiles = new ArrayList<>();
    }

    this.trainingFiles.add(trainingFilesItem);
    return this;
  }

  public FineTune removeTrainingFilesItem(OpenAIFile trainingFilesItem) {
    if (trainingFilesItem != null && this.trainingFiles != null) {
      this.trainingFiles.remove(trainingFilesItem);
    }

    return this;
  }
  /**
   **/
  public FineTune validationFiles(List<@Valid OpenAIFile> validationFiles) {
    this.validationFiles = validationFiles;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("validation_files")
  @NotNull
  public List<OpenAIFile> getValidationFiles() {
    return validationFiles;
  }

  @JsonProperty("validation_files")
  public void setValidationFiles(List<@Valid OpenAIFile> validationFiles) {
    this.validationFiles = validationFiles;
  }

  public FineTune addValidationFilesItem(OpenAIFile validationFilesItem) {
    if (this.validationFiles == null) {
      this.validationFiles = new ArrayList<>();
    }

    this.validationFiles.add(validationFilesItem);
    return this;
  }

  public FineTune removeValidationFilesItem(OpenAIFile validationFilesItem) {
    if (validationFilesItem != null && this.validationFiles != null) {
      this.validationFiles.remove(validationFilesItem);
    }

    return this;
  }
  /**
   **/
  public FineTune resultFiles(List<@Valid OpenAIFile> resultFiles) {
    this.resultFiles = resultFiles;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("result_files")
  @NotNull
  public List<OpenAIFile> getResultFiles() {
    return resultFiles;
  }

  @JsonProperty("result_files")
  public void setResultFiles(List<@Valid OpenAIFile> resultFiles) {
    this.resultFiles = resultFiles;
  }

  public FineTune addResultFilesItem(OpenAIFile resultFilesItem) {
    if (this.resultFiles == null) {
      this.resultFiles = new ArrayList<>();
    }

    this.resultFiles.add(resultFilesItem);
    return this;
  }

  public FineTune removeResultFilesItem(OpenAIFile resultFilesItem) {
    if (resultFilesItem != null && this.resultFiles != null) {
      this.resultFiles.remove(resultFilesItem);
    }

    return this;
  }
  /**
   **/
  public FineTune events(List<@Valid FineTuneEvent> events) {
    this.events = events;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("events")
  public List<FineTuneEvent> getEvents() {
    return events;
  }

  @JsonProperty("events")
  public void setEvents(List<@Valid FineTuneEvent> events) {
    this.events = events;
  }

  public FineTune addEventsItem(FineTuneEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }

    this.events.add(eventsItem);
    return this;
  }

  public FineTune removeEventsItem(FineTuneEvent eventsItem) {
    if (eventsItem != null && this.events != null) {
      this.events.remove(eventsItem);
    }

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

