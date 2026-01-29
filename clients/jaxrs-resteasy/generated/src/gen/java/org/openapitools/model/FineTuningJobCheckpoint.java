package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuningJobCheckpointMetrics;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T10:45:28.938980301Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningJobCheckpoint   {
  
  private String id;
  private Integer createdAt;
  private String fineTunedModelCheckpoint;
  private Integer stepNumber;
  private FineTuningJobCheckpointMetrics metrics;
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
  }

  private ObjectEnum _object;

  /**
   * The checkpoint identifier, which can be referenced in the API endpoints.
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("metrics")
  @NotNull
  @Valid
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

