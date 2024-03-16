package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTuneEvent;
import org.openapitools.model.OpenAIFile;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-16T01:12:27.532392463Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTune   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("object")
  private String _object;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("updated_at")
  private Integer updatedAt;

  @JsonProperty("model")
  private String model;

  @JsonProperty("fine_tuned_model")
  private String fineTunedModel;

  @JsonProperty("organization_id")
  private String organizationId;

  @JsonProperty("status")
  private String status;

  @JsonProperty("hyperparams")
  private Object hyperparams;

  @JsonProperty("training_files")
  private List<OpenAIFile> trainingFiles = new ArrayList<>();

  @JsonProperty("validation_files")
  private List<OpenAIFile> validationFiles = new ArrayList<>();

  @JsonProperty("result_files")
  private List<OpenAIFile> resultFiles = new ArrayList<>();

  @JsonProperty("events")
  private List<FineTuneEvent> events = null;

  /**
   **/
  public FineTune id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
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
  public String getObject() {
    return _object;
  }
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
  public Integer getCreatedAt() {
    return createdAt;
  }
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
  public Integer getUpdatedAt() {
    return updatedAt;
  }
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
  public String getModel() {
    return model;
  }
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
  public String getFineTunedModel() {
    return fineTunedModel;
  }
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
  public String getOrganizationId() {
    return organizationId;
  }
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
  public String getStatus() {
    return status;
  }
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
  public Object getHyperparams() {
    return hyperparams;
  }
  public void setHyperparams(Object hyperparams) {
    this.hyperparams = hyperparams;
  }

  /**
   **/
  public FineTune trainingFiles(List<OpenAIFile> trainingFiles) {
    this.trainingFiles = trainingFiles;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("training_files")
  public List<OpenAIFile> getTrainingFiles() {
    return trainingFiles;
  }
  public void setTrainingFiles(List<OpenAIFile> trainingFiles) {
    this.trainingFiles = trainingFiles;
  }

  /**
   **/
  public FineTune validationFiles(List<OpenAIFile> validationFiles) {
    this.validationFiles = validationFiles;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("validation_files")
  public List<OpenAIFile> getValidationFiles() {
    return validationFiles;
  }
  public void setValidationFiles(List<OpenAIFile> validationFiles) {
    this.validationFiles = validationFiles;
  }

  /**
   **/
  public FineTune resultFiles(List<OpenAIFile> resultFiles) {
    this.resultFiles = resultFiles;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("result_files")
  public List<OpenAIFile> getResultFiles() {
    return resultFiles;
  }
  public void setResultFiles(List<OpenAIFile> resultFiles) {
    this.resultFiles = resultFiles;
  }

  /**
   **/
  public FineTune events(List<FineTuneEvent> events) {
    this.events = events;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

