package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
  private List<@Valid OpenAIFile> trainingFiles = new ArrayList<>();
  private List<@Valid OpenAIFile> validationFiles = new ArrayList<>();
  private List<@Valid OpenAIFile> resultFiles = new ArrayList<>();
  private List<@Valid FineTuneEvent> events;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("updated_at")
  @NotNull
  public Integer getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("fine_tuned_model")
  @NotNull
  public String getFineTunedModel() {
    return fineTunedModel;
  }
  public void setFineTunedModel(String fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("organization_id")
  @NotNull
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hyperparams")
  @NotNull
  public Object getHyperparams() {
    return hyperparams;
  }
  public void setHyperparams(Object hyperparams) {
    this.hyperparams = hyperparams;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("training_files")
  @NotNull
  @Valid
  public List<@Valid OpenAIFile> getTrainingFiles() {
    return trainingFiles;
  }
  public void setTrainingFiles(List<@Valid OpenAIFile> trainingFiles) {
    this.trainingFiles = trainingFiles;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("validation_files")
  @NotNull
  @Valid
  public List<@Valid OpenAIFile> getValidationFiles() {
    return validationFiles;
  }
  public void setValidationFiles(List<@Valid OpenAIFile> validationFiles) {
    this.validationFiles = validationFiles;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("result_files")
  @NotNull
  @Valid
  public List<@Valid OpenAIFile> getResultFiles() {
    return resultFiles;
  }
  public void setResultFiles(List<@Valid OpenAIFile> resultFiles) {
    this.resultFiles = resultFiles;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("events")
  @Valid
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

