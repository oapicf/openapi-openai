package org.openapitools.model;

import org.openapitools.model.FineTuningJobCheckpointMetrics;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
 */
public class FineTuningJobCheckpoint implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The checkpoint identifier, which can be referenced in the API endpoints.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The Unix timestamp (in seconds) for when the checkpoint was created.
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  /**
   * The name of the fine-tuned checkpoint model that is created.
   */
  @JsonProperty("fine_tuned_model_checkpoint")
  private String fineTunedModelCheckpoint;

  /**
   * The step number that the checkpoint was created at.
   */
  @JsonProperty("step_number")
  private Integer stepNumber;

  @JsonProperty("metrics")
  private FineTuningJobCheckpointMetrics metrics;

  /**
   * The name of the fine-tuning job that this checkpoint was created from.
   */
  @JsonProperty("fine_tuning_job_id")
  private String fineTuningJobId;

  /**
   * The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The checkpoint identifier, which can be referenced in the API endpoints.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Unix timestamp (in seconds) for when the checkpoint was created.
   * @return createdAt
   */
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The name of the fine-tuned checkpoint model that is created.
   * @return fineTunedModelCheckpoint
   */
  public String getFineTunedModelCheckpoint() {
    return fineTunedModelCheckpoint;
  }

  public void setFineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
  }

  /**
   * The step number that the checkpoint was created at.
   * @return stepNumber
   */
  public Integer getStepNumber() {
    return stepNumber;
  }

  public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }

  /**
   * 
   * @return metrics
   */
  public FineTuningJobCheckpointMetrics getMetrics() {
    return metrics;
  }

  public void setMetrics(FineTuningJobCheckpointMetrics metrics) {
    this.metrics = metrics;
  }

  /**
   * The name of the fine-tuning job that this checkpoint was created from.
   * @return fineTuningJobId
   */
  public String getFineTuningJobId() {
    return fineTuningJobId;
  }

  public void setFineTuningJobId(String fineTuningJobId) {
    this.fineTuningJobId = fineTuningJobId;
  }

  /**
   * The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
