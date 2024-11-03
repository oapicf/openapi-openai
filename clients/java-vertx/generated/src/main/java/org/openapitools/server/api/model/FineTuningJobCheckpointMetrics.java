package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Metrics at the step number during the fine-tuning job.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuningJobCheckpointMetrics   {
  
  private BigDecimal step;
  private BigDecimal trainLoss;
  private BigDecimal trainMeanTokenAccuracy;
  private BigDecimal validLoss;
  private BigDecimal validMeanTokenAccuracy;
  private BigDecimal fullValidLoss;
  private BigDecimal fullValidMeanTokenAccuracy;

  public FineTuningJobCheckpointMetrics () {

  }

  public FineTuningJobCheckpointMetrics (BigDecimal step, BigDecimal trainLoss, BigDecimal trainMeanTokenAccuracy, BigDecimal validLoss, BigDecimal validMeanTokenAccuracy, BigDecimal fullValidLoss, BigDecimal fullValidMeanTokenAccuracy) {
    this.step = step;
    this.trainLoss = trainLoss;
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
    this.validLoss = validLoss;
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
    this.fullValidLoss = fullValidLoss;
    this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
  }

    
  @JsonProperty("step")
  public BigDecimal getStep() {
    return step;
  }
  public void setStep(BigDecimal step) {
    this.step = step;
  }

    
  @JsonProperty("train_loss")
  public BigDecimal getTrainLoss() {
    return trainLoss;
  }
  public void setTrainLoss(BigDecimal trainLoss) {
    this.trainLoss = trainLoss;
  }

    
  @JsonProperty("train_mean_token_accuracy")
  public BigDecimal getTrainMeanTokenAccuracy() {
    return trainMeanTokenAccuracy;
  }
  public void setTrainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
  }

    
  @JsonProperty("valid_loss")
  public BigDecimal getValidLoss() {
    return validLoss;
  }
  public void setValidLoss(BigDecimal validLoss) {
    this.validLoss = validLoss;
  }

    
  @JsonProperty("valid_mean_token_accuracy")
  public BigDecimal getValidMeanTokenAccuracy() {
    return validMeanTokenAccuracy;
  }
  public void setValidMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
  }

    
  @JsonProperty("full_valid_loss")
  public BigDecimal getFullValidLoss() {
    return fullValidLoss;
  }
  public void setFullValidLoss(BigDecimal fullValidLoss) {
    this.fullValidLoss = fullValidLoss;
  }

    
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
    return Objects.equals(step, fineTuningJobCheckpointMetrics.step) &&
        Objects.equals(trainLoss, fineTuningJobCheckpointMetrics.trainLoss) &&
        Objects.equals(trainMeanTokenAccuracy, fineTuningJobCheckpointMetrics.trainMeanTokenAccuracy) &&
        Objects.equals(validLoss, fineTuningJobCheckpointMetrics.validLoss) &&
        Objects.equals(validMeanTokenAccuracy, fineTuningJobCheckpointMetrics.validMeanTokenAccuracy) &&
        Objects.equals(fullValidLoss, fineTuningJobCheckpointMetrics.fullValidLoss) &&
        Objects.equals(fullValidMeanTokenAccuracy, fineTuningJobCheckpointMetrics.fullValidMeanTokenAccuracy);
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
