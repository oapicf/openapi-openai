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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Metrics at the step number during the fine-tuning job.
 **/
@ApiModel(description = "Metrics at the step number during the fine-tuning job.")
public class FineTuningJobCheckpointMetrics {
  
  @SerializedName("step")
  private BigDecimal step = null;
  @SerializedName("train_loss")
  private BigDecimal trainLoss = null;
  @SerializedName("train_mean_token_accuracy")
  private BigDecimal trainMeanTokenAccuracy = null;
  @SerializedName("valid_loss")
  private BigDecimal validLoss = null;
  @SerializedName("valid_mean_token_accuracy")
  private BigDecimal validMeanTokenAccuracy = null;
  @SerializedName("full_valid_loss")
  private BigDecimal fullValidLoss = null;
  @SerializedName("full_valid_mean_token_accuracy")
  private BigDecimal fullValidMeanTokenAccuracy = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getStep() {
    return step;
  }
  public void setStep(BigDecimal step) {
    this.step = step;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTrainLoss() {
    return trainLoss;
  }
  public void setTrainLoss(BigDecimal trainLoss) {
    this.trainLoss = trainLoss;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTrainMeanTokenAccuracy() {
    return trainMeanTokenAccuracy;
  }
  public void setTrainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValidLoss() {
    return validLoss;
  }
  public void setValidLoss(BigDecimal validLoss) {
    this.validLoss = validLoss;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValidMeanTokenAccuracy() {
    return validMeanTokenAccuracy;
  }
  public void setValidMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFullValidLoss() {
    return fullValidLoss;
  }
  public void setFullValidLoss(BigDecimal fullValidLoss) {
    this.fullValidLoss = fullValidLoss;
  }

  /**
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
    return (this.step == null ? fineTuningJobCheckpointMetrics.step == null : this.step.equals(fineTuningJobCheckpointMetrics.step)) &&
        (this.trainLoss == null ? fineTuningJobCheckpointMetrics.trainLoss == null : this.trainLoss.equals(fineTuningJobCheckpointMetrics.trainLoss)) &&
        (this.trainMeanTokenAccuracy == null ? fineTuningJobCheckpointMetrics.trainMeanTokenAccuracy == null : this.trainMeanTokenAccuracy.equals(fineTuningJobCheckpointMetrics.trainMeanTokenAccuracy)) &&
        (this.validLoss == null ? fineTuningJobCheckpointMetrics.validLoss == null : this.validLoss.equals(fineTuningJobCheckpointMetrics.validLoss)) &&
        (this.validMeanTokenAccuracy == null ? fineTuningJobCheckpointMetrics.validMeanTokenAccuracy == null : this.validMeanTokenAccuracy.equals(fineTuningJobCheckpointMetrics.validMeanTokenAccuracy)) &&
        (this.fullValidLoss == null ? fineTuningJobCheckpointMetrics.fullValidLoss == null : this.fullValidLoss.equals(fineTuningJobCheckpointMetrics.fullValidLoss)) &&
        (this.fullValidMeanTokenAccuracy == null ? fineTuningJobCheckpointMetrics.fullValidMeanTokenAccuracy == null : this.fullValidMeanTokenAccuracy.equals(fineTuningJobCheckpointMetrics.fullValidMeanTokenAccuracy));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.step == null ? 0: this.step.hashCode());
    result = 31 * result + (this.trainLoss == null ? 0: this.trainLoss.hashCode());
    result = 31 * result + (this.trainMeanTokenAccuracy == null ? 0: this.trainMeanTokenAccuracy.hashCode());
    result = 31 * result + (this.validLoss == null ? 0: this.validLoss.hashCode());
    result = 31 * result + (this.validMeanTokenAccuracy == null ? 0: this.validMeanTokenAccuracy.hashCode());
    result = 31 * result + (this.fullValidLoss == null ? 0: this.fullValidLoss.hashCode());
    result = 31 * result + (this.fullValidMeanTokenAccuracy == null ? 0: this.fullValidMeanTokenAccuracy.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobCheckpointMetrics {\n");
    
    sb.append("  step: ").append(step).append("\n");
    sb.append("  trainLoss: ").append(trainLoss).append("\n");
    sb.append("  trainMeanTokenAccuracy: ").append(trainMeanTokenAccuracy).append("\n");
    sb.append("  validLoss: ").append(validLoss).append("\n");
    sb.append("  validMeanTokenAccuracy: ").append(validMeanTokenAccuracy).append("\n");
    sb.append("  fullValidLoss: ").append(fullValidLoss).append("\n");
    sb.append("  fullValidMeanTokenAccuracy: ").append(fullValidMeanTokenAccuracy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
