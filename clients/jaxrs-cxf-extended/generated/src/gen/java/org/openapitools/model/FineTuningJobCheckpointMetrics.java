package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Metrics at the step number during the fine-tuning job.
 */
@ApiModel(description="Metrics at the step number during the fine-tuning job.")

public class FineTuningJobCheckpointMetrics  {
  
  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal step;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal trainLoss;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal trainMeanTokenAccuracy;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal validLoss;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal validMeanTokenAccuracy;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal fullValidLoss;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal fullValidMeanTokenAccuracy;
 /**
  * Get step
  * @return step
  */
  @JsonProperty("step")
  public BigDecimal getStep() {
    return step;
  }

  /**
   * Sets the <code>step</code> property.
   */
 public void setStep(BigDecimal step) {
    this.step = step;
  }

  /**
   * Sets the <code>step</code> property.
   */
  public FineTuningJobCheckpointMetrics step(BigDecimal step) {
    this.step = step;
    return this;
  }

 /**
  * Get trainLoss
  * @return trainLoss
  */
  @JsonProperty("train_loss")
  public BigDecimal getTrainLoss() {
    return trainLoss;
  }

  /**
   * Sets the <code>trainLoss</code> property.
   */
 public void setTrainLoss(BigDecimal trainLoss) {
    this.trainLoss = trainLoss;
  }

  /**
   * Sets the <code>trainLoss</code> property.
   */
  public FineTuningJobCheckpointMetrics trainLoss(BigDecimal trainLoss) {
    this.trainLoss = trainLoss;
    return this;
  }

 /**
  * Get trainMeanTokenAccuracy
  * @return trainMeanTokenAccuracy
  */
  @JsonProperty("train_mean_token_accuracy")
  public BigDecimal getTrainMeanTokenAccuracy() {
    return trainMeanTokenAccuracy;
  }

  /**
   * Sets the <code>trainMeanTokenAccuracy</code> property.
   */
 public void setTrainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
  }

  /**
   * Sets the <code>trainMeanTokenAccuracy</code> property.
   */
  public FineTuningJobCheckpointMetrics trainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
    return this;
  }

 /**
  * Get validLoss
  * @return validLoss
  */
  @JsonProperty("valid_loss")
  public BigDecimal getValidLoss() {
    return validLoss;
  }

  /**
   * Sets the <code>validLoss</code> property.
   */
 public void setValidLoss(BigDecimal validLoss) {
    this.validLoss = validLoss;
  }

  /**
   * Sets the <code>validLoss</code> property.
   */
  public FineTuningJobCheckpointMetrics validLoss(BigDecimal validLoss) {
    this.validLoss = validLoss;
    return this;
  }

 /**
  * Get validMeanTokenAccuracy
  * @return validMeanTokenAccuracy
  */
  @JsonProperty("valid_mean_token_accuracy")
  public BigDecimal getValidMeanTokenAccuracy() {
    return validMeanTokenAccuracy;
  }

  /**
   * Sets the <code>validMeanTokenAccuracy</code> property.
   */
 public void setValidMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
  }

  /**
   * Sets the <code>validMeanTokenAccuracy</code> property.
   */
  public FineTuningJobCheckpointMetrics validMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
    return this;
  }

 /**
  * Get fullValidLoss
  * @return fullValidLoss
  */
  @JsonProperty("full_valid_loss")
  public BigDecimal getFullValidLoss() {
    return fullValidLoss;
  }

  /**
   * Sets the <code>fullValidLoss</code> property.
   */
 public void setFullValidLoss(BigDecimal fullValidLoss) {
    this.fullValidLoss = fullValidLoss;
  }

  /**
   * Sets the <code>fullValidLoss</code> property.
   */
  public FineTuningJobCheckpointMetrics fullValidLoss(BigDecimal fullValidLoss) {
    this.fullValidLoss = fullValidLoss;
    return this;
  }

 /**
  * Get fullValidMeanTokenAccuracy
  * @return fullValidMeanTokenAccuracy
  */
  @JsonProperty("full_valid_mean_token_accuracy")
  public BigDecimal getFullValidMeanTokenAccuracy() {
    return fullValidMeanTokenAccuracy;
  }

  /**
   * Sets the <code>fullValidMeanTokenAccuracy</code> property.
   */
 public void setFullValidMeanTokenAccuracy(BigDecimal fullValidMeanTokenAccuracy) {
    this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
  }

  /**
   * Sets the <code>fullValidMeanTokenAccuracy</code> property.
   */
  public FineTuningJobCheckpointMetrics fullValidMeanTokenAccuracy(BigDecimal fullValidMeanTokenAccuracy) {
    this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

