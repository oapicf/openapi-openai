package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuningJobCheckpointMetrics;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. ")
public class FineTuningJobCheckpoint   {
  
  private String id;

  private Integer createdAt;

  private String fineTunedModelCheckpoint;

  private Integer stepNumber;

  private FineTuningJobCheckpointMetrics metrics;

  private String fineTuningJobId;


public enum ObjectEnum {

    @JsonProperty("fine_tuning.job.checkpoint") FINE_TUNING_JOB_CHECKPOINT(String.valueOf("fine_tuning.job.checkpoint"));


    private String value;

    ObjectEnum(String v) {
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

  private ObjectEnum _object;

  /**
   * The checkpoint identifier, which can be referenced in the API endpoints.
   **/
  public FineTuningJobCheckpoint id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The checkpoint identifier, which can be referenced in the API endpoints.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The Unix timestamp (in seconds) for when the checkpoint was created.
   **/
  public FineTuningJobCheckpoint createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the checkpoint was created.")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * The name of the fine-tuned checkpoint model that is created.
   **/
  public FineTuningJobCheckpoint fineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the fine-tuned checkpoint model that is created.")
  @JsonProperty("fine_tuned_model_checkpoint")
  @NotNull
  public String getFineTunedModelCheckpoint() {
    return fineTunedModelCheckpoint;
  }
  public void setFineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
  }


  /**
   * The step number that the checkpoint was created at.
   **/
  public FineTuningJobCheckpoint stepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The step number that the checkpoint was created at.")
  @JsonProperty("step_number")
  @NotNull
  public Integer getStepNumber() {
    return stepNumber;
  }
  public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }


  /**
   **/
  public FineTuningJobCheckpoint metrics(FineTuningJobCheckpointMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("metrics")
  @NotNull
  public FineTuningJobCheckpointMetrics getMetrics() {
    return metrics;
  }
  public void setMetrics(FineTuningJobCheckpointMetrics metrics) {
    this.metrics = metrics;
  }


  /**
   * The name of the fine-tuning job that this checkpoint was created from.
   **/
  public FineTuningJobCheckpoint fineTuningJobId(String fineTuningJobId) {
    this.fineTuningJobId = fineTuningJobId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the fine-tuning job that this checkpoint was created from.")
  @JsonProperty("fine_tuning_job_id")
  @NotNull
  public String getFineTuningJobId() {
    return fineTuningJobId;
  }
  public void setFineTuningJobId(String fineTuningJobId) {
    this.fineTuningJobId = fineTuningJobId;
  }


  /**
   * The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.
   **/
  public FineTuningJobCheckpoint _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job.checkpoint\".")
  @JsonProperty("object")
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

