package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.FineTuneEvent;
import org.openapitools.server.api.model.OpenAIFile;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTune   {
  
  private String id;
  private String _object;
  private Integer createdAt;
  private Integer updatedAt;
  private String model;
  private String fineTunedModel;
  private String organizationId;
  private String status;
  private Object hyperparams;
  private List<OpenAIFile> trainingFiles = new ArrayList<>();
  private List<OpenAIFile> validationFiles = new ArrayList<>();
  private List<OpenAIFile> resultFiles = new ArrayList<>();
  private List<FineTuneEvent> events;

  public FineTune () {

  }

  public FineTune (String id, String _object, Integer createdAt, Integer updatedAt, String model, String fineTunedModel, String organizationId, String status, Object hyperparams, List<OpenAIFile> trainingFiles, List<OpenAIFile> validationFiles, List<OpenAIFile> resultFiles, List<FineTuneEvent> events) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.model = model;
    this.fineTunedModel = fineTunedModel;
    this.organizationId = organizationId;
    this.status = status;
    this.hyperparams = hyperparams;
    this.trainingFiles = trainingFiles;
    this.validationFiles = validationFiles;
    this.resultFiles = resultFiles;
    this.events = events;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("updated_at")
  public Integer getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("fine_tuned_model")
  public String getFineTunedModel() {
    return fineTunedModel;
  }
  public void setFineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }

    
  @JsonProperty("organization_id")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

    
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

    
  @JsonProperty("hyperparams")
  public Object getHyperparams() {
    return hyperparams;
  }
  public void setHyperparams(Object hyperparams) {
    this.hyperparams = hyperparams;
  }

    
  @JsonProperty("training_files")
  public List<OpenAIFile> getTrainingFiles() {
    return trainingFiles;
  }
  public void setTrainingFiles(List<OpenAIFile> trainingFiles) {
    this.trainingFiles = trainingFiles;
  }

    
  @JsonProperty("validation_files")
  public List<OpenAIFile> getValidationFiles() {
    return validationFiles;
  }
  public void setValidationFiles(List<OpenAIFile> validationFiles) {
    this.validationFiles = validationFiles;
  }

    
  @JsonProperty("result_files")
  public List<OpenAIFile> getResultFiles() {
    return resultFiles;
  }
  public void setResultFiles(List<OpenAIFile> resultFiles) {
    this.resultFiles = resultFiles;
  }

    
  @JsonProperty("events")
  public List<FineTuneEvent> getEvents() {
    return events;
  }
  public void setEvents(List<FineTuneEvent> events) {
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
