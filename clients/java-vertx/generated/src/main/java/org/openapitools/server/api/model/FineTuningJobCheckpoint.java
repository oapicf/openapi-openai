package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.FineTuningJobCheckpointMetrics;

/**
 * The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuningJobCheckpoint   {
  
  private String id;
  private Integer createdAt;
  private String fineTunedModelCheckpoint;
  private Integer stepNumber;
  private FineTuningJobCheckpointMetrics metrics;
  private String fineTuningJobId;


  public enum ObjectEnum {
    FINE_TUNING_JOB_CHECKPOINT("fine_tuning.job.checkpoint");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;

  public FineTuningJobCheckpoint () {

  }

  public FineTuningJobCheckpoint (String id, Integer createdAt, String fineTunedModelCheckpoint, Integer stepNumber, FineTuningJobCheckpointMetrics metrics, String fineTuningJobId, ObjectEnum _object) {
    this.id = id;
    this.createdAt = createdAt;
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
    this.stepNumber = stepNumber;
    this.metrics = metrics;
    this.fineTuningJobId = fineTuningJobId;
    this._object = _object;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("fine_tuned_model_checkpoint")
  public String getFineTunedModelCheckpoint() {
    return fineTunedModelCheckpoint;
  }
  public void setFineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
    this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
  }

    
  @JsonProperty("step_number")
  public Integer getStepNumber() {
    return stepNumber;
  }
  public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }

    
  @JsonProperty("metrics")
  public FineTuningJobCheckpointMetrics getMetrics() {
    return metrics;
  }
  public void setMetrics(FineTuningJobCheckpointMetrics metrics) {
    this.metrics = metrics;
  }

    
  @JsonProperty("fine_tuning_job_id")
  public String getFineTuningJobId() {
    return fineTuningJobId;
  }
  public void setFineTuningJobId(String fineTuningJobId) {
    this.fineTuningJobId = fineTuningJobId;
  }

    
  @JsonProperty("object")
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
    return Objects.equals(id, fineTuningJobCheckpoint.id) &&
        Objects.equals(createdAt, fineTuningJobCheckpoint.createdAt) &&
        Objects.equals(fineTunedModelCheckpoint, fineTuningJobCheckpoint.fineTunedModelCheckpoint) &&
        Objects.equals(stepNumber, fineTuningJobCheckpoint.stepNumber) &&
        Objects.equals(metrics, fineTuningJobCheckpoint.metrics) &&
        Objects.equals(fineTuningJobId, fineTuningJobCheckpoint.fineTuningJobId) &&
        Objects.equals(_object, fineTuningJobCheckpoint._object);
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
