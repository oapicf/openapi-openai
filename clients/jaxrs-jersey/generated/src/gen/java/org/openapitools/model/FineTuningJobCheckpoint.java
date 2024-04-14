/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuningJobCheckpointMetrics;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
 */
@ApiModel(description = "The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. ")
@JsonPropertyOrder({
  FineTuningJobCheckpoint.JSON_PROPERTY_ID,
  FineTuningJobCheckpoint.JSON_PROPERTY_CREATED_AT,
  FineTuningJobCheckpoint.JSON_PROPERTY_FINE_TUNED_MODEL_CHECKPOINT,
  FineTuningJobCheckpoint.JSON_PROPERTY_STEP_NUMBER,
  FineTuningJobCheckpoint.JSON_PROPERTY_METRICS,
  FineTuningJobCheckpoint.JSON_PROPERTY_FINE_TUNING_JOB_ID,
  FineTuningJobCheckpoint.JSON_PROPERTY_OBJECT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTuningJobCheckpoint   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  private Integer createdAt;

  public static final String JSON_PROPERTY_FINE_TUNED_MODEL_CHECKPOINT = "fine_tuned_model_checkpoint";
  @JsonProperty(JSON_PROPERTY_FINE_TUNED_MODEL_CHECKPOINT)
  private String fineTunedModelCheckpoint;

  public static final String JSON_PROPERTY_STEP_NUMBER = "step_number";
  @JsonProperty(JSON_PROPERTY_STEP_NUMBER)
  private Integer stepNumber;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  @JsonProperty(JSON_PROPERTY_METRICS)
  private FineTuningJobCheckpointMetrics metrics;

  public static final String JSON_PROPERTY_FINE_TUNING_JOB_ID = "fine_tuning_job_id";
  @JsonProperty(JSON_PROPERTY_FINE_TUNING_JOB_ID)
  private String fineTuningJobId;

  /**
   * The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.
   */
  public enum ObjectEnum {
    FINE_TUNING_JOB_CHECKPOINT("fine_tuning.job.checkpoint");

    private String value;

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

  public static final String JSON_PROPERTY_OBJECT = "object";
  @JsonProperty(JSON_PROPERTY_OBJECT)
  private ObjectEnum _object;

  public FineTuningJobCheckpoint id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The checkpoint identifier, which can be referenced in the API endpoints.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(required = true, value = "The checkpoint identifier, which can be referenced in the API endpoints.")
  @NotNull 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FineTuningJobCheckpoint createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the checkpoint was created.
   * @return createdAt
   **/
  @JsonProperty(value = "created_at")
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the checkpoint was created.")
  @NotNull 
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public FineTuningJobCheckpoint fineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
    return this;
  }

  /**
   * The name of the fine-tuned checkpoint model that is created.
   * @return fineTunedModelCheckpoint
   **/
  @JsonProperty(value = "fine_tuned_model_checkpoint")
  @ApiModelProperty(required = true, value = "The name of the fine-tuned checkpoint model that is created.")
  @NotNull 
  public String getFineTunedModelCheckpoint() {
    return fineTunedModelCheckpoint;
  }

  public void setFineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
  }

  public FineTuningJobCheckpoint stepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
    return this;
  }

  /**
   * The step number that the checkpoint was created at.
   * @return stepNumber
   **/
  @JsonProperty(value = "step_number")
  @ApiModelProperty(required = true, value = "The step number that the checkpoint was created at.")
  @NotNull 
  public Integer getStepNumber() {
    return stepNumber;
  }

  public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }

  public FineTuningJobCheckpoint metrics(FineTuningJobCheckpointMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Get metrics
   * @return metrics
   **/
  @JsonProperty(value = "metrics")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public FineTuningJobCheckpointMetrics getMetrics() {
    return metrics;
  }

  public void setMetrics(FineTuningJobCheckpointMetrics metrics) {
    this.metrics = metrics;
  }

  public FineTuningJobCheckpoint fineTuningJobId(String fineTuningJobId) {
    this.fineTuningJobId = fineTuningJobId;
    return this;
  }

  /**
   * The name of the fine-tuning job that this checkpoint was created from.
   * @return fineTuningJobId
   **/
  @JsonProperty(value = "fine_tuning_job_id")
  @ApiModelProperty(required = true, value = "The name of the fine-tuning job that this checkpoint was created from.")
  @NotNull 
  public String getFineTuningJobId() {
    return fineTuningJobId;
  }

  public void setFineTuningJobId(String fineTuningJobId) {
    this.fineTuningJobId = fineTuningJobId;
  }

  public FineTuningJobCheckpoint _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.
   * @return _object
   **/
  @JsonProperty(value = "object")
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job.checkpoint\".")
  @NotNull 
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuningJobCheckpoint fineTuningJobCheckpoint = (FineTuningJobCheckpoint) o;
    return Objects.equals(this.id, fineTuningJobCheckpoint.id) &&
        Objects.equals(this.createdAt, fineTuningJobCheckpoint.createdAt) &&
        Objects.equals(this.fineTunedModelCheckpoint, fineTuningJobCheckpoint.fineTunedModelCheckpoint) &&
        Objects.equals(this.stepNumber, fineTuningJobCheckpoint.stepNumber) &&
        Objects.equals(this.metrics, fineTuningJobCheckpoint.metrics) &&
        Objects.equals(this.fineTuningJobId, fineTuningJobCheckpoint.fineTuningJobId) &&
        Objects.equals(this._object, fineTuningJobCheckpoint._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, fineTunedModelCheckpoint, stepNumber, metrics, fineTuningJobId, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobCheckpoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fineTunedModelCheckpoint: ").append(toIndentedString(fineTunedModelCheckpoint)).append("\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    fineTuningJobId: ").append(toIndentedString(fineTuningJobId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

