package apimodels;

import apimodels.FineTuningJobCheckpointMetrics;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FineTuningJobCheckpoint   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("fine_tuned_model_checkpoint")
  @NotNull

  private String fineTunedModelCheckpoint;

  @JsonProperty("step_number")
  @NotNull

  private Integer stepNumber;

  @JsonProperty("metrics")
  @NotNull
@Valid

  private FineTuningJobCheckpointMetrics metrics;

  @JsonProperty("fine_tuning_job_id")
  @NotNull

  private String fineTuningJobId;

  /**
   * The object type, which is always \"fine_tuning.job.checkpoint\".
   */
  public enum ObjectEnum {
    FINE_TUNING_JOB_CHECKPOINT("fine_tuning.job.checkpoint");

    private final String value;

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

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  public FineTuningJobCheckpoint id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The checkpoint identifier, which can be referenced in the API endpoints.
   * @return id
  **/
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
   * The object type, which is always \"fine_tuning.job.checkpoint\".
   * @return _object
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

