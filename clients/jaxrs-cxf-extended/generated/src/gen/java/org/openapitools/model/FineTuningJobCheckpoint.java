package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.FineTuningJobCheckpointMetrics;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
 */
@ApiModel(description="The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. ")

public class FineTuningJobCheckpoint  {
  
 /**
  * The checkpoint identifier, which can be referenced in the API endpoints.
  */
  @ApiModelProperty(required = true, value = "The checkpoint identifier, which can be referenced in the API endpoints.")
  private String id;

 /**
  * The Unix timestamp (in seconds) for when the checkpoint was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the checkpoint was created.")
  private Integer createdAt;

 /**
  * The name of the fine-tuned checkpoint model that is created.
  */
  @ApiModelProperty(required = true, value = "The name of the fine-tuned checkpoint model that is created.")
  private String fineTunedModelCheckpoint;

 /**
  * The step number that the checkpoint was created at.
  */
  @ApiModelProperty(required = true, value = "The step number that the checkpoint was created at.")
  private Integer stepNumber;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private FineTuningJobCheckpointMetrics metrics;

 /**
  * The name of the fine-tuning job that this checkpoint was created from.
  */
  @ApiModelProperty(required = true, value = "The name of the fine-tuning job that this checkpoint was created from.")
  private String fineTuningJobId;

public enum ObjectEnum {

    @JsonProperty("fine_tuning.job.checkpoint") FINE_TUNING_JOB_CHECKPOINT(String.valueOf("fine_tuning.job.checkpoint"));

    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The object type, which is always \"fine_tuning.job.checkpoint\".
  */
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job.checkpoint\".")
  private ObjectEnum _object;
 /**
  * The checkpoint identifier, which can be referenced in the API endpoints.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public FineTuningJobCheckpoint id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the checkpoint was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public FineTuningJobCheckpoint createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The name of the fine-tuned checkpoint model that is created.
  * @return fineTunedModelCheckpoint
  */
  @JsonProperty("fine_tuned_model_checkpoint")
  @NotNull
  public String getFineTunedModelCheckpoint() {
    return fineTunedModelCheckpoint;
  }

  /**
   * Sets the <code>fineTunedModelCheckpoint</code> property.
   */
 public void setFineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
  }

  /**
   * Sets the <code>fineTunedModelCheckpoint</code> property.
   */
  public FineTuningJobCheckpoint fineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
    return this;
  }

 /**
  * The step number that the checkpoint was created at.
  * @return stepNumber
  */
  @JsonProperty("step_number")
  @NotNull
  public Integer getStepNumber() {
    return stepNumber;
  }

  /**
   * Sets the <code>stepNumber</code> property.
   */
 public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }

  /**
   * Sets the <code>stepNumber</code> property.
   */
  public FineTuningJobCheckpoint stepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
    return this;
  }

 /**
  * Get metrics
  * @return metrics
  */
  @JsonProperty("metrics")
  @NotNull
  public FineTuningJobCheckpointMetrics getMetrics() {
    return metrics;
  }

  /**
   * Sets the <code>metrics</code> property.
   */
 public void setMetrics(FineTuningJobCheckpointMetrics metrics) {
    this.metrics = metrics;
  }

  /**
   * Sets the <code>metrics</code> property.
   */
  public FineTuningJobCheckpoint metrics(FineTuningJobCheckpointMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

 /**
  * The name of the fine-tuning job that this checkpoint was created from.
  * @return fineTuningJobId
  */
  @JsonProperty("fine_tuning_job_id")
  @NotNull
  public String getFineTuningJobId() {
    return fineTuningJobId;
  }

  /**
   * Sets the <code>fineTuningJobId</code> property.
   */
 public void setFineTuningJobId(String fineTuningJobId) {
    this.fineTuningJobId = fineTuningJobId;
  }

  /**
   * Sets the <code>fineTuningJobId</code> property.
   */
  public FineTuningJobCheckpoint fineTuningJobId(String fineTuningJobId) {
    this.fineTuningJobId = fineTuningJobId;
    return this;
  }

 /**
  * The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public FineTuningJobCheckpoint _object(ObjectEnum _object) {
    this._object = _object;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

