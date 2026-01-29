package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Metrics at the step number during the fine-tuning job.
 */
@ApiModel(description = "Metrics at the step number during the fine-tuning job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T10:44:59.856749186Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningJobCheckpointMetrics   {
  @JsonProperty("step")
  private BigDecimal step;

  @JsonProperty("train_loss")
  private BigDecimal trainLoss;

  @JsonProperty("train_mean_token_accuracy")
  private BigDecimal trainMeanTokenAccuracy;

  @JsonProperty("valid_loss")
  private BigDecimal validLoss;

  @JsonProperty("valid_mean_token_accuracy")
  private BigDecimal validMeanTokenAccuracy;

  @JsonProperty("full_valid_loss")
  private BigDecimal fullValidLoss;

  @JsonProperty("full_valid_mean_token_accuracy")
  private BigDecimal fullValidMeanTokenAccuracy;

  public FineTuningJobCheckpointMetrics step(BigDecimal step) {
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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

