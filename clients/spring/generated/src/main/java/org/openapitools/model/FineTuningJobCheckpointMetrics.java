package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Metrics at the step number during the fine-tuning job.
 */

@Schema(name = "FineTuningJobCheckpoint_metrics", description = "Metrics at the step number during the fine-tuning job.")
@JsonTypeName("FineTuningJobCheckpoint_metrics")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-03T11:16:04.738790927Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FineTuningJobCheckpointMetrics {

  private BigDecimal step;

  private BigDecimal trainLoss;

  private BigDecimal trainMeanTokenAccuracy;

  private BigDecimal validLoss;

  private BigDecimal validMeanTokenAccuracy;

  private BigDecimal fullValidLoss;

  private BigDecimal fullValidMeanTokenAccuracy;

  public FineTuningJobCheckpointMetrics step(BigDecimal step) {
    this.step = step;
    return this;
  }

  /**
   * Get step
   * @return step
   */
  @Valid 
  @Schema(name = "step", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("step")
  public BigDecimal getStep() {
    return step;
  }

  public void setStep(BigDecimal step) {
    this.step = step;
  }

  public FineTuningJobCheckpointMetrics trainLoss(BigDecimal trainLoss) {
    this.trainLoss = trainLoss;
    return this;
  }

  /**
   * Get trainLoss
   * @return trainLoss
   */
  @Valid 
  @Schema(name = "train_loss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("train_loss")
  public BigDecimal getTrainLoss() {
    return trainLoss;
  }

  public void setTrainLoss(BigDecimal trainLoss) {
    this.trainLoss = trainLoss;
  }

  public FineTuningJobCheckpointMetrics trainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
    return this;
  }

  /**
   * Get trainMeanTokenAccuracy
   * @return trainMeanTokenAccuracy
   */
  @Valid 
  @Schema(name = "train_mean_token_accuracy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("train_mean_token_accuracy")
  public BigDecimal getTrainMeanTokenAccuracy() {
    return trainMeanTokenAccuracy;
  }

  public void setTrainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
  }

  public FineTuningJobCheckpointMetrics validLoss(BigDecimal validLoss) {
    this.validLoss = validLoss;
    return this;
  }

  /**
   * Get validLoss
   * @return validLoss
   */
  @Valid 
  @Schema(name = "valid_loss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid_loss")
  public BigDecimal getValidLoss() {
    return validLoss;
  }

  public void setValidLoss(BigDecimal validLoss) {
    this.validLoss = validLoss;
  }

  public FineTuningJobCheckpointMetrics validMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
    return this;
  }

  /**
   * Get validMeanTokenAccuracy
   * @return validMeanTokenAccuracy
   */
  @Valid 
  @Schema(name = "valid_mean_token_accuracy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid_mean_token_accuracy")
  public BigDecimal getValidMeanTokenAccuracy() {
    return validMeanTokenAccuracy;
  }

  public void setValidMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
  }

  public FineTuningJobCheckpointMetrics fullValidLoss(BigDecimal fullValidLoss) {
    this.fullValidLoss = fullValidLoss;
    return this;
  }

  /**
   * Get fullValidLoss
   * @return fullValidLoss
   */
  @Valid 
  @Schema(name = "full_valid_loss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full_valid_loss")
  public BigDecimal getFullValidLoss() {
    return fullValidLoss;
  }

  public void setFullValidLoss(BigDecimal fullValidLoss) {
    this.fullValidLoss = fullValidLoss;
  }

  public FineTuningJobCheckpointMetrics fullValidMeanTokenAccuracy(BigDecimal fullValidMeanTokenAccuracy) {
    this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
    return this;
  }

  /**
   * Get fullValidMeanTokenAccuracy
   * @return fullValidMeanTokenAccuracy
   */
  @Valid 
  @Schema(name = "full_valid_mean_token_accuracy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full_valid_mean_token_accuracy")
  public BigDecimal getFullValidMeanTokenAccuracy() {
    return fullValidMeanTokenAccuracy;
  }

  public void setFullValidMeanTokenAccuracy(BigDecimal fullValidMeanTokenAccuracy) {
    this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics = (FineTuningJobCheckpointMetrics) o;
    return Objects.equals(this.step, fineTuningJobCheckpointMetrics.step) &&
        Objects.equals(this.trainLoss, fineTuningJobCheckpointMetrics.trainLoss) &&
        Objects.equals(this.trainMeanTokenAccuracy, fineTuningJobCheckpointMetrics.trainMeanTokenAccuracy) &&
        Objects.equals(this.validLoss, fineTuningJobCheckpointMetrics.validLoss) &&
        Objects.equals(this.validMeanTokenAccuracy, fineTuningJobCheckpointMetrics.validMeanTokenAccuracy) &&
        Objects.equals(this.fullValidLoss, fineTuningJobCheckpointMetrics.fullValidLoss) &&
        Objects.equals(this.fullValidMeanTokenAccuracy, fineTuningJobCheckpointMetrics.fullValidMeanTokenAccuracy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, trainLoss, trainMeanTokenAccuracy, validLoss, validMeanTokenAccuracy, fullValidLoss, fullValidMeanTokenAccuracy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobCheckpointMetrics {\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    trainLoss: ").append(toIndentedString(trainLoss)).append("\n");
    sb.append("    trainMeanTokenAccuracy: ").append(toIndentedString(trainMeanTokenAccuracy)).append("\n");
    sb.append("    validLoss: ").append(toIndentedString(validLoss)).append("\n");
    sb.append("    validMeanTokenAccuracy: ").append(toIndentedString(validMeanTokenAccuracy)).append("\n");
    sb.append("    fullValidLoss: ").append(toIndentedString(fullValidLoss)).append("\n");
    sb.append("    fullValidMeanTokenAccuracy: ").append(toIndentedString(fullValidMeanTokenAccuracy)).append("\n");
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

