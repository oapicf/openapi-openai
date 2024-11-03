/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.FineTuningJobCheckpointMetrics;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
 **/
@ApiModel(description = "The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. ")
public class FineTuningJobCheckpoint {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("created_at")
  private Integer createdAt = null;
  @SerializedName("fine_tuned_model_checkpoint")
  private String fineTunedModelCheckpoint = null;
  @SerializedName("step_number")
  private Integer stepNumber = null;
  @SerializedName("metrics")
  private FineTuningJobCheckpointMetrics metrics = null;
  @SerializedName("fine_tuning_job_id")
  private String fineTuningJobId = null;
  public enum _objectEnum {
     fine_tuning.job.checkpoint, 
  };
  @SerializedName("object")
  private _objectEnum _object = null;

  /**
   * The checkpoint identifier, which can be referenced in the API endpoints.
   **/
  @ApiModelProperty(required = true, value = "The checkpoint identifier, which can be referenced in the API endpoints.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Unix timestamp (in seconds) for when the checkpoint was created.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the checkpoint was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The name of the fine-tuned checkpoint model that is created.
   **/
  @ApiModelProperty(required = true, value = "The name of the fine-tuned checkpoint model that is created.")
  public String getFineTunedModelCheckpoint() {
    return fineTunedModelCheckpoint;
  }
  public void setFineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
  }

  /**
   * The step number that the checkpoint was created at.
   **/
  @ApiModelProperty(required = true, value = "The step number that the checkpoint was created at.")
  public Integer getStepNumber() {
    return stepNumber;
  }
  public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FineTuningJobCheckpointMetrics getMetrics() {
    return metrics;
  }
  public void setMetrics(FineTuningJobCheckpointMetrics metrics) {
    this.metrics = metrics;
  }

  /**
   * The name of the fine-tuning job that this checkpoint was created from.
   **/
  @ApiModelProperty(required = true, value = "The name of the fine-tuning job that this checkpoint was created from.")
  public String getFineTuningJobId() {
    return fineTuningJobId;
  }
  public void setFineTuningJobId(String fineTuningJobId) {
    this.fineTuningJobId = fineTuningJobId;
  }

  /**
   * The object type, which is always \"fine_tuning.job.checkpoint\".
   **/
  @ApiModelProperty(required = true, value = "The object type, which is always \"fine_tuning.job.checkpoint\".")
  public _objectEnum getObject() {
    return _object;
  }
  public void setObject(_objectEnum _object) {
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
    return (this.id == null ? fineTuningJobCheckpoint.id == null : this.id.equals(fineTuningJobCheckpoint.id)) &&
        (this.createdAt == null ? fineTuningJobCheckpoint.createdAt == null : this.createdAt.equals(fineTuningJobCheckpoint.createdAt)) &&
        (this.fineTunedModelCheckpoint == null ? fineTuningJobCheckpoint.fineTunedModelCheckpoint == null : this.fineTunedModelCheckpoint.equals(fineTuningJobCheckpoint.fineTunedModelCheckpoint)) &&
        (this.stepNumber == null ? fineTuningJobCheckpoint.stepNumber == null : this.stepNumber.equals(fineTuningJobCheckpoint.stepNumber)) &&
        (this.metrics == null ? fineTuningJobCheckpoint.metrics == null : this.metrics.equals(fineTuningJobCheckpoint.metrics)) &&
        (this.fineTuningJobId == null ? fineTuningJobCheckpoint.fineTuningJobId == null : this.fineTuningJobId.equals(fineTuningJobCheckpoint.fineTuningJobId)) &&
        (this._object == null ? fineTuningJobCheckpoint._object == null : this._object.equals(fineTuningJobCheckpoint._object));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.fineTunedModelCheckpoint == null ? 0: this.fineTunedModelCheckpoint.hashCode());
    result = 31 * result + (this.stepNumber == null ? 0: this.stepNumber.hashCode());
    result = 31 * result + (this.metrics == null ? 0: this.metrics.hashCode());
    result = 31 * result + (this.fineTuningJobId == null ? 0: this.fineTuningJobId.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobCheckpoint {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  fineTunedModelCheckpoint: ").append(fineTunedModelCheckpoint).append("\n");
    sb.append("  stepNumber: ").append(stepNumber).append("\n");
    sb.append("  metrics: ").append(metrics).append("\n");
    sb.append("  fineTuningJobId: ").append(fineTuningJobId).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
